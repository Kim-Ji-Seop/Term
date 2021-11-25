import javax.swing.*;
import java.awt.*;

public class GridPanelChest extends JPanel {
    JButton button = new JButton(new ImageIcon("images\\chest\\덤벨프레스.jpg"));
    JButton button1 = new JButton(new ImageIcon("images\\chest\\딥스.jpg"));
    JButton button2 = new JButton(new ImageIcon("images\\chest\\벤치프레스.jpg"));
    JButton button3 = new JButton(new ImageIcon("images\\chest\\인클라인 벤치프레스.jpg"));
    JButton button4 = new JButton(new ImageIcon("images\\chest\\체스트프레스.jpg"));
    JButton button5 = new JButton(new ImageIcon("images\\chest\\케이블오버.jpg"));
    GridPanelChest(){
        gridPanelInit();
    }
    void gridPanelInit(){
        setLayout(new GridLayout(2,3));
        setOpaque(true);
        setBackground(Color.GRAY);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
    }
}
