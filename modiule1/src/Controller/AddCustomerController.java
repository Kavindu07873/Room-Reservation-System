package Controller;

import com.jfoenix.controls.JFXTextField;
import db.AddCustomerDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.AddCustomer;
import view.tm.AddCustomerTm;

import java.util.Optional;

public class AddCustomerController {
    public JFXTextField txtName;
    public JFXTextField txtId;
    public JFXTextField txtTelNo;
    public JFXTextField txtEmail;
    public TableColumn colName;
    public TableColumn colID;
    public TableColumn colTelNo;
    public TableColumn ColEmail;
    public TableColumn colAddress;
    public TableColumn colDelete;
    public TableView<AddCustomerTm> tblAddCustomer;
    public JFXTextField txtAddress;


    public void initializer(){

        loadAllAddCustomer();

        colName.setCellValueFactory(new PropertyValueFactory("Name"));
        colID.setCellValueFactory(new PropertyValueFactory("ID"));
        colTelNo.setCellValueFactory(new PropertyValueFactory("TelNo"));
     ColEmail.setCellValueFactory(new PropertyValueFactory("Email"));
       colAddress .setCellValueFactory(new PropertyValueFactory("Address"));
        colDelete.setCellValueFactory(new PropertyValueFactory("btn"));


        tblAddCustomer.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            setData(newValue);

        });
    }

    private void setData(AddCustomerTm tm) {
        txtName.setText(tm.getName());
        txtId.setText(tm.getID());
        txtTelNo.setText(tm.getTelNo());
        txtEmail.setText(tm.getEmail());
        txtAddress.setText(tm.getAddress());

    }

    private void loadAllAddCustomer() {

        ObservableList<AddCustomerTm> obList = FXCollections.observableArrayList();

        for (AddCustomer D: AddCustomerDatabase.AddCustomerTable
        ) {
            Button btn = new Button("Delete");

            AddCustomerTm tm = new AddCustomerTm(D.getName(), D.getIdnumber(), D.getTelno(),D.getEmail(),D.getAddress(),btn);

            obList.add(tm);

            btn.setOnAction((event -> {

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                        "Are You Sure?",
                        ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().equals(ButtonType.YES)) {


                    AddCustomerDatabase.AddCustomerTable.remove(D);
                    obList.remove(tm);
                }

            }));



        }
        tblAddCustomer.setItems(obList);




    }

    public void onClickActionSubmit(ActionEvent actionEvent) {

        AddCustomer D1 = new AddCustomer(

                txtName.getText(),
                txtTelNo.getText(),
                txtId.getText(),
                txtAddress.getText(),
                txtEmail.getText()

        );
        AddCustomerDatabase.AddCustomerTable.add(D1);
        loadAllAddCustomer();

    }
}
