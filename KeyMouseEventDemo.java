import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyMouseEventDemo extends JFrame {
    private JTextArea textArea;

    public KeyMouseEventDemo() {
        
        setTitle("Key and Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

    
        textArea.addMouseListener(new MouseAdapter() {
           
            public void mouseClicked(MouseEvent e) {
                textArea.append("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")\n");
            }
        });

       
        textArea.addKeyListener(new KeyAdapter() {
           
            public void keyPressed(KeyEvent e) {
                textArea.append("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
            }
        });

        
        textArea.setFocusable(true);
        textArea.requestFocusInWindow();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KeyMouseEventDemo demo = new KeyMouseEventDemo();
            demo.setVisible(true);
        });
    }
}
