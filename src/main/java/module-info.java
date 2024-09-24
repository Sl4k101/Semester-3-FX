module com.example.javafxsemester {
    requires javafx.controls;
    requires javafx.fxml;


    opens Demos to javafx.fxml;
    exports Demos;
    opens Demos.Clock to javafx.fxml;
    exports Demos.Clock;
    opens RNG to javafx.fxml;
    exports RNG;
    opens Quiz2 to javafx.fxml;
    exports Quiz2;
}