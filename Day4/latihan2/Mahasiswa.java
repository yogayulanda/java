import java.util.*;
public class Mahasiswa{
public static void main(String args[]){
//Creating user-defined class objects
Student s1=new Student(01,"Yoga","Laki-Laki");
Student s2=new Student(02,"Feni","Perempuan");
Student s3=new Student(03,"Ahmad","Laki-Laki");
//creating arraylist
ArrayList<Student> al=new ArrayList<Student>();
al.add(s1);//adding Student class object
al.add(s2);
al.add(s3);
//Getting Iterator
Iterator itr=al.iterator();
//traversing elements of ArrayList object
while(itr.hasNext()){
Student st=(Student)itr.next();
System.out.println("\nID Mahasiswa : "+st.id+"\nNama Mahasiswa : "+st.nama+"\nJenis Kelamin : "+st.JK);
}
}
}

class Student{
    int id;
    String nama;
    String JK;
    Student(int id,String nama,String JK){
        this.id=id;
        this.nama=nama;
        this.JK=JK;
}
}