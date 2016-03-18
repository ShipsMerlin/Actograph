package edu.ship.actograph.view;

import edu.ship.actograph.MainClass;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class ActographController
{
	private static final String DEFAULT_EXPERIMENT_DURATION = "24";
	private static final String DEFAULT_TIME_INTERVAL = "5";
	private static final String DEFAULT_SENSITIVITY = "75";
	@FXML
    private Spinner<Integer> experimentDurationSpinner;
	@FXML
    private Spinner<Integer> timeIntervalSpinner;
	@FXML
    private Spinner<Integer> sensitivitySpinner;
	@FXML
	private Button goButton;
	private MainClass mainClass;

	@FXML
    private void initialize() {
		experimentDurationSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 168,
	            Integer.parseInt(DEFAULT_EXPERIMENT_DURATION)));
		timeIntervalSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(5, 20,
	            Integer.parseInt(DEFAULT_TIME_INTERVAL)));
		sensitivitySpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100,
	            75));
		goButton.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        System.out.println(experimentDurationSpinner.getValue());
		        System.out.println(timeIntervalSpinner.getValue());
		        System.out.println(sensitivitySpinner.getValue());
		    }
		});
	}

	public void setMainApp(MainClass mainApp) {
        this.mainClass = mainApp;
    }
}
