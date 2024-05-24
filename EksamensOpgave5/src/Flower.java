import java.time.LocalDate;

class Flower extends Plant {
    String color;

    public Flower(String species, LocalDate datePlanted, String color) {
        super(species, datePlanted);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Flower species: " + getSpecies() + ", datePlanted: " + getDatePlanted() + ", color: " + getColor();
    }
}
