import javax.swing.*;
import java.awt.*;

public class CardViewInMidPanel extends JPanel {
    GridPanelChest chest = new GridPanelChest();
    GridPanelShoulder shoulder = new GridPanelShoulder();
    GridPanelLeg leg = new GridPanelLeg();
    GridPanelArm arm = new GridPanelArm();
    GridPanelBack back = new GridPanelBack();
    CardLayout card = new CardLayout();
    CardViewInMidPanel(){
        setLayout(card);
        Init();
    }
    void Init(){
        add("등",back);
        add("가슴",chest);
        add("어깨",shoulder);
        add("하체",leg);
        add("팔",arm);
        card.show(this,"등");
    }

}
