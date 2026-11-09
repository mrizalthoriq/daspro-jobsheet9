import java.util.Scanner;
public class ArrayBilangan24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] bil = {5, 13, -7, 17};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }
    }
}
