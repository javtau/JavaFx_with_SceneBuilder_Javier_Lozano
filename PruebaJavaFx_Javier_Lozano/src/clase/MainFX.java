package clase;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/***
 * Exam project for interface desidn class
 * @author javier Lozano Almeda
 * @version 1.0
 * @see ControlFX.java
 */

public class MainFX extends Application {
	
	private Stage primaryStage;
	private AnchorPane profileLayout;
	/***
	 * Set the principal Stage
	 *  
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("My GitHub profile");
		this.primaryStage.setX(500);
		this.primaryStage.setY(400);
		
		this.primaryStage = primaryStage;
		primaryStage.show();
		initProfile();

	}
	
	/***
	 * Configure the values of the scene and launch it
	 *  
	 *  @param loader put the location of the fxml 
	 *  @exception exceptions In case of error, show the error mesage 
	 */
	public void initProfile() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/Profile.fxml"));
			profileLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(profileLayout);
			/***
			 * Load us own stylesheet in the scene
			 */
			scene.getStylesheets().add(getClass().getResource("../vista/mystylesheet.css").toExternalForm());

			//adding fonts
			scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
			/***
			 * Load the font that we wont in the scene
			 */
            Font.loadFont(getClass().getResourceAsStream("../vista/fonts/HipsterishFontNormal.ttf"), 20);
            
			
			primaryStage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
