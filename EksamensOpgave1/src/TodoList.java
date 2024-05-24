import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<Item> items;

    public TodoList(ArrayList<Item> items) {
        this.items = items;
    }

    public void displayList() {
        System.out.println("Todo list:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ": " + items.get(i).toString());
        }
    }

    public void runDialog(){
        Scanner scanner = new Scanner(System.in);
        FileIO fileIO = new FileIO();
        while (true){
            displayList();
            System.out.println("Tast et tal for den opgave du vil markere som 'done’");
            System.out.println("Tast et tal som ikke findes i listen, hvis du vil tilføje en oppgave");
            System.out.println("tast 0 eller et negativt tal for at afslutte");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice <= 0){
                fileIO.saveFile(items);
                break;

            } else if (choice <= items.size()){
                Item item = items.get(choice - 1);
                if (item.isDone()){
                    items.remove(choice - 1);
                } else {
                    item.markAsDone();
                }
            } else {
                System.out.println("Skriv en opgave tekst");
                String description = scanner.nextLine();
                items.add(new Item(description, false));

            }

        }


    }

}
