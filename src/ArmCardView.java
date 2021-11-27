import javax.swing.*;
import java.awt.*;

public class ArmCardView extends JPanel {
    CardLayout card = new CardLayout();
    GridPanel[] arm = new GridPanel[2];
    ArmCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    void subPanelInit(){
        for(int i=0;i<2;i++){
            arm[i] = new GridPanel();
        }
        //////////////////////////////////////////////////////////////////////////////////////
        arm[0].button  = new JButton(new ImageIcon("images\\arm\\덤벨컬.jpg"));
        arm[0].button1 = new JButton(new ImageIcon("images\\arm\\바벨컬.jpg"));
        arm[0].button2 = new JButton(new ImageIcon("images\\arm\\벤치딥.jpg"));
        arm[0].button3 = new JButton(new ImageIcon("images\\arm\\인클라인덤벨컬.jpg"));
        arm[0].button4 = new JButton(new ImageIcon("images\\arm\\트라이셉스익스텐션.jpg"));
        arm[0].button5 = new JButton(new ImageIcon("images\\arm\\해머컬.jpg"));
        arm[0].add(arm[0].button);
        arm[0].add(arm[0].button1);
        arm[0].add(arm[0].button2);
        arm[0].add(arm[0].button3);
        arm[0].add(arm[0].button4);
        arm[0].add(arm[0].button5);
        //////////////////////////////////////////////////////////////////////////////////////
        arm[1].button  = new JButton(new ImageIcon("images\\arm\\트라이셉스케이블프레스다운.jpg"));
        arm[1].button1 = new JButton(new ImageIcon("images\\arm\\트라이셉스킥백.jpg"));
        arm[1].button2 = new JButton(new ImageIcon(""));
        arm[1].button3 = new JButton(new ImageIcon(""));
        arm[1].button4 = new JButton(new ImageIcon(""));
        arm[1].button5 = new JButton(new ImageIcon(""));
        arm[1].add(arm[1].button);
        arm[1].add(arm[1].button1);
        arm[1].add(arm[1].button2);
        arm[1].add(arm[1].button3);
        arm[1].add(arm[1].button4);
        arm[1].add(arm[1].button5);
    }
    void Init(){
        add(arm[0],"0");
        add(arm[1],"1");
        card.show(this,"0");
    }
}
