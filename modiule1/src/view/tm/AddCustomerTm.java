package view.tm;

import javafx.scene.control.Button;

public class AddCustomerTm {
     private String Name;
     private String ID;
     private String TelNo;
     private String Email;
     private String Address;
        private Button btn;

    public AddCustomerTm() {
    }

    public AddCustomerTm(String name, String ID, String telNo, String email, String address, Button btn) {
        Name = name;
        this.ID = ID;
        TelNo = telNo;
        Email = email;
        Address = address;
        this.btn = btn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTelNo() {
        return TelNo;
    }

    public void setTelNo(String telNo) {
        TelNo = telNo;
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "AddCustomerTm{" +
                "Name='" + Name + '\'' +
                ", ID='" + ID + '\'' +
                ", TelNo='" + TelNo + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                ", btn=" + btn +
                '}';
    }
}
