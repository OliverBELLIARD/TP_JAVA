public class Camera {
    private double x, y;

    public Camera(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(Integer x) { this.x = x; }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x+","+y;
    }
}
