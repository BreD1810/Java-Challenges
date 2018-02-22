/**
 * This class is purely for a main method for program flow.
 */
public class Game {

    private void begin(Player player1, Player player2)
    {
        //Display the ships each player has, and place them.
        System.out.println("Player 1:");
        player1.outputShips();
        for (Ship ship: player1.getShipList())
        {
            player1.board.placeShip(ship);
        }
        player1.board.outputBoard();

        System.out.println("Player 2:");
        player2.outputShips();
        for (Ship ship: player2.getShipList())
        {
            player2.board.placeShip(ship);
        }
        player2.board.outputBoard();
    }

    public static void main(String[] args) {
        //Create the game and players
        Game game = new Game();
        Player player1 = new Player();
        Player player2 = new Player();

        //Begin the game
        game.begin(player1, player2);
    }

}
