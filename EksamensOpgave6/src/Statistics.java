import java.util.ArrayList;

public class Statistics {

    private Die die;

    public Statistics(Die die) {
        this.die = new Die(6);
    }

    public ArrayList<Integer> results(int throwAmount) {
        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 0; i < die.getSides(); i++) {
            results.add(0);
        }

        for (int i = 0; i < throwAmount; i++){
            int result = die.throwDie();
            results.set(result, results.get(result) + 1);
        }
        return results;

    }

    public double probability(int dieSide) throws Exception {
        if (dieSide <=0 || dieSide > die.getSides()) {
            throw new Exception("Indtast en valid tal");
        } else {
            return 1.0 / die.getSides();

        }
    }

    public int rollCount(int dieNumber) throws Exception {
        if (dieNumber <= 0 || dieNumber > die.getSides()) {
            throw new Exception("Indtast en valid tal");
        }
            int rollCount = 0;
            while (die.throwDie() != dieNumber) {
                rollCount++;
            }
            return rollCount + 1;
        }


}
