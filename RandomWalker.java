/* *****************************************************************************
 *  Name:              Jyothsna Reddy
 *  Last modified:     July 17th, 2023
 **************************************************************************** */
public class RandomWalker {
    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        double rand = 0;
        int steps = 0;
        System.out.println("(" + x + ", " + y + ")");
        while(r!= (Math.abs(x) + Math.abs(y)))
        {
            rand = Math.random();
            if(rand < 0.25)
                ++x; // move to east
            else if(rand < 0.5)
                ++y; // move to north
            else if(rand < 0.75)
                --x; // move to west
            else if(rand < 1.0)
                --y;
            steps = steps +1;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("Steps = " +steps);
    }
}
