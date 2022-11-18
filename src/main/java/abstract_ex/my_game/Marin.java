package abstract_ex.my_game;

public class Marin extends Unit {

    public Marin(int moveSpeed, int power) {
        super(moveSpeed, power);
        super.name = "Marin";
    }

    @Override
    public void attack() {
        System.out.println("Power: " + super.power);
    }

    @Override
    public void move() {
        System.out.println("Speed: " + super.moveSpeed);
    }

    public String getName() {
        return this.name;
    }
}
