package application;
	
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


/*
 
 */

public class Main extends Application {
	Parent fxmlparent;
	URL arqxml;
	BorderPane root;
	Stage stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			 root = new BorderPane();
			
			/*
			 arqxml é a URL do arquivo fxml que será usado no programa
			 o metodo getResource vai buscar o arquivo fxml que esta na mesma pasta que a classe principal
			 */
			arqxml = this.getClass().getResource("currico_gerador.fxml");
			fxmlparent = (Parent) FXMLLoader.load(arqxml);
			Scene scene = new Scene(fxmlparent,595,530);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
		
		
		
		
		
	}
	
	
}
