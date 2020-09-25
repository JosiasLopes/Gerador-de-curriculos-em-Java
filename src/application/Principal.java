package application;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Principal extends Application {
	
	static Parent fxmlparent;
	static URL arqxml;
	BorderPane root;
	static Stage stage;
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
	
	public static void changeScene(String url) throws Exception{
		arqxml = Principal.class.getResource(url);
		fxmlparent = (Parent) FXMLLoader.load(arqxml);
		Scene scene = new Scene(fxmlparent,595,530);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
		
	}

	

}
