import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	private Button helloButton, howdyButton, chineseButton, clearButton, exitButton;
	private Label feedbackLabel;
	private TextField feedbackField;
	private HBox topBox, bottomBox;

	//student Task #4:
	private DataManager manager;

	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		helloButton = new Button("Hello");
		howdyButton = new Button("Howdy");
		chineseButton = new Button("Chinese");
		clearButton = new Button("Clear");
		exitButton = new Button("Exit");
		feedbackLabel = new Label("Feedback:");
		feedbackField = new TextField();
		topBox = new HBox();
		bottomBox = new HBox();

		//student Task #4:
		manager = new DataManager();

		helloButton.setOnAction(new ButtonHandler());
		howdyButton.setOnAction(new ButtonHandler());
		chineseButton.setOnAction(new ButtonHandler());
		clearButton.setOnAction(new ButtonHandler());
		exitButton.setOnAction(new ButtonHandler());

		Insets inset = new Insets(10, 10, 10, 10);
		HBox.setMargin(helloButton, inset);
		HBox.setMargin(howdyButton, inset);
		HBox.setMargin(chineseButton, inset);
		HBox.setMargin(clearButton, inset);
		HBox.setMargin(exitButton, inset);
		HBox.setMargin(feedbackLabel, inset);
		HBox.setMargin(feedbackField, inset);

		topBox.setAlignment(Pos.CENTER);
		bottomBox.setAlignment(Pos.CENTER);

		//student Task #3:
		topBox.getChildren().addAll(feedbackLabel, feedbackField);
		bottomBox.getChildren().addAll(helloButton, howdyButton, chineseButton, clearButton, exitButton);
		this.getChildren().addAll(topBox, bottomBox);

	}

	//Task #4:
	private class ButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			if (event.getTarget() == helloButton) {
				feedbackField.setText(manager.getHello());
			} else if (event.getTarget() == howdyButton) {
				feedbackField.setText(manager.getHowdy());
			} else if (event.getTarget() == chineseButton) {
				feedbackField.setText(manager.getChinese());
			} else if (event.getTarget() == clearButton) {
				feedbackField.setText("");
			} else if (event.getTarget() == exitButton) {
				Platform.exit();
				System.exit(0);
			}
		}
	}
}
