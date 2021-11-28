import javax.swing.*;
import java.awt.*;



public class GridPanel extends JPanel {
    JButton[] buttons = new JButton[6];

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
