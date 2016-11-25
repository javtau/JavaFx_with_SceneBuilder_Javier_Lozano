package vista;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/***
 * Exam project for interface design class
 * This class contains all the methods for the buttons
 * and other method for launch the second window
 * @author javier Lozano Almeda
 * @version 1.0
 * @see MainFX
 */
public class ControlFX {
	/***
	 * 	Set the title and launch the second window
	 *  
	 *  @param loader Contain the location of the fxml 
	 *  @param sendStage contain FXML Loader
	 *  @param scene contain the stage
	 *  @exception exceptions In case of error, show the error mesage 
	 */
	public void show() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ControlFX.class.getResource("Send.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("Submission form");
			Scene scene = new Scene(page);
			scene.getStylesheets().add(getClass().getResource("../vista/mystylesheet.css").toExternalForm());
			sendStage.setScene(scene);

			sendStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/***
	 * Call the method for launch the second window
	 *  
	 *  @see show
	 */
	@FXML
	private void sendStage() {
		show();
	}

	@FXML
	/***
	 * Close the aplication
	 */
	private void closeStage() {
		System.exit(0);
	}
}
