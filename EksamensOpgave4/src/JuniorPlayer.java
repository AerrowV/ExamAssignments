public class JuniorPlayer implements Player {

    private String name;
    private double points;

    public JuniorPlayer(String name) {
        this.name = name;
        this.points = 0;

    }

    @Override
    public double getPoint() {
        return points;
    }

    @Override
    public double addPoints(double points) {
        return this.points += points * 1.5;
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
