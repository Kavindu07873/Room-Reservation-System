package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MealsController {

    public AnchorPane Context;

    public void LocalMealsOnAction(ActionEvent actionEvent) throws IOException {
        Context.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/LocalMeal.fxml"));
        Context.getChildren().add(parent);
    }

    public void ChinieseMealOnAction(ActionEvent actionEvent) throws IOException {
        Context.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/ChineseMeal.fxml"));
        Context.getChildren().add(parent);
    }

    public void FrenchMealonAction(ActionEvent actionEvent) throws IOException {
        Context.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/FrenchMeal.fxml"));
        Context.getChildren().add(parent);
    }
}
