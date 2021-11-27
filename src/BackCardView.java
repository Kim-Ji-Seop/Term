import javax.swing.*;
import java.awt.*;

public class BackCardView extends JPanel {
    CardLayout card = new CardLayout();
    GridPanel[] back = new GridPanel[2];
    BackCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    void subPanelInit(){
        for(int i=0;i<2;i++){
            back[i] = new GridPanel();
        }
        //////////////////////////////////////////////////////////////////////////////////////
        back[0].button  = new JButton(new ImageIcon("images\\back\\데드리프트.jpg"));
        back[0].button1 = new JButton(new ImageIcon("images\\back\\렛풀다운.jpg"));
        back[0].button2 = new JButton(new ImageIcon("images\\back\\바벨로우.jpg"));
        back[0].button3 = new JButton(new ImageIcon("images\\back\\시티드로우.jpg"));
        back[0].button4 = new JButton(new ImageIcon("images\\back\\원암덤벨로우.jpg"));
        back[0].button5 = new JButton(new ImageIcon("images\\back\\케이블 풀오버.jpg"));
        back[0].add(back[0].button);
        back[0].add(back[0].button1);
        back[0].add(back[0].button2);
        back[0].add(back[0].button3);
        back[0].add(back[0].button4);
        back[0].add(back[0].button5);
        //////////////////////////////////////////////////////////////////////////////////////
        back[1].button  = new JButton(new ImageIcon("images\\back\\티바로우.jpg"));
        back[1].button1 = new JButton(new ImageIcon("images\\back\\풀업.jpg"));
        back[1].button2 = new JButton(new ImageIcon(""));
        back[1].button3 = new JButton(new ImageIcon(""));
        back[1].button4 = new JButton(new ImageIcon(""));
        back[1].button5 = new JButton(new ImageIcon(""));
        back[1].add(back[1].button);
        back[1].add(back[1].button1);
        back[1].add(back[1].button2);
        back[1].add(back[1].button3);
        back[1].add(back[1].button4);
        back[1].add(back[1].button5);
    }
    void Init(){
        add(back[0],"0");
        add(back[1],"1");
        card.show(this,"0");
    }
}
