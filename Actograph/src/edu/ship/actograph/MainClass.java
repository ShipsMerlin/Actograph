package edu.ship.actograph;

import java.io.IOException;

import edu.ship.actograph.view.ActographController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainClass extends Application
{

	private Stage primaryStage;
	private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage)
	{
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Actigraph");
		initRootLayout();
		showActographOverview();
	}

	private void showActographOverview()
	{
		 try {
	            // Load person overview.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainClass.class.getResource("view/ActographOverview.fxml"));
	            AnchorPane actographOverview = (AnchorPane) loader.load();

	            ActographController controller = loader.getController();
	            controller.setMainApp(this);

	            // Set person overview into the center of root layout.
	            rootLayout.setCenter(actographOverview);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

	private void initRootLayout()
	{
		 try {
	            // Load root layout from fxml file.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainClass.class.getResource("view/RootLayout.fxml"));
	            rootLayout = (BorderPane) loader.load();

	            // Show the scene containing the root layout.
	            Scene scene = new Scene(rootLayout);
	            primaryStage.setScene(scene);
	            primaryStage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
