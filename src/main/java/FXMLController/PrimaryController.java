package FXMLController;


import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;


import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamDiscoveryEvent;
import com.github.sarxos.webcam.WebcamDiscoveryListener;
import com.github.sarxos.webcam.WebcamEvent;
import com.github.sarxos.webcam.WebcamListener;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamPicker;
import com.github.sarxos.webcam.WebcamResolution;

import ProjetoWebCam.nova.App;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class PrimaryController implements Runnable, WebcamListener, UncaughtExceptionHandler, WebcamDiscoveryListener {

	private Webcam webcam = null;
	private WebcamPanel webcampanel = null;
	private WebcamPicker picker = null;
	
	private Button TirarFoto;
	private Button SalvarFoto;
	
	@FXML
	private ImageView image;

	private static final long serialVersionUID = 1L;
	
	
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

	@Override
	public void webcamFound(WebcamDiscoveryEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void webcamGone(WebcamDiscoveryEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void webcamOpen(WebcamEvent we) {
		System.out.println("webcam open");
		
	}

	@Override
	public void webcamClosed(WebcamEvent we) {
		System.out.println("webcam close");
		webcam.close();
		
	}

	@Override
	public void webcamDisposed(WebcamEvent we) {
		System.out.println("webcam disposed");
		
	}

	@Override
	public void webcamImageObtained(WebcamEvent we) {
		System.out.println("new Photograph");
		
	}

	public void TirarFoto(javafx.event.ActionEvent event) {
		BufferedImage bimage;
		bimage = webcam.getImage();
	}
	
	public void SalvarFoto(javafx.event.ActionEvent event) {
		System.out.println("Foto salva com sucesso");
		
	}

	
	@Override
	public void run() {
		webcam = Webcam.getDefault();
		webcam.open();
	}
	
    public static void main(String[] args) {
        launch();
    }

	private static void launch() {
		// TODO Auto-generated method stub
		
	}
}