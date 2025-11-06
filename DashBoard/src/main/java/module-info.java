module dashboard
{
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.media;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.materialdesign;
    requires com.dlsc.workbenchfx.core;
    requires com.gluonhq.attach.display;
    requires com.gluonhq.charm.glisten;
    requires org.kordamp.ikonli.javafx;
    requires com.gluonhq.attach.util;
    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.core;
    requires jdk.jsobject;
    requires MaterialFX;
    requires animatefx;
    requires java.sql;

    opens dashboard to javafx.fxml;
    exports dashboard;

    opens data_base to java.sql;
    exports data_base;
    
    opens controllers to 
    org.kordamp.ikonli.fontawesome5, org.kordamp.ikonli.fontawesome6,
    org.kordamp.ikonli.paymentfont, org.kordamp.ikonli.fontawesome,
    org.kordamp.ikonli.core, org.kordamp.ikonli.materialdesign,
    org.controlsfx.controls, org.kordamp.bootstrapfx.core,
    org.kordamp.ikonli.javafx, com.dlsc.workbenchfx.core,
    com.gluonhq.charm.glisten, com.gluonhq.attach.display,
    javafx.graphics, javafx.fxml, javafx.base, javafx.controls,
    animatefx, MaterialFX, javafx.media, javafx.web; 
    
    exports controllers; 
}