package model;

public class AddCustomer {

     private String Name;
     private String Idnumber;
     private String Telno;
     private String Email;
     private String Address;

    public AddCustomer() {
    }

    public AddCustomer(String name, String idnumber, String telno, String email, String address) {
        Name = name;
        Idnumber = idnumber;
        Telno = telno;
        Email = email;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIdnumber() {
        return Idnumber;
    }

    public void setIdnumber(String idnumber) {
        Idnumber = idnumber;
    }

    public String getTelno() {
        return Telno;
    }

    public void setTelno(String telno) {
        Telno = telno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "AddCustomer{" +
                "Name='" + Name + '\'' +
                ", Idnumber='" + Idnumber + '\'' +
                ", Telno='" + Telno + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
