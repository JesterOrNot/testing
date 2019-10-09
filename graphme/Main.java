import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends Canvas{

    //I made these instance variables
    //Note: i is a TERRIBLE name for a variable.  img, image, etc are better
    private Toolkit t=Toolkit.getDefaultToolkit();
    private Image i=t.getImage("images/graph.png");

    //I wrote this method to load the image using a different function
    //getImage returns a cahced version of the file, while createImage
    //always loads new data
    public void reloadImage() {
        t.createImage("images/graph.png");
    }

    //simply draw the image, no loading!
    public void paint(Graphics g) {
        g.drawImage(i, 0,0,this);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grapher");
        JButton button = new JButton("Submit");
        JPanel panel = new JPanel();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ProcessBuilder pb = new ProcessBuilder("python3","graph.py");

                /* I moved this command up here so that the variable main could be used in the try */
                Main main = new Main();

                try {
                    Process p = pb.start();

                    /* This command will make this Java program wait for the python program to finish */
                    try {
						p.waitFor();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

                    /* call my method to load the new image */
                    main.reloadImage();

                    /* This command will force the paint method to be called again and redraw the image */
                    main.repaint();
                } catch (IOException e) {
                    // Auto-generated catch block
                    e.printStackTrace();
                }

                frame.add(main);
                frame.setVisible(true);
            }
        });
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        panel.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}