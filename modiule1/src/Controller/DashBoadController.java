package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoadController {
    public void onActionMeals(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Meals.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();


    }

    public void ONActionRoom(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Rooms.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();



    }

    public void OnActionIncome(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/inComeLogin.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void OnactionWorkers(ActionEvent actionEvent) {
    }

    public void onClickAction(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/AddCustomer.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();




    }
}
