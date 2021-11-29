package GridPanel;

import javax.swing.*;
import java.awt.*;

public class CardViewInMidPanel extends JPanel {
    public CardLayout card = new CardLayout();
    public BackCardView backs = new BackCardView();      // 해당 클래스는 등,가슴,어깨,하체,팔 메뉴에 따른 화면전환을 위한 패널이기 때문에 CardLayout이며 이 패널엔 각 운동종목에 따른 패널이 존재한다.
    public ChestCardView chests = new ChestCardView();
    public ShoulderCardView shoulders = new ShoulderCardView();
    public LegCardView legs = new LegCardView();
    public ArmCardView arms = new ArmCardView();
    public CardViewInMidPanel(){
        setLayout(card);
        Init();
    }
    public void Init(){
        add("등",backs);
        add("가슴",chests);
        add("어깨",shoulders);
        add("하체",legs);
        add("팔",arms);
        card.show(this,"등");
    }

}
