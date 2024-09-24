module com.example.javafxsemester {
    requires javafx.controls;
    requires javafx.fxml;


    opens Demo to javafx.fxml;
    exports Demo;
    opens RNG to javafx.fxml;
    exports RNG;
}