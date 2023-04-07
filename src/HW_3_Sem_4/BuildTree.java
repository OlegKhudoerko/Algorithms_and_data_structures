package HW_3_Sem_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuildTree {

    public static void run(){
        System.out.println("Строим красно-черное дерево!!! (для выхода введите не число)");
        Tree tree = new Tree();
        PrintTree printer = new PrintTree();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    System.out.println("Введите значение: ");
                    int value = Integer.parseInt(reader.readLine());
                    tree.insert(value);
                    printer.printTree(tree.getRoot());
                } catch (Exception ignored) {
                    System.out.println("Выход");
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
