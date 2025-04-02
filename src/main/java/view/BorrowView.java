package view;

import javafx.fxml.FXML;
import org.springframework.stereotype.Component;

@Component
public class BorrowView {

    @FXML
    public void init() {
        System.out.println("Borrowing books");
    }


}
