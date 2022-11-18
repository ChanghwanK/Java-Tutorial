package abstract_ex.my_game;

public class GameStarter {
    public static void main(String[] args) {
        Marin marin = new Marin(10 ,100);
        marin.move();
        marin.attack();
    }

}
