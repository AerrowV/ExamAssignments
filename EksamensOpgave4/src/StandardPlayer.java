public class StandardPlayer implements Player {

    private String name;
    private double points;

    public StandardPlayer(String name) {
        this.name = name;
        this.points = 0;

    }
    @Override
    public double getPoint() {
        return points;
    }

    @Override
    public double addPoints(double points) {
        return this.points += points;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name : " + getName() + ", Points : " + getPoint();

    }
}
