import javax.swing.*;
import java.awt.*;

public class ChestCardView extends JPanel {
    CardLayout card = new CardLayout();
    GridPanel[] chest = new GridPanel[2];
    ChestCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    void subPanelInit(){
        for(int i=0;i<2;i++){
            chest[i] = new GridPanel();
        }
        //////////////////////////////////////////////////////////////////////////////////////
        chest[0].button  = new JButton(new ImageIcon("images\\chest\\덤벨프레스.jpg"));
        chest[0].button1 = new JButton(new ImageIcon("images\\chest\\딥스.jpg"));
        chest[0].button2 = new JButton(new ImageIcon("images\\chest\\벤치프레스.jpg"));
        chest[0].button3 = new JButton(new ImageIcon("images\\chest\\인클라인 벤치프레스.jpg"));
        chest[0].button4 = new JButton(new ImageIcon("images\\chest\\체스트프레스.jpg"));
        chest[0].button5 = new JButton(new ImageIcon("images\\chest\\케이블오버.jpg"));
        chest[0].add(chest[0].button);
        chest[0].add(chest[0].button1);
        chest[0].add(chest[0].button2);
        chest[0].add(chest[0].button3);
        chest[0].add(chest[0].button4);
        chest[0].add(chest[0].button5);
        //////////////////////////////////////////////////////////////////////////////////////
        chest[1].button  = new JButton(new ImageIcon("images\\chest\\펙덱플라이.jpg"));
        chest[1].button1 = new JButton(new ImageIcon("images\\chest\\푸쉬업.jpg"));
        chest[1].button2 = new JButton(new ImageIcon(""));
        chest[1].button3 = new JButton(new ImageIcon(""));
        chest[1].button4 = new JButton(new ImageIcon(""));
        chest[1].button5 = new JButton(new ImageIcon(""));

        chest[1].add(chest[1].button);
        chest[1].add(chest[1].button1);
        chest[1].add(chest[1].button2);
        chest[1].add(chest[1].button3);
        chest[1].add(chest[1].button4);
        chest[1].add(chest[1].button5);


    }
    void Init(){
        add(chest[0],"0");
        add(chest[1],"1");
        card.show(this,"0");
    }
}
