import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Die die = new Die(6);

        Statistics statistics = new Statistics(die);

        int throwAmount = 100;
        ArrayList<Integer> results = statistics.results(throwAmount);

        for (int i = 0; i < results.size(); i++) {
            System.out.println("Antal " + (i + 1) + "'ere " + results.get(i));

        }

        int dieSide = 4;
        double probability = statistics.probability(dieSide);
        System.out.println("Probability of " + dieSide + " is " + probability);

        int dieNumber = 5;
        int rollsRequired = statistics.rollCount(dieNumber);
        System.out.println("Rolls required to hit " + dieNumber + " is " + rollsRequired);

    }
}