
import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        while ( i <= N ){
            int j = 0;
            while ( j < i ) {
                System.out.print("");
                j++;
            }
            i++;
        }
    }
}
