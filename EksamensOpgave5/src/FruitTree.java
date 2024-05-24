import java.time.LocalDate;
import java.util.ArrayList;

class FruitTree extends Tree {
    private ArrayList<Float> yields = new ArrayList<>();

    public FruitTree(String species, LocalDate datePlanted, float height) {
        super(species, datePlanted, height);
    }

    public void registerYield(float yield) {
        yields.add(yield);
    }

    public float getAverageYield() {
        float sum = 0;
        for (float yield : yields) {
            sum += yield;
        }
        return sum / yields.size();
    }
    @Override
    public String toString() {
        return "FruitTree species: " + getSpecies() + ", datePlanted: " + getDatePlanted() + ", height: " + height + ", averageYield: " + getAverageYield();
    }
}