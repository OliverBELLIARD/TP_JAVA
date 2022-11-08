import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    Camera mainCamera;
    Hero hero;

    @Override
    public void start(Stage primaryStage) throws Exception{
        mainCamera = new Camera(100,100);

        primaryStage.setTitle("Hello world");
        Group root = new Group();
        Pane pane = new Pane(root);
        GameScene gameScene = new GameScene(pane, 600, 400);
        gameScene.setCamera(new ParallelCamera());
        primaryStage.setScene(gameScene);

        // Hero
        hero = new Hero(200,300,
                100,82,
                0,10,"file:./img/heros.png");

        // Background
        StaticThing backgroundLeft = new StaticThing(100,100,0,0,
                "img/desert.png");
        StaticThing backgroundRight = new StaticThing(100,100,backgroundLeft.getImgWidth(),0,
                "img/desert.png");

        root.getChildren().add(backgroundLeft.getSprite());
        root.getChildren().add(backgroundRight.getSprite());
        root.getChildren().add(hero.getSprite());
        primaryStage.show();
        //gameScene.render();
        entitiesAnimator.start();
    }

    AnimationTimer entitiesAnimator = new AnimationTimer() {
        @Override
        public void handle(long l) {
            hero.updateImageViewInScene(mainCamera,l);
        }
    };

    public static void main(String[] args) {

        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                System.out.println(l);
            }
        };

        launch(args);
    }
}