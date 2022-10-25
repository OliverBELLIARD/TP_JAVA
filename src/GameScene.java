import javafx.scene.Camera;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

public class GameScene extends Scene {
    Camera cam;

    public GameScene(Parent parent, Camera cam) {
        super(parent);
        this.cam = cam;
    }

    public GameScene(Parent parent, double v, double v1, Camera cam) {
        super(parent, v, v1);
        this.cam = cam;
    }

    public GameScene(Parent parent, Paint paint, Camera cam) {
        super(parent, paint);
        this.cam = cam;
    }

    public GameScene(Parent parent, double v, double v1, Paint paint, Camera cam) {
        super(parent, v, v1, paint);
        this.cam = cam;
    }

    public GameScene(Parent parent, double v, double v1, boolean b, Camera cam) {
        super(parent, v, v1, b);
        this.cam = cam;
    }

    public GameScene(Parent parent, double v, double v1, boolean b, SceneAntialiasing sceneAntialiasing, Camera cam) {
        super(parent, v, v1, b, sceneAntialiasing);
        this.cam = cam;
    }
}
