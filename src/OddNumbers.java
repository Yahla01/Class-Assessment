import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[31];
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            int[] odd = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
            for (int i = 0; i < odd.length; i++) {
                if (odd[i] % 3 == 0) {
                    sum+=odd[i];
                    list.add(odd[i]);
                }
            }
            System.out.println(sum);
        }
}
