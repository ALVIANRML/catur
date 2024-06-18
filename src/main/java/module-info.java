module MyChessGame {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;
    requires javafx.swing;
    requires javafx.graphics;

    opens Main to javafx.fxml;
    exports Main;
//    exports Main; // Ganti Main dengan nama paket Anda jika berbeda
    exports pieces; // Ganti pieces dengan nama paket Anda jika berbeda
}
