package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component

public class MainView {


    @FXML
    public void initialize() {
        System.out.println("Initialized");
    }

    @FXML
    public void handleBorrowButtonClick() throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/borrow.fxml"));
            Parent borrow = loader.load();
            Stage stage = new Stage();
            Scene borrowScene = new Scene(borrow, 1000, 700);
            stage.setScene(borrowScene);
            stage.setTitle("Borrow");
            stage.show();

        } catch (Exception e) {
            System.out.println("An error occurred" + e.getMessage());
        }

    }
    @FXML
    public void handleReturnButtonClick() throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/return.fxml"));
            Parent borrow = loader.load();
            Stage stage = new Stage();
            Scene borrowScene = new Scene(borrow, 1000, 700);
            stage.setScene(borrowScene);
            stage.setTitle("Return");
            stage.show();

        } catch (Exception e) {
            System.out.println("An error occurred" + e.getMessage());
        }

    }








}
