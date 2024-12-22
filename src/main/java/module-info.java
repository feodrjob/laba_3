module org.example.laba_3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    requires jdk.incubator.vector;


    opens org.example.laba_3 to javafx.fxml;
    exports org.example.laba_3;
    exports org.example.laba_3.inetface;
}