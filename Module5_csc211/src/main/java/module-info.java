module com.example.module5_csc211 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.module5_csc211 to javafx.fxml;
    exports com.example.module5_csc211;
}