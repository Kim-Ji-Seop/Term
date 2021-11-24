import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MidPanel extends JPanel {
    Description descript = new Description();
    Border border = BorderFactory.createLineBorder(Color.black);
    GridPanelChest chest = new GridPanelChest();
    GridPanelShoulder shoulder = new GridPanelShoulder();
    GridPanelLeg leg = new GridPanelLeg();
    GridPanelArm arm = new GridPanelArm();
    GridPanelBack back = new GridPanelBack();
    MidPanel(){
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        setBorder(border);
        InitGrid();
        add(descript,BorderLayout.SOUTH);
    }
    void InitGrid(){

        add(chest);
        add(shoulder);
        add(leg);
        add(arm);
        add(back);
    }

}
