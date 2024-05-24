public class Item {
    private String description;
    private boolean isDone;

    public Item(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return getDescription() + ", " + (isDone() ? "done" : "not done");
    }
}
