package uk.co.breadhub.calloutsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import uk.co.breadhub.calloutsystem.enums.Mode;

import java.util.Arrays;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parameters parameters = getParameters();
        Mode mode = Mode.get(1);

        if (parameters.getNamed().entrySet().size() > 0){
           mode = Mode.get(Integer.parseInt(parameters.getNamed().get("mode")));
            System.out.println("" +
                    "ID:[" + mode.getMode() + "],\n" +
                    "name:[" + mode.name() + "],\n" +
                    "hasAccessToDB:[" + mode.isDbDeleteAccess() + "],\n" +
                    "fxmlFile:[" + mode.getFxmlfile() + "],\n" +
                    "width:[" + mode.getWidth() + "],\n" +
                    "height:[" + mode.getHeight() + "],\n" +
                    "WindowTitle:[" + mode.getWindowtitle() + "]"
            );
        }

        Parent root = FXMLLoader.load(getClass().getResource(mode.getFxmlfile()));
        primaryStage.setTitle(mode.getWindowtitle());
        primaryStage.setScene(new Scene(root, mode.getWidth(), mode.getHeight()));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        launch(args);
    }
}
