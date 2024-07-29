import java.util.Scanner;

/**
 * even
 */
public class even {

    public static int OddSum(int n){

        int a = 0;
        int b = 0;
        for (int i=1; i<=n; i++){
            if ( i%2 == 0) {
                b = b +i;
            } else {
                a = a +i;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value = ");int n = sc.nextInt();

        System.out.println(OddSum(n));
    }
}