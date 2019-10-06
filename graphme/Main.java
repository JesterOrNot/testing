import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("python3","graph.py");
        try {
			Process p = pb.start();
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
        }
    }
}