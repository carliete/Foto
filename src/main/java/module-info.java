module ProjetoWebCam.nova {
    requires javafx.controls;
    requires javafx.fxml;
	requires webcam.capture;
	requires java.desktop;

    opens ProjetoWebCam.nova to javafx.fxml;
    exports ProjetoWebCam.nova;
    
    opens FXMLController to javafx.fxml;
    exports FXMLController;
}