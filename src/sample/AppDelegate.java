package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.view.LoginView;

public class AppDelegate extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        new LoginView(primaryStage);
    }
}
