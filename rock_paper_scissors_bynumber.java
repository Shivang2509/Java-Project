import java.util.Scanner;

public class rock_paper_scissors_bynumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        System.out.println("[1 for Rock, 2 for Paper, 3 for Scissor]");
        System.out.print("Enter the number: ");
        int a=s.nextInt();

        int num = (int)(Math.random() * 3); 
        System.out.println("Opponent number: "+num);


        if (num==a) {
            System.out.println("Match Draw");}

            else if 
            ((a==1 && num==3) || (a==2 && num==1) || (a==3 && num==2)){
                
            System.out.println("you win");}

            else {
                System.out.println("You Lose");
            }
            s.close();
        }

    }


