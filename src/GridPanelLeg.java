import javax.swing.*;
import java.awt.*;

public class GridPanelLeg extends JPanel {
    JButton button = new JButton(new ImageIcon("images\\leg\\런지.jpg"));
    JButton button1 = new JButton(new ImageIcon("images\\leg\\레그익스텐션.jpg"));
    JButton button2 = new JButton(new ImageIcon("images\\leg\\레그컬.jpg"));
    JButton button3 = new JButton(new ImageIcon("images\\leg\\루마니안데드리프트.jpg"));
    JButton button4 = new JButton(new ImageIcon("images\\leg\\스쿼트.jpg"));
    JButton button5 = new JButton(new ImageIcon("images\\leg\\카프레이즈.jpg"));
    GridPanelLeg(){
        gridPanelInit();
    }
    void gridPanelInit(){
        setLayout(new GridLayout(2,3));
        setOpaque(true);
        setBackground(Color.GREEN);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
    }
}
