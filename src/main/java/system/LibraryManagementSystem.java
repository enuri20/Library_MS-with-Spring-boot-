package system;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LibraryManagementSystem extends Application{
    private VBox vBox;
    public static ConfigurableApplicationContext context;



    public LibraryManagementSystem() {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox = new VBox();
        Scene scene = new Scene(vBox, 400, 300);
        primaryStage.setTitle("Library");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        context = SpringApplication.run(LibraryManagementSystem.class);
        launch();



    }
}
