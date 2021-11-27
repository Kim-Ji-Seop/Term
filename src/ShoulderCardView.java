import javax.swing.*;
import java.awt.*;

public class ShoulderCardView extends JPanel {
    CardLayout card = new CardLayout();
    GridPanel shoulder = new GridPanel();
    ShoulderCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    void subPanelInit(){
        //////////////////////////////////////////////////////////////////////////////////////
       shoulder.button  = new JButton(new ImageIcon("images\\shoulder\\덤벨숄더프레스.jpg"));
       shoulder.button1 = new JButton(new ImageIcon("images\\shoulder\\벤트오버레터럴레이즈.jpg"));
       shoulder.button2 = new JButton(new ImageIcon("images\\shoulder\\업라이트로우.jpg"));
       shoulder.button3 = new JButton(new ImageIcon("images\\shoulder\\오버헤드프레스.jpg"));
       shoulder.button4 = new JButton(new ImageIcon("images\\shoulder\\사이드레터럴레이즈.jpg"));
       shoulder.button5 = new JButton(new ImageIcon("images\\shoulder\\프런트레이즈.jpg"));
       shoulder.add(shoulder.button);
       shoulder.add(shoulder.button1);
       shoulder.add(shoulder.button2);
       shoulder.add(shoulder.button3);
       shoulder.add(shoulder.button4);
       shoulder.add(shoulder.button5);
    }
    void Init(){
        add(shoulder,"0");
        card.show(this,"0");
    }
}
