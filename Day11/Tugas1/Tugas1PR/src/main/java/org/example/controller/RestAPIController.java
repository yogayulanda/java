package org.example.controller;


import javafx.scene.chart.StackedAreaChart;
import org.example.model.Staff;
import org.example.service.StaffService;
import org.example.util.CustomErrorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api") // URL TESTING
public class RestAPIController {

    public static final Logger logger = LoggerFactory.getLogger(RestAPIController.class);

    @Autowired
    StaffService staffService; //deklarasi pemanggil class StaffServiceImpl

    // -------------------------- GET ALL STAFF --------------------------
    @RequestMapping(value = "/staff/", method = RequestMethod.GET) //url dan method yang akan dipakai
    public ResponseEntity<ArrayList<Staff>> listAllStaff() { // Represents the entire HTTP response.
        ArrayList<Staff> staffs = staffService.findAllStaff();

        if (staffs.isEmpty()) {
            return new ResponseEntity<>(staffs, HttpStatus.NOT_FOUND); // jika kosong maka Status NOT FOUND
        }
        return new ResponseEntity<>(staffs, HttpStatus.OK); //Show Array List and Status OK
    }

    // -------------------------- GET STAFF BY ID  --------------------------
    @RequestMapping(value = "/staff/{IDKaryawan}", method = RequestMethod.GET)
    public ResponseEntity<?> getStaff(@PathVariable("IDKaryawan") long IDKaryawan) {
        logger.info("Fetching staff with ID {}", IDKaryawan);
        Staff staffs = staffService.findById(IDKaryawan);

        if (staffs == null) {
            logger.error("Staff dengan ID {} tidak ditemukan!", IDKaryawan);
            return new ResponseEntity<>(new CustomErrorType("Staff dengan ID: " +
                    IDKaryawan + " tidak ditemukan!"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(staffs, HttpStatus.OK);
    }

    // -------------------------- CREATE STAFF  --------------------------
    @RequestMapping(value = "/staff/", method = RequestMethod.POST)
    public ResponseEntity<?> newStaff(@RequestBody Staff staffs) {
        logger.info("Memasukkan staf baru {}", staffs);

        if (staffService.isStaffExist(staffs)) {
            logger.error("Staff dengan nama {} sudah telah tersedia!", staffs.getNama());
            return new ResponseEntity<>(new CustomErrorType("Staff dengan nama " +
                    staffs.getNama() + " telah tersedia!"), HttpStatus.CONFLICT);
        }
        staffService.saveStaff(staffs);
        return new ResponseEntity<>(staffs, HttpStatus.OK);
    }

    // -------------------------- EDIT STAFF --------------------------
    @RequestMapping(value = "/staff/{IDKaryawan}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateStaff(@PathVariable("IDKaryawan") long IDKaryawan, @RequestBody Staff staffs) {
        logger.info("Edit karyawan dengan ID {}", IDKaryawan);

        Staff thisStaff = staffService.findById(IDKaryawan);

        if (thisStaff == null) {
            logger.error("Gagal meng-update staff. Staff dengan ID {} tidak ada.", IDKaryawan);
            return new ResponseEntity<>(new CustomErrorType("Gagal update staff. Staff dengan ID " +
                    IDKaryawan + " tidak ada."), HttpStatus.NOT_FOUND);
        }

        thisStaff.setNama(staffs.getNama());
        thisStaff.setEmail(staffs.getEmail());
        thisStaff.setPulsa(staffs.getPulsa());
        thisStaff.setGajiPokok(staffs.getGajiPokok());
        thisStaff.setMakan(staffs.getMakan());
        thisStaff.setAbsensiHari(staffs.getAbsensiHari());

        staffService.updateStaff(thisStaff);
        return new ResponseEntity<>(thisStaff, HttpStatus.OK);
    }

    // -------------------------- DELETE STAFF BY ID  ---------------------------
    @RequestMapping(value = "/staff/{IDKaryawan}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletebyID(@PathVariable("IDKaryawan") long IDKaryawan) {
        logger.info("Fetching and deleting staff with ID {}", IDKaryawan);

        Staff staffs = staffService.findById(IDKaryawan);
        if (staffs == null) {
            logger.info("Staff dengan ID {} tidak pernah ada", IDKaryawan);
            return new ResponseEntity<>(new CustomErrorType("Tidak bisa menghapus staff. Staff dengan ID" +
                    IDKaryawan + " tidak ada."), HttpStatus.NOT_FOUND);
        }
        staffService.deletStaffById(IDKaryawan);
        return new ResponseEntity<Staff>(HttpStatus.NO_CONTENT);
    }

    // -------------------------- DELETE ALL STAFF --------------------------
    @RequestMapping(value = "/staff/", method = RequestMethod.DELETE)
    public ResponseEntity<Staff> deleteAllStaff() {
        logger.info("Hapus seluruh staff");

        staffService.deletAll();
        return new ResponseEntity<Staff>(HttpStatus.NO_CONTENT);
    }
}
