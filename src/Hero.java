import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Hero {
    private double x, y,
            spriteHeight, spriteWidth,
            spriteOffsetY, spriteOffsetX;
    private String file;
    private Image spriteSheet;
    private ImageView sprite;

    public Hero(double x, double y,
                double spriteHeight, double spriteWidth,
                double spriteOffsetY, double spriteOffsetX,
                String file) {
        this.x = x;
        this.y = y;
        this.spriteHeight = spriteHeight;
        this.spriteWidth = spriteWidth;
        this.spriteOffsetY = spriteOffsetY;
        this.spriteOffsetX = spriteOffsetX;
        this.file = file;
        this.spriteSheet = new Image(file);

        this.sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(spriteOffsetX,spriteOffsetY,spriteWidth,spriteHeight));
        sprite.setX(x);
        sprite.setY(y);
    }

    public void updateImageViewInScene(Camera cam, long time) {
        this.sprite.setX(this.x - cam.getX());
        this.sprite.setY(this.y - cam.getY());
        int index = (int)(time / 1000000L / 150L % 6L);
        this.sprite.setViewport(new Rectangle2D((double)(spriteOffsetX + spriteWidth * index), spriteOffsetY, spriteWidth, spriteHeight));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSpriteHeight() {
        return spriteHeight;
    }

    public void setSpriteHeight(double spriteHeight) {
        this.spriteHeight = spriteHeight;
    }

    public double getSpriteWidth() {
        return spriteWidth;
    }

    public void setSpriteWidth(double spriteWidth) {
        this.spriteWidth = spriteWidth;
    }

    public double getSpriteOffsetY() {
        return spriteOffsetY;
    }

    public void setSpriteOffsetY(double spriteOffsetY) {
        this.spriteOffsetY = spriteOffsetY;
    }

    public double getSpriteOffsetX() {
        return spriteOffsetX;
    }

    public void setSpriteOffsetX(double spriteOffsetX) {
        this.spriteOffsetX = spriteOffsetX;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Image getSpriteSheet() {
        return spriteSheet;
    }

    public void setSpriteSheet(Image spriteSheet) {
        this.spriteSheet = spriteSheet;
    }

    public ImageView getSprite() {
        return sprite;
    }

    public void setSprite(ImageView sprite) {
        this.sprite = sprite;
    }
}
