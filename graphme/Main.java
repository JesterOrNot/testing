import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grapher");
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ProcessBuilder pb = new ProcessBuilder("python3","graph.py");
                try {
                    Process p = pb.start();
                } catch (IOException e) {
                    // Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        // ProcessBuilder pb = new ProcessBuilder("python3","graph.py");
        // try {
		// 	Process p = pb.start();
		// } catch (IOException e) {
		// 	// Auto-generated catch block
		// 	e.printStackTrace();
        // }
    }
}