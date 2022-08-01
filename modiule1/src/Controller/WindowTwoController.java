package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class WindowTwoController {
    public TextField txtusername;
    public PasswordField pwdpassword;
    public AnchorPane windowTwoAdmin;

    public void onActionSubmit(ActionEvent actionEvent) throws IOException {

        windowTwoAdmin.getChildren().clear();
            String tempuser = txtusername.getText() ;

            String tempPassword = pwdpassword.getText();

            if(tempuser.equals ("admin") && tempPassword.equals( "1234")){


                URL resource = getClass().getResource("../view/DashBoard.fxml");
                Parent load = FXMLLoader.load(resource);
                Scene scene = new Scene(load);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();


            }
            else{

            new Alert(Alert.AlertType.WARNING,"UserName or Password Incorrect please Try Again").show();


            }

        }


    }

