public class Entity extends Collider {
    private int hp;
    private int attack;
    private double speed;

    public Entity(int x, int y, double width, double height, int hp, int attack, double speed) {
        super(true, x, y, width, height);

        this.hp = hp;
        this.attack = attack;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void damage(Entity entity) {
        entity.setHp(entity.getHp()-attack);
    }
}
