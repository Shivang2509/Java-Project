import javax.swing.JOptionPane;

public class rock_paper_scissors_ui {
    public static void main(String[] args) {

        String user = JOptionPane.showInputDialog(
                null,
                "Enter Rock, Paper or Scissor",
                "Rock Paper Scissor",
                JOptionPane.QUESTION_MESSAGE
        );

        if (user == null) {
            return;
        }

        user = user.toLowerCase();

        String[] choice = {"rock", "paper", "scissor"};
        int num = (int)(Math.random() * 3);
        String computer = choice[num];

        String result;

        if (user.equals(computer)) {
            result = "Match Draw";
        }
        else if (
            (user.equals("rock") && computer.equals("scissor")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissor") && computer.equals("paper"))
        ) {
            result = "You Win 🎉";
        }
        else {
            result = "You Lose 😢";
        }

        JOptionPane.showMessageDialog(
                null,
                "You chose: " + user +
                "\nOpponent chose: " + computer +
                "\n\nResult: " + result,
                "Game Result",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
