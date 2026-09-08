package vallegrande.edu.pe.falabellastore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vallegrande.edu.pe.falabellastore.controller.FalabellaController;

public class Launcher extends Application {

    @Override
    public void start(Stage stage) {
        FalabellaController controller = new FalabellaController();

        Scene scene = new Scene(controller.getView(), 1050, 700);
        stage.setTitle("Falabella Store App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}