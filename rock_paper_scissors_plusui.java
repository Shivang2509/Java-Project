import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rock_paper_scissors_plusui extends JFrame implements ActionListener {

    JLabel title, userLabel, computerLabel, resultLabel;
    JButton rockBtn, paperBtn, scissorBtn;

    String[] choices = {"rock", "paper", "scissor"};

    rock_paper_scissors_plusui() {

        setTitle("Rock Paper Scissors");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ===== Title =====
        title = new JLabel("ROCK  PAPER  SCISSORS", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        title.setOpaque(true);
        title.setBackground(new Color(45, 52, 54));
        title.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        add(title, BorderLayout.NORTH);

        // ===== Center Panel =====
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 1, 10, 10));
        center.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        userLabel = new JLabel("Your Choice: ", JLabel.CENTER);
        computerLabel = new JLabel("Computer Choice: ", JLabel.CENTER);
        resultLabel = new JLabel("Result: ", JLabel.CENTER);

        Font textFont = new Font("Arial", Font.BOLD, 16);

        userLabel.setFont(textFont);
        computerLabel.setFont(textFont);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));

        center.add(userLabel);
        center.add(computerLabel);
        center.add(resultLabel);

        add(center, BorderLayout.CENTER);

        // ===== Buttons Panel =====
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(1, 3, 15, 15));
        buttons.setBorder(BorderFactory.createEmptyBorder(15, 20, 20, 20));

        rockBtn = new JButton("🪨 Rock");
        paperBtn = new JButton("📄 Paper");
        scissorBtn = new JButton("✂️ Scissor");

        styleButton(rockBtn);
        styleButton(paperBtn);
        styleButton(scissorBtn);

        rockBtn.addActionListener(this);
        paperBtn.addActionListener(this);
        scissorBtn.addActionListener(this);

        buttons.add(rockBtn);
        buttons.add(paperBtn);
        buttons.add(scissorBtn);

        add(buttons, BorderLayout.SOUTH);

        setVisible(true);
    }

    void styleButton(JButton btn) {
        btn.setFont(new Font("Arial", Font.BOLD, 15));
        btn.setFocusPainted(false);
        btn.setBackground(new Color(99, 110, 114));
        btn.setForeground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String userChoice = "";

        if (e.getSource() == rockBtn)
            userChoice = "rock";
        else if (e.getSource() == paperBtn)
            userChoice = "paper";
        else if (e.getSource() == scissorBtn)
            userChoice = "scissor";

        int num = (int)(Math.random() * 3);
        String computerChoice = choices[num];

        userLabel.setText("Your Choice: " + userChoice.toUpperCase());
        computerLabel.setText("Computer Choice: " + computerChoice.toUpperCase());

        if (userChoice.equals(computerChoice)) {
            resultLabel.setText("Result: MATCH DRAW 🤝");
            resultLabel.setForeground(Color.ORANGE);
        }
        else if (
            (userChoice.equals("rock") && computerChoice.equals("scissor")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissor") && computerChoice.equals("paper"))
        ) {
            resultLabel.setText("Result: YOU WIN 🎉");
            resultLabel.setForeground(new Color(0, 184, 148));
        }
        else {
            resultLabel.setText("Result: YOU LOSE 😢");
            resultLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new rock_paper_scissors_plusui();
    }
}
