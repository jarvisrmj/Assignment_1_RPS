import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        String playerA = "";
        String playerB = "";


        System.out.print("\nPlayer 1 enter your move [R,P,S]: ");
        if(in.hasNextLine())
        {
            playerA = in.nextLine();

            System.out.print("\nYou said your move is " + playerA);
        }


        System.out.print("\nPlayer 2 enter your move [R,P,S]: ");
        if(in.hasNextLine())

        {
            playerB = in.nextLine();

            System.out.print("\nYou said your move is " + playerB);
        }


        if (playerA.equalsIgnoreCase("R"))
        {
            //playerB code crossed against Player A rock move
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("\nRock vs Rock It's a TIE!");
            }
            if(playerB.equalsIgnoreCase("P"))
            {
                System.out.println("\nPaper covers Rock! Player B wins!");
            }
            if(playerB.equalsIgnoreCase("S"))
            {
                System.out.println("\nRock breaks Scissors! Player A wins!");
            }

        }
        else if (playerA.equalsIgnoreCase("P"))
        {
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("\nPaper covers Rock! Player A wins!");
            }
            if(playerB.equalsIgnoreCase("P"))
            {
                System.out.println("\nPaper vs Paper! Its a TIE!");
            }
            if(playerB.equalsIgnoreCase("S"))
            {
                System.out.println("\nScissors cuts Paper! Player B wins!");
            }

        }

        else if (playerA.equalsIgnoreCase("S"))
        {
            else if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("\nRock breaks Scissors! Player B wins!");
            }
            if(playerB.equalsIgnoreCase("P"))
            {
                System.out.println("\nScissors cut Paper! Player A wins!");
            }
            if(playerB.equalsIgnoreCase("S"))
            {
                System.out.println("\nScissors vs Scissors! Its a TIE!");
            }

        }

        

    }
}
