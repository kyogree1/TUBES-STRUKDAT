import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SearchSuggestionApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("pppp.fxml"));
        primaryStage.setTitle("Search with Suggestions");
        primaryStage.setScene(new Scene(root, 1080, 720));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
