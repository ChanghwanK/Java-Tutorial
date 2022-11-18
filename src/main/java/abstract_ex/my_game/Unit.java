package abstract_ex.my_game;

 abstract class Unit {
    protected int moveSpeed;
    protected int power;
    protected String name;

    public abstract void attack();
    public abstract void move();

     public Unit(int moveSpeed, int power) {
         this.moveSpeed = moveSpeed;
         this.power = power;
     }
 }


