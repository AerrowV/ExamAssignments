import java.util.Random;

public class Die {

    private int sides;
    private Random random;

    public Die (int sides){
        this.sides = sides;
        this.random = new Random();

    }

    public int throwDie() {
        return random.nextInt(0, sides);

    }
    public int getSides() {
        return sides;
    }
}
