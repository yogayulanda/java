package org.example.service;

import org.example.model.Staff;

import java.util.ArrayList;
//3
// Metod-metod yang ada di staff
public interface StaffService {
    Staff findById (long IDKaryawan);
    Staff findByName (String nama);

    void saveStaff(Staff staff);
    void updateStaff (Staff staff);
    void deletStaffById (long IDKaryawan);

    ArrayList<Staff> findAllStaff();

    void deletAll();

    boolean isStaffExist(Staff staff);
}
