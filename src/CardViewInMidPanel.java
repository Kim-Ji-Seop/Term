import javax.swing.*;
import java.awt.*;

public class CardViewInMidPanel extends JPanel {
    CardLayout card = new CardLayout();
    BackCardView backs = new BackCardView();
    ChestCardView chests = new ChestCardView();
    ShoulderCardView shoulders = new ShoulderCardView();
    LegCardView legs = new LegCardView();
    ArmCardView arms = new ArmCardView();
    CardViewInMidPanel(){
        setLayout(card);
        Init();
    }
    void Init(){
        add("등",backs);
        add("가슴",chests);
        add("어깨",shoulders);
        add("하체",legs);
        add("팔",arms);
        card.show(this,"등");
    }

}
