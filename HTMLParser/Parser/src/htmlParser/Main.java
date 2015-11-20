package htmlParser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));
        Parent root = loader.load();

        Controller mController = (Controller)loader.getController();
        Model mModel = new Model();

        mController.init(primaryStage, mModel);

        primaryStage.setTitle("HTML Parser");
        primaryStage.setScene(new Scene(root, 720, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
