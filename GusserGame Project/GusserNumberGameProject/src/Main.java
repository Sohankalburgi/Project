import java.util.*;
// Game Gusser Game
// This game is to Take input from Gusser and 3 players the Number and check whether which player
// gives same input as that of gusser
class gusser
{
    private int GusserNumber;

    public void setGusserNumber(int GusserNumber) {
        this.GusserNumber = GusserNumber;
    }

    public int getGusserNumber() {
        return GusserNumber;
    }
}

class player
{
    int playerNumber;

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

}

class umpire
{
    int takeNoofGusser ;
    int takeNoofPlayer1;
    int takeNoofPlayer2;
    int takeNoofPlayer3;

    Scanner sc = new Scanner(System.in);
    gusser g = new gusser();
    player player1 = new player();
    player player2 = new player();
    player player3 = new player();

    public void setTakeNoofGusser() // get the input from the Gusser
    {
        System.out.println("Enter the Gusser Number :");
        g.setGusserNumber(sc.nextInt());
        this.takeNoofGusser = g.getGusserNumber();
    }

    public void setPlayersNumber() // getting the inputs from each player
    {
        // player1
        System.out.println("Enter the Number by Player1");
        player1.setPlayerNumber(sc.nextInt());
        takeNoofPlayer1 = player1.playerNumber;

        //player2
        System.out.println("Enter the Number by Player2");
        player2.setPlayerNumber(sc.nextInt());
        takeNoofPlayer2 = player2.playerNumber;

        //player3
        System.out.println("Enter the Number by Player3");
        player3.setPlayerNumber(sc.nextInt());
        takeNoofPlayer3 = player3.playerNumber;

    }

    public void result () // to do comparison and show the won player
    {
        if(takeNoofPlayer1==takeNoofGusser)
        {
            if(takeNoofPlayer2==takeNoofGusser && takeNoofPlayer3==takeNoofGusser)
            {
                System.out.println("All Three Players Won the Game");
            }
            else if(takeNoofPlayer2==takeNoofGusser)
            {
                System.out.println("1st and 2nd Players Won the Game");
            }
            else if(takeNoofPlayer3==takeNoofGusser)
            {
                System.out.println("1st and 3rd Players Won the Game");
            }
            else{
                System.out.println("1st Player Won the Game");
            }
        }
        else if(takeNoofPlayer2==takeNoofGusser)
        {
            if(takeNoofPlayer3==takeNoofGusser)
            {
                System.out.println("2nd and 3rd Players Won the Game");
            }
            else{
                System.out.println("2nd Player Won the Game");
            }
        }
        else if(takeNoofPlayer3==takeNoofGusser)
        {
            System.out.println("3rd Player Won the Game");
        }
        else{
            System.out.println("All Three Players Lost the Game");
        }
    }

}


public class Main {
    public static void main(String[] args)
    {
        umpire U = new umpire();
        U.setTakeNoofGusser();
        U.setPlayersNumber();
        U.result();
    }

}