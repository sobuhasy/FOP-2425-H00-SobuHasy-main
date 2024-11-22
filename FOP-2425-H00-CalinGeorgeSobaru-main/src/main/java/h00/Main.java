package h00;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.RobotFamily;
import fopbot.World;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * The subtask to run.
     */
    public static int runToSubtask = -1;

    /**
     * The world speed in milliseconds.
     */
    public static int delay = 300;

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        // This sets up the FOPBot World with a 4x4 grid. (DO NOT TOUCH)
        setupWorld();

        // TODO: H0.4 - Initializing FOPBot
        // Initialization of Kaspar
        Robot kaspar = new Robot(1, 1, Direction.DOWN, 4);

        // Initialization of Alfred
        Robot alfred = new Robot(0, 3, Direction.DOWN, 0);

        if (runToSubtask == 0) return; // DO NOT TOUCH!
        // TODO: H0.5.1 - Turning with repeated instructions
        // Turning Alfred 2 times to the left
        alfred.turnLeft();
        alfred.turnLeft();


        if (runToSubtask == 1) return; // DO NOT TOUCH!
        // TODO: H0.5.2 - Turning with for-loop
        // Turning Alfred 2 times to the left
        for (int i = 0; i<2; i++){
            alfred.turnLeft();
        }

        if (runToSubtask == 2) return; // DO NOT TOUCH!
        // TODO: H0.5.3 - Turning with while-loop
        // Turning Kaspar until he faces right
        while (!kaspar.isFacingRight()){
            kaspar.turnLeft();
        }

        if (runToSubtask == 3) return; // DO NOT TOUCH!
        // TODO: H0.6.1 - Put with repeated instructions
        // Kaspar puts 1 coin
        kaspar.putCoin();

        // Kaspar moves 3 times
        kaspar.move();
        kaspar.move();
        kaspar.move();

        // Kaspar moves left
        kaspar.turnLeft();

        if (runToSubtask == 4) return; // DO NOT TOUCH!
        // TODO: H0.6.2 - Pick with repeated instructions
        // Alfred moves 3 times
        alfred.move();
        alfred.move();
        alfred.move();

        // Alfred picks 1 coin
        alfred.pickCoin();

        // Alfred moves left
        alfred.turnLeft();


        if (runToSubtask == 5) return; // DO NOT TOUCH!
        // TODO: H0.6.3 - Put with for-loop
        // Kaspar puts 1 coin
        kaspar.putCoin();

        // Kaspar moves 3 times
        for (int i = 0; i<3; i++){
            kaspar.move();
        }

        // Kaspar moves left
        kaspar.turnLeft();

        if (runToSubtask == 6) return; // DO NOT TOUCH!
        // TODO: H0.7.1 - Pick with while-loop
        // Alfred moves 3 times
        while (alfred.isFrontClear()){
            alfred.move();
        }

        // Alfred picks 1 coin
        alfred.pickCoin();

        // Alfred moves left
        alfred.turnLeft();


        if (runToSubtask == 7) return; // DO NOT TOUCH!
        // TODO: H0.7.2 - Pick and put with while-loop
        // Kaspar puts 1 coin
        kaspar.putCoin();

        // Kaspar and Alfred move 3 times
        while (alfred.isFrontClear()){
            alfred.move();
            kaspar.move();
        }

        // Alfred picks 1 coin and then turns left
        alfred.pickCoin();
        alfred.turnLeft();

        // Kaspar turns left
        kaspar.turnLeft();


        if (runToSubtask == 8) return; // DO NOT TOUCH!
        // TODO: H0.7.3 - Put with reversed for-loop
        // Alfred puts for each coin a new coin and then moves 3 times
        for (int i = alfred.getNumberOfCoins(); i>0; i--){
            alfred.putCoin();
            alfred.move();
        }

        // Alfred turns left
        alfred.turnLeft();


    }

    public static void setupWorld() {
        // variable representing width/size of world
        final int worldSize = 4;

        // setting world size symmetrical, meaning height = width
        World.setSize(worldSize, worldSize);

        // speed of how fast the world gets refreshed (e.g. how fast the robot(s) act)
        // the lower the number, the faster the refresh
        World.setDelay(delay);

        // make it possible to see the world window
        World.setVisible(true);
    }
}
