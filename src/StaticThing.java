import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    private double sizeX, sizeY, posX, posY, imgWidth, imgHeight;
    private ImageView sprite;
    private Image spriteSheet;

    public StaticThing(double sizeX, double sizeY, double posX, double posY, String fileName) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.posX = posX;
        this.posY = posY;

        this.spriteSheet = new Image("file:./"+fileName);

        this.imgWidth = spriteSheet.getWidth();
        this.imgHeight = spriteSheet.getHeight();

        this.sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(20,0,65,100));
        sprite.setX(this.posX);
        sprite.setY(this.posY);
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

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public ImageView getImageView() {
        return sprite;
    }

    public Image getImage() { return spriteSheet; }
}
