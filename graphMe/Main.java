import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends Canvas{

    public void paint(Graphics g) {

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("images/graph.png");
        g.drawImage(i, 0,0,this);

    }
    public static void main(String[] args) {
        Main main = new Main();
        JFrame frame = new JFrame("Grapher");
        JButton button = new JButton("Submit");
        JPanel panel = new JPanel();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ProcessBuilder pb = new ProcessBuilder("python3","graph.py");
                try {
                    Process p = pb.start();
                } catch (IOException e) {
                    // Auto-generated catch block
                    e.printStackTrace();
                }
                Main main = new Main();
                frame.add(main);
                frame.setVisible(true);
            }
        });
        frame.add(main);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        panel.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}