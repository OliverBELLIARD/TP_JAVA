public class Collider {
    private boolean solid;
    private boolean overlap;
    private int collisions;
    private double x;
    private double y;
    private double width;
    private double height;

    public Collider(boolean solid, double x, double y, double width, double height) {
        this.solid = solid;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        overlap = false;
        collisions = 0;
    }

    public boolean isSolid() {
        return solid;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    public boolean isOverlap() {
        return overlap;
    }

    public void setOverlap(boolean overlap) {
        this.overlap = overlap;
    }

    public int getCollisions() {
        return collisions;
    }

    public void setCollisions(int collisions) {
        this.collisions = collisions;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void onCollision() {
        System.out.println("Collision");
    }
}
