import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

public class GameScene extends Scene {
    Camera mainCamera;
    Hero hero;
    StaticThing backgroundLeft;
    StaticThing backgroundRight;
    StaticThing hitPoints;

    public GameScene(Parent parent, Group root) {
        super(parent);
        scene(root);
    }

    public GameScene(Parent parent, double v, double v1, Group root) {
        super(parent, v, v1);
        scene(root);
    }

    public GameScene(Parent parent, Paint paint, Group root) {
        super(parent, paint);
        scene(root);
    }

    public GameScene(Parent parent, double v, double v1, Paint paint, Group root) {
        super(parent, v, v1, paint);
        scene(root);
    }

    public GameScene(Parent parent, double v, double v1, boolean b, Group root) {
        super(parent, v, v1, b);
        scene(root);
    }

    public GameScene(Parent parent, double v, double v1, boolean b, SceneAntialiasing sceneAntialiasing, Group root) {
        super(parent, v, v1, b, sceneAntialiasing);
        scene(root);
    }

    public void scene(Group parent) {
        mainCamera = new Camera(0,0);

        // Hero
        hero = new Hero(150,250,
                100,82,
                0,10,
                "file:./img/heros.png");

        // Background
        backgroundLeft = new StaticThing(100,100,0,0,
                "img/desert.png");
        backgroundRight = new StaticThing(100,100,backgroundLeft.getImgWidth(),0,
                "img/desert.png");

        parent.getChildren().addAll(backgroundLeft.getSprite(),backgroundRight.getSprite());
        parent.getChildren().add(hero.getSprite());

        render();
        entitiesAnimator.start();
    }

    public void render() {
        hero.getSprite().setX(hero.getX()-mainCamera.getX());
        hero.getSprite().setY(hero.getY()-mainCamera.getY());

        backgroundLeft.setX(backgroundLeft.getX()-mainCamera.getX());
        backgroundLeft.setY(backgroundLeft.getY()-mainCamera.getY());
        backgroundRight.setX(backgroundLeft.getImgWidth()-mainCamera.getX());
        backgroundRight.setY(backgroundRight.getY()- mainCamera.getY());
    }

    AnimationTimer entitiesAnimator = new AnimationTimer() {
        @Override
        public void handle(long l) {
            hero.updateImageViewInScene(mainCamera,l);
        }
    };
}
