import javax.swing.*;
import java.awt.*;

public class LegCardView extends JPanel{
    CardLayout card = new CardLayout();
    GridPanel[] leg = new GridPanel[2];
    LegCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    void subPanelInit(){
        for(int i=0;i<2;i++){
            leg[i] = new GridPanel();
        }
        //////////////////////////////////////////////////////////////////////////////////////
        leg[0].button  = new JButton(new ImageIcon("images\\leg\\런지.jpg"));
        leg[0].button1 = new JButton(new ImageIcon("images\\leg\\레그익스텐션.jpg"));
        leg[0].button2 = new JButton(new ImageIcon("images\\leg\\레그컬.jpg"));
        leg[0].button3 = new JButton(new ImageIcon("images\\leg\\루마니안데드리프트.jpg"));
        leg[0].button4 = new JButton(new ImageIcon("images\\leg\\스쿼트.jpg"));
        leg[0].button5 = new JButton(new ImageIcon("images\\leg\\카프레이즈.jpg"));
        leg[0].add(leg[0].button);
        leg[0].add(leg[0].button1);
        leg[0].add(leg[0].button2);
        leg[0].add(leg[0].button3);
        leg[0].add(leg[0].button4);
        leg[0].add(leg[0].button5);
        //////////////////////////////////////////////////////////////////////////////////
        leg[1].button  = new JButton(new ImageIcon("images\\leg\\레그프레스.jpg"));
        leg[1].button1  = new JButton(new ImageIcon(""));
        leg[1].button2  = new JButton(new ImageIcon(""));
        leg[1].button3  = new JButton(new ImageIcon(""));
        leg[1].button4  = new JButton(new ImageIcon(""));
        leg[1].button5  = new JButton(new ImageIcon(""));
        leg[1].add(leg[1].button);
        leg[1].add(leg[1].button1);
        leg[1].add(leg[1].button2);
        leg[1].add(leg[1].button3);
        leg[1].add(leg[1].button4);
        leg[1].add(leg[1].button5);
    }
    void Init(){
        add(leg[0],"0");
        add(leg[1],"1");
        card.show(this,"0");
    }
}