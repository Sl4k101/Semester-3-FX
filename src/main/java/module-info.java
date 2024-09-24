module com.example.javafxsemester3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxsemester3 to javafx.fxml;
    exports com.example.javafxsemester3;
}