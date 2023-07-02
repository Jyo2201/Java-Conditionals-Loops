/* *****************************************************************************
 *  Name:              Jyothsna Reddy
 *  Last modified:     July 2nd, 2023
 **************************************************************************** */
public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);
        for(int i=1; i<=n;i++){
            for (int j=1; j<=n; j++){
                if ((i==j) || ((j-i)>=0 && (j-i)<=w) || ((i-j)>=0 && (i-j)<=w))
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("0  ");
                }
            }
            System.out.print('\n');
        }
    }
}
