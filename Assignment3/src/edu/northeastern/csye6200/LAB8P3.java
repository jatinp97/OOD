package edu.northeastern.csye6200;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import java.io.IOException;
import java.util.Random;

public class LAB8P3 extends Application {
	private static final int MATRIX_SIZE = 10;

	@Override
	public void start(Stage primaryStage) throws IOException {
		GridPane matrixPane = new GridPane();

		Random random = new Random();
		for (int row = 0; row < MATRIX_SIZE; row++) {
			for (int col = 0; col < MATRIX_SIZE; col++) {
				TextField textField = new TextField();
				int value = random.nextInt(2);
				textField.setText(Integer.toString(value));
				textField.setAlignment(javafx.geometry.Pos.CENTER);
				matrixPane.add(textField, col, row);
			}
		}

		Scene scene = new Scene(matrixPane, 500, 500);
		primaryStage.setTitle("Matrix Display");
		primaryStage.setScene(scene);
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