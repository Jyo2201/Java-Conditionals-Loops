/* *****************************************************************************
 *  Name:              Jyothsna Reddy
 *  Last modified:     July 17th, 2023
 **************************************************************************** */
public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double avg = 0;
        double totalSteps = 0;
        for (int n = 0; n < trials; n++) {
            int x = 0;
            int y = 0;
            double steps = 0;
            while (r != (Math.abs(x) + Math.abs(y))) {
                double rand = Math.random();
                if (rand < 0.25)
                    ++x; // move to east
                else if (rand < 0.5)
                    ++y; // move to north
                else if (rand < 0.75)
                    --x; // move to west
                else
                    --y;
                steps = steps + 1;
            }
            totalSteps = totalSteps + steps;
        }
        avg = (double) totalSteps / trials;
        System.out.println("average number of steps = " + avg);
    }
}
