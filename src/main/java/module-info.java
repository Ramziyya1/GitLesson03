module com.example.gitlesson03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitlesson03 to javafx.fxml;
    exports com.example.gitlesson03;
}