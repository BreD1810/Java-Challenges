import java.util.Random;

/**
 * This class is for the board for the game.
 */
public class Board {

	private char grid[][]= new char[10][10];

	//TODO: Array for board of shots fired - change "setupBoard" to accept array parameter
    //TODO: Method for changing letters - misses and hits, parameters: x, y, hit boolean.
    //TODO: Player choosing where to place the ships rather than auto place. AI enemy?

    /**
     *Setup the board by filling it entirely with question marks.
     */
	private void setupBoard() {
		 for(int i=0; i<10; i++) {
		        for(int j=0; j<10; j++) {
		            grid[i][j] = '?';
		        }
		 }
	}

    /**
     * Display the board in the console
     */
	public void outputBoard() {
		 for(int i=0; i<10; i++) {
		        for(int j=0; j<10; j++) {
		            System.out.print(grid[i][j]);
		            System.out.print("  ");
		        }
		 System.out.println();
		 }
		 System.out.println();
	}

    /**
     * Place the ship on the board, ensuring it does not collide with an existing ship.
     * @param inputShip
     */
	public void placeShip(Ship inputShip) {
		//Grid is 10x10
		Random rand = new Random();
		int orientation = rand.nextInt(2) + 1; //1 = vertical, 2 = horizontal.

        if(orientation == 1)
        {
            placeVertical(inputShip);
        }
        else if(orientation == 2)
        {
            placeHorizontal(inputShip);
        }
        else
        {
            System.out.println("Placement error!");
        }
	}

    /**
     * Place a ship horizontally onto the board
     * @param inputShip
     */
	private void placeHorizontal(Ship inputShip)
    {
        boolean placed = false;
        //Loop until the ship is placed
        while(!placed)
        {
            //Generate a random starting location
            Random rand = new Random();
            int x = rand.nextInt(10 - inputShip.returnLength());
            int y = rand.nextInt(10 - inputShip.returnLength());

            //Check if there is a collision
            boolean collision = false;
            for (int i = 0; i < inputShip.returnLength(); i++)
            {
                if (grid[x][y + i] != '?')
                {
                    collision = true;
                }
            }

            //Place if there is no collision
            if (!collision)
            {
                grid[x][y] = '<';
                for (int i = 1; i < inputShip.returnLength() - 1; i++)
                {
                    grid[x][y + i] = '-';
                }
                grid[x][y + (inputShip.returnLength()-1)] = '>';
                placed = true;
            }
        }
    }

    /**
     * Place a ship vertically onto the board
     * @param inputShip The ship being placed
     */
    private void placeVertical(Ship inputShip)
    {
        boolean placed = false;
        //Loop until the ship is placed
        while (!placed)
        {
            //Generate a random starting location
            Random rand = new Random();
            int x = rand.nextInt(10 - inputShip.returnLength());
            int y = rand.nextInt(10 - inputShip.returnLength());

            //Check if there is a collision
            boolean collision = false;
            for (int i = 0; i < inputShip.returnLength(); i++)
            {
                if (grid[x + i][y] != '?') {
                    collision = true;
                }
            }

            //Place if there is no collision
            if (!collision)
            {
                grid[x][y] = '^';
                for (int i = 1; i < inputShip.returnLength() - 1; i++)
                {
                    grid[x + i][y] = '|';
                }
                grid[x + (inputShip.returnLength() - 1)][y] = 'V';
                placed = true;
            }
        }
    }


    /**
     * Constructor - setup the board
     */
	Board() {
		setupBoard();
	}
}
