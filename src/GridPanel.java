import javax.swing.*;
import java.awt.*;



public class GridPanel extends JPanel {
    JButton button;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    GridPanel(){
        gridPanelInit();

    }
    void gridPanelInit(){
        setLayout(new GridLayout(2,3));

    }


}
