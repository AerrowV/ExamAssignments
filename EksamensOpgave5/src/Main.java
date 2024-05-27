import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        Plant tree1 = new Tree("Pine", LocalDate.of(2001,11,8),49);
        Plant tree2 = new Tree("Oak", LocalDate.of(2015,1,3),4);

        garden.addPlant(tree1);
        garden.addPlant(tree2);

        FruitTree fruitTree1 = new FruitTree("Apple", LocalDate.of(1900,11,6),20);
        fruitTree1.registerYield(2.5f);
        fruitTree1.registerYield(3.0f);
        fruitTree1.registerYield(4.0f);
        garden.addPlant(fruitTree1);

        FruitTree fruitTree2 = new FruitTree("Banana", LocalDate.of(1995,4,28),22);
        fruitTree2.registerYield(3.0f);
        fruitTree2.registerYield(4.0f);
        fruitTree2.registerYield(5.0f);
        garden.addPlant(fruitTree2);

        Flower flower1 = new Flower("Rose", LocalDate.of(2010,12,25),"Red");
        Flower flower2 = new Flower("Dahlia", LocalDate.of(1800,12,25),"Green");
        Flower flower3 = new Flower("Orchid", LocalDate.of(2011,12,25),"Yellow");
        garden.addPlant(flower1);
        garden.addPlant(flower2);
        garden.addPlant(flower3);

        System.out.println("\n" + "The total average yield of all fruit trees in this garden is: " + garden.getTotalAverageYield() + "kg");

        garden.displayFlowersOfColor("Yellow");

        System.out.println("\n" + flower1);
        System.out.println(flower2);

        System.out.println("\n" + tree1);
        System.out.println(tree2);

        System.out.println("\n" + fruitTree1);
        System.out.println(fruitTree2);

        float treeHeight = 10.0f;
        ArrayList<Tree> trees = garden.getTreesHigherThan(treeHeight);
        System.out.println("\n" + "Trees higher than " + treeHeight + " metres");
        for (Tree tree : trees) {
            System.out.println(tree);
        }

        System.out.println("\n" + "The oldest plant in the garden is of the " + garden.getOldestPlant().getSpecies() + " species, and was planted in the year of " + garden.getOldestPlant().getDatePlanted().getYear());
    }
}