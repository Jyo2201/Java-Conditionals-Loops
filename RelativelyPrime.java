/* *****************************************************************************
 *  Name:              Jyothsna Reddy
 *  Last modified:     July 2nd, 2023
 **************************************************************************** */

public class RelativelyPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int gcd = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= i && k <= j; k++) {
                    if (i % k == 0 && j % k == 0)
                        gcd = k;
                }
                if (gcd == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println('\n');
        }
    }
}
