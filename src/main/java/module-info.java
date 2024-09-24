module com.example.javafxsemester3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
}