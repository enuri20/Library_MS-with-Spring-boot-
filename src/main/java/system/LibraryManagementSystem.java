package system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"system", "view"})
public class LibraryManagementSystem extends Application{

    public static ConfigurableApplicationContext context;


    @Override
    public void init() throws Exception {
        context = SpringApplication.run(LibraryManagementSystem.class);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/main.fxml"));
        fxmlLoader.setControllerFactory(context::getBean);

        Parent anchorPane = fxmlLoader.load();
        Scene scene = new Scene(anchorPane, 1000, 700);
        primaryStage.setTitle("Library Management System");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void stop() throws Exception {
        context.close();
    }



    public static void main(String[] args) {
        launch(args);

    }
}
