import java.util.Scanner;

public class rock_paper_scissors_byword {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        System.out.println("[ Rock, Paper, Scissor]");
        System.out.print("Enter From Above: ");
        String user=s.next().toLowerCase();

        String[] choice = {"rock", "paper", "scissor"};
        int num = (int)(Math.random() * 3); 
        String computer = choice[num];
        System.out.println("Opponent number: "+computer);


        if (user==computer) {
            System.out.println("Match Draw");}

            else if (
            (user.equals("rock") && computer.equals("scissor")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissor") && computer.equals("paper")))
            {
            System.out.println("you win");}

            else {
                System.out.println("You Lose");
            }
            s.close();
        }

    }






