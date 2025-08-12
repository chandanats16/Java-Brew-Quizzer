package quizapplication;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 800, 600);  // Increased size
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Heading
        JLabel heading = new JLabel("Thank you " + name + " for playing Mind Quest!");
        heading.setBounds(50, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);

        // Correct Answers Label
        JLabel correctLabel = new JLabel("Correct Answers:");
        correctLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        correctLabel.setBounds(50, 80, 200, 30);
        add(correctLabel);

        // List of correct answers
        String[] correctAnswers = {
            "1. JDB", "2. int", "3. java.util package", "4. Marker Interface", 
            "5. Heap memory", "6. Remote interface", "7. import", "8. Java Archive", 
            "9. java.lang.StringBuilder", "10. Bytecode is executed by JVM"
        };
        JTextArea answersArea = new JTextArea();
        answersArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        answersArea.setEditable(false);
        for (String ans : correctAnswers) {
            answersArea.append(ans + "\n");
        }

        JScrollPane scrollPane = new JScrollPane(answersArea);
        scrollPane.setBounds(50, 120, 400, 200); // Position left side
        add(scrollPane);

        // Score label
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(50, 340, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(lblscore);

        // Play Again button
        JButton submit = new JButton("Play Again");
        submit.setBounds(50, 400, 150, 35);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Tahoma", Font.BOLD, 14));
        submit.addActionListener(this);
        add(submit);

        // Score image (Right side)
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(520, 300, 200, 200);  // Adjusted to right-bottom
        add(image);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();  // Assuming Login class exists
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
