import javax.swing.*;

public class MyLabel extends JLabel {
    MyLabel(){
        this.setText("Random generic text...");
        this.setSize(200,200);
        this.setIcon(new ImageIcon(getClass().getResource("tw.png")));
    }

}
