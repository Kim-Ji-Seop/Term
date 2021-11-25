import javax.swing.*;
import java.awt.*;



public class GridPanelBack extends JPanel {
    JButton button = new JButton(new ImageIcon("images\\back\\데드리프트.jpg"));
    JButton button1 = new JButton(new ImageIcon("images\\back\\렛풀다운.jpg"));
    JButton button2 = new JButton(new ImageIcon("images\\back\\바벨로우.jpg"));
    JButton button3 = new JButton(new ImageIcon("images\\back\\시티드로우.jpg"));
    JButton button4 = new JButton(new ImageIcon("images\\back\\원암덤벨로우.jpg"));
    JButton button5 = new JButton(new ImageIcon("images\\back\\케이블 풀오버.jpg"));
    GridPanelBack(){
        gridPanelInit();

    }
    void gridPanelInit(){
        setLayout(new GridLayout(2,3));
        setOpaque(true);
        setBackground(Color.blue);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
    }

}
