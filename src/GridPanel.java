import javax.swing.*;
import java.awt.*;



public class GridPanel extends JPanel {
    JButton[] buttons = new JButton[6];
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
        for(int i=0;i<buttons.length;i++){
            buttons[i] = new JButton();
        }
        setLayout(new GridLayout(2,3));
    }
}
