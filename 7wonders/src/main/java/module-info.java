module com.example.seven_wonder {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.seven_wonder to javafx.fxml;
    exports com.example.seven_wonder;
    exports com.example.seven_wonder.controller;
    opens com.example.seven_wonder.controller to javafx.fxml;
    exports com.example.seven_wonder.models;
    opens com.example.seven_wonder.models to javafx.fxml;
}