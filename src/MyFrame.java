import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,640);
        this.setIconImage(new ImageIcon(getClass().getResource("p.PNG")).getImage());
        this.getContentPane().setBackground(new Color(136,51,240));
//        this.setForeground(Color.WHITE);
    }
}
