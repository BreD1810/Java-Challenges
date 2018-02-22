import java.util.ArrayList;

/**
 * This class is used for a player in the game.
 */
public class Player {

	public Board board = new Board();
	private ArrayList<Ship> ships = new ArrayList<Ship>();
	
	//Declare the ships that the user has.
	private Ship carrier = new Ship(5);
	private Ship battleship = new Ship(4);
	private Ship cruiser = new Ship(3);
	private Ship submarine = new Ship(3);
	private Ship destroyer = new Ship(2);

    /**
     * Output the ships that the player has
     */
	public void outputShips() {
		System.out.println("You have the following ships:");
		System.out.println("* A carrier of length " + carrier.returnLength());
		ships.add(carrier);
		System.out.println("* A battleship of length " + battleship.returnLength());
		ships.add(battleship);
		System.out.println("* A cruiser of length " + cruiser.returnLength());
		ships.add(cruiser);
		System.out.println("* A submarine of length " + submarine.returnLength());
		ships.add(submarine);
		System.out.println("* A destroyer of length " + destroyer.returnLength());
		ships.add(destroyer);
	}

	/**
	 * @return The list of ships
	 */
	public ArrayList<Ship> getShipList()
	{
		return ships;
	}
}
