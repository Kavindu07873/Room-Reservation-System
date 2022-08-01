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

public class IncomeLoginController {
    public AnchorPane INcomeLogin;
    public TextField Whatshername;
    public PasswordField predecessor;

    public void onActionSubmitincome(ActionEvent actionEvent) throws IOException {

        INcomeLogin.getChildren().clear();
        String tempuser = Whatshername.getText() ;

        String tempPassword = predecessor.getText();

        if(tempuser.equals ("admin") && tempPassword.equals( "1234")) {


            URL resource = getClass().getResource("../view/income.fxml");
            Parent load = FXMLLoader.load(resource);
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        }else{
            new Alert(Alert.AlertType.WARNING,"UserName or Password Incorrect please Try Again").show();


        }

    }
}
