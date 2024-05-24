import java.util.ArrayList;

public class Garden {

    private ArrayList<Plant> plants;

    public Garden() {
        this.plants = new ArrayList<>();
    }

    public void addPlant(Plant p) {
        this.plants.add(p);
    }

    public float getTotalYield() {
        float totalYield = 0;
        for (Plant p : plants) {
            if (p instanceof FruitTree) {
                FruitTree fruitTree = (FruitTree) p;
                totalYield += fruitTree.getAverageYield();
            }
        }
        return totalYield;

    }


    public void displayFlowersOfColor(String color) {
        System.out.println("The flowers of color " + color + " are: ");
        for (Plant p : plants) {
            if (p instanceof Flower) {
                Flower flower = (Flower) p;
                if (flower.getColor().equalsIgnoreCase(color)) {
                    System.out.println("Flower: " + flower.getSpecies() + " planted on " + flower.getDatePlanted());
                }
            }
        }
    }

    public ArrayList<Tree> getTreesHigherThan(float meter) {
        ArrayList<Tree> trees = new ArrayList<>();
        for (Plant plants : plants) {
            if (plants instanceof Tree) {
                Tree tree = (Tree) plants;
                if (tree.getHeight() > meter) {
                    trees.add(tree);

                }
            }
        }
        return trees;
    }



    public Plant getOldestPlant() {
        Plant oldestPlant = plants.get(0);
        for (Plant p : plants) {
            if (p.getDatePlanted().isBefore(oldestPlant.getDatePlanted())) {
                oldestPlant = p;
            }
        }
        return oldestPlant;

    }
}
