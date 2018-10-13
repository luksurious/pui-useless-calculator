package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			Pane rootPane = FXMLLoader.load(getClass().getResource("CalculatorUI2.fxml"));
			Pane rootPane = FXMLLoader.load(getClass().getResource("CalculatorUI.fxml"));
			Scene scene = new Scene(rootPane, 300, 346);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Mini Calculator");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
