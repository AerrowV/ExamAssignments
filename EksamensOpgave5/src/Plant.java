import java.time.LocalDate;

public class Plant {

    private String species;
    private LocalDate datePlanted;

    Plant(String species, LocalDate datePlanted) {
        this.species = species;
        this.datePlanted = datePlanted;
    }

    String getSpecies() {
        return species;
    }

    LocalDate getDatePlanted() {
        return datePlanted;
    }

}
