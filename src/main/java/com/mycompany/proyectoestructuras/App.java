package com.mycompany.proyectoestructuras;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import logica.AL;
import logica.Usuario;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    static AL<Usuario> usuarios=new AL<>();
    private static Usuario usuarioActual;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Menu"), 350, 600);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
        Usuario usuario=new Usuario("0998383062","Micha12el");
        usuarios.add(usuario);
        usuarioActual=usuario;
    }

}