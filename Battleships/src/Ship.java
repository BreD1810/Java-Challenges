import java.util.ArrayList;

public class Ship {
	
	private int length;
	private ArrayList<Boolean> shipStatus = new ArrayList<Boolean>(); //True = hit, False = not hit

	/**
	 * Returns the length of the ship
	 * @return the length of the ship
	 */
	public int returnLength()
    {
		return length;
	}

    /**
     * Constructor - Create a ship with a set length and no hits
     * @param inputLength The length of the ship
     */
	Ship(int inputLength)
    {
	    //Set ships length
		length = inputLength;

		//Set the ships health as full
		for(int i = 0; i < inputLength; i++)
        {
            shipStatus.add(false);
        }
	}
}
