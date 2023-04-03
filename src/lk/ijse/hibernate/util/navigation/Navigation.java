package lk.ijse.hibernate.util.navigation;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {

    private static AnchorPane loginFormContext;

    public static void navigate(Routes routes, AnchorPane loginFormContext) throws IOException {
        Navigation.loginFormContext = loginFormContext;
        Navigation.loginFormContext.getChildren().clear();
        Stage window = (Stage) Navigation.loginFormContext.getScene().getWindow();

        switch (routes){
            case LOGIN:
                window.setTitle("Login Form");
                initUI("LoginForm.fxml");
                break;
            default:
                new Alert(Alert.AlertType.ERROR, "Not suitable UI found!").show();
        }
    }
    private static void initUI(String location) throws IOException {
        Navigation.loginFormContext.getChildren().add(FXMLLoader.load(Navigation.class
                .getResource("/lk/ijse/dsi/view/" + location)));
    }
}
