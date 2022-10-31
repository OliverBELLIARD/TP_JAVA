import javafx.scene.Camera;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

public class GameScene extends Scene {

    public GameScene(Parent parent) {
        super(parent);
    }

    public GameScene(Parent parent, double v, double v1) {
        super(parent, v, v1);
    }

    public GameScene(Parent parent, Paint paint) {
        super(parent, paint);
    }

    public GameScene(Parent parent, double v, double v1, Paint paint) {
        super(parent, v, v1, paint);
    }

    public GameScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
    }

    public GameScene(Parent parent, double v, double v1, boolean b, SceneAntialiasing sceneAntialiasing) {
        super(parent, v, v1, b, sceneAntialiasing);
    }
}
