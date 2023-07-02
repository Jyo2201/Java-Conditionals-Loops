/* *****************************************************************************
 *  Name:              Jyothsna Reddy
 *  Last modified:     July 2nd, 2023
 **************************************************************************** */
public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double tempResult;
        double result = 0;
        for(int i = 1; i<=n; i++)
        {
            tempResult = 1/Math.pow(i, r);
            result = result + tempResult;
        }
        System.out.println(n+ "th generalized harmonic number of order "+r+ " is " +result);
    }
}