import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    private double sizeX, sizeY, x, y, imgWidth, imgHeight;
    private ImageView sprite;
    private Image spriteSheet;

    public StaticThing(double sizeX, double sizeY, double x, double y, String fileName) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.x = x;
        this.y = y;

        this.spriteSheet = new Image("file:./"+fileName);

        this.imgWidth = spriteSheet.getWidth();
        this.imgHeight = spriteSheet.getHeight();

        this.sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(0,0,(int)spriteSheet.getWidth(),(int)spriteSheet.getHeight()));
        sprite.setX(this.x);
        sprite.setY(this.y);
    }

    public double getSizeX() {
        return sizeX;
    }

    public void setSizeX(double sizeX) {
        this.sizeX = sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }

    public void setSizeY(double sizeY) {
        this.sizeY = sizeY;
    }

    public double getX() {
        return x;
    }

    public void setX(double posX) {
        this.x = posX;
    }

    public double getY() {
        return y;
    }

    public void setY(double posY) {
        this.y = posY;
    }

    public ImageView getSprite() {
        return sprite;
    }

    public Image getImage() { return spriteSheet; }

    public double getImgWidth() {
        return imgWidth;
    }

    public double getImgHeight() {
        return imgHeight;
    }
}
