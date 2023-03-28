import java.util.Arrays;
import java.util.Random;

public class View {


    public static void run(){
        int[] array = new int[15];
        int len = array.length;
        int min = -15;
        int max = 15;
        Random rand = new Random();

        for (int i = 0; i < len; i++) {
            array[i] = rand.nextInt(max - min + 1) + min;
        }

        System.out.println("Начальный массив: \t\t" + Arrays.toString(array));

        SortHeap.sort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }


}
