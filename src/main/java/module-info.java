module tubes.strukdat.kamusnusantaraapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens tubes.strukdat.kamusnusantaraapp to javafx.fxml;
    exports tubes.strukdat.kamusnusantaraapp;
}