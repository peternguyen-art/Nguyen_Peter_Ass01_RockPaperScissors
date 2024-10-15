import java.util.Scanner;
public class Game {
    public static void main(String [] args) {
        String playerA = "";
        String playerB = "";
        boolean yay = false;
        String again = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors");
        do {
            System.out.print("Player a go (r/p/s): ");

            do {
                if (in.hasNextLine()) {
                    playerA = in.nextLine();
                    yay = true;

                    if (!playerA.equalsIgnoreCase("r")
                            && !playerA.equalsIgnoreCase("p")
                            && !playerA.equalsIgnoreCase("s")) {
                        System.out.print("Please re-enter a valid input: ");
                        yay = false;
                    }
                }
            } while (!yay);

            System.out.print("Player b go (r/p/s): ");
            do {
                if (in.hasNextLine()) {
                    playerB = in.nextLine();
                    yay = true;


                    if (!playerB.equalsIgnoreCase("r")
                            && !playerB.equalsIgnoreCase("p")
                            && !playerB.equalsIgnoreCase("s")) {
                        System.out.print("Please re-enter a valid input: ");
                        yay = false;
                    }
                }
            } while (!yay);

            if(playerA.equalsIgnoreCase("r"))
            {
                if (playerB.equalsIgnoreCase("r"))
                {
                    System.out.println("It's a tie");
                } else if(playerB.equalsIgnoreCase("p")){
                    System.out.println("Player B wins!");
                } else {
                    System.out.println("Player A wins");
                }
            }
            if(playerA.equalsIgnoreCase("s"))
            {
                if (playerB.equalsIgnoreCase("r"))
                {
                    System.out.println("Player B wins");
                } else if(playerB.equalsIgnoreCase("p")){
                    System.out.println("Player A wins!");
                } else {
                    System.out.println("It's a tie!");
                }
            }
            if(playerA.equalsIgnoreCase("p"))
            {
                if (playerB.equalsIgnoreCase("r"))
                {
                    System.out.println("Player A wins");
                } else if(playerB.equalsIgnoreCase("p")){
                    System.out.println("It's a tie!");
                } else {
                    System.out.println("Player B wins");
                }
            }

            System.out.print("Do you want to play again(y/n)? ");
            again = in.nextLine();
        }while(again.equalsIgnoreCase("y"));
    }
}
