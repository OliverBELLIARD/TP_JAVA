import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    int windowWidth = 800;
    int windowHeight = 400;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello world");
        Group root = new Group();
        Pane pane = new Pane(root);
        GameScene gameScene = new GameScene(pane, windowWidth, windowHeight,root);
        gameScene.setCamera(new ParallelCamera());
        primaryStage.setScene(gameScene);

        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}