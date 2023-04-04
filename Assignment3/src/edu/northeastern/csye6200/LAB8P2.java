package edu.northeastern.csye6200;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LAB8P2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		double height = 300;
		double paneHeight = 150;
		Rectangle bar1 = new Rectangle(10, paneHeight - height * 0.35, 100, height * 0.35);
		bar1.setFill(Color.BLUE);
		Text text1 = new Text(10, paneHeight - height * 0.35 - 10, "Project -- 35%");
		Rectangle bar2 = new Rectangle(10 + 110, paneHeight - height * 0.3, 100, height * 0.3);
		bar2.setFill(Color.GREEN);
		Text text2 = new Text(10 + 110, paneHeight - height * 0.3 - 10, "Exams -- 30%");
		Rectangle bar3 = new Rectangle(10 + 220, paneHeight - height * 0.3, 100, height * 0.3);
		// Fill Rectangle with Red color
		bar3.setFill(Color.RED);
		// create a Display text
		Text text3 = new Text(10 + 220, paneHeight - height * 0.3 - 10, "Assignments -- 30%");
		// create a Rectangle
		Rectangle bar4 = new Rectangle(10 + 330, paneHeight - height * 0.05, 100, height * 0.05);
		// Fill Rectangle with orange color
		bar4.setFill(Color.ORANGE);
		// create a Display text
		Text text4 = new Text(10 + 330, paneHeight - height * 0.05 - 10, "Attendance -- 5%");
		// Place Rectangle bars and Texts in pane.
		pane.getChildren().addAll(bar1, text1, bar2, text2, bar3, text3, bar4, text4);
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 450, paneHeight);
		// Set the stage title
		primaryStage.setTitle("Lab8_Problem2");
		// Place the scene in the stage
		primaryStage.setScene(scene);
		// Display the stage
		primaryStage.show();

	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}

}