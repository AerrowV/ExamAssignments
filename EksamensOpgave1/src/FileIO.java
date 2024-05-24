import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public ArrayList<Item> loadFile(String filePath) {
        ArrayList<Item> items = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(filePath))) {
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String description = parts[0].trim();
                    boolean isDone = Boolean.parseBoolean(parts[1].trim());
                    items.add(new Item(description, isDone));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something ain't right here chap!");
        }
        return items;
    }

    public void saveFile(ArrayList<Item> items) {
        try (FileWriter fileWriter = new FileWriter("Data/todo.csv")) {
            for (Item item : items) {
                fileWriter.write(item.getDescription() + "," + item.isDone() + "\n");
            }
        }
        catch (IOException e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }

    }
}