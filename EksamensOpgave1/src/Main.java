import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileIO();
        ArrayList<Item> items = fileIO.loadFile("EksamensOpgave1/Data/todo.csv");

        TodoList todoList = new TodoList(items);
        todoList.runDialog();
    }
}