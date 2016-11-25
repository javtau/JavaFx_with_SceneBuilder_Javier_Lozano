package vista;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {
	public void show() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ControlFX.class.getResource("Send.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("Submission form");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);

			sendStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FXML
	private void sendStage() {
		show();
	}

	@FXML
	private void closeStage() {
		System.exit(0);
	}
}
