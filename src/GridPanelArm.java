import javax.swing.*;
import java.awt.*;

public class GridPanelArm extends JPanel {
    JButton button = new JButton(new ImageIcon("images\\arm\\덤벨컬.jpg"));
    JButton button1 = new JButton(new ImageIcon("images\\arm\\바벨컬.jpg"));
    JButton button2 = new JButton(new ImageIcon("images\\arm\\벤치딥.jpg"));
    JButton button3 = new JButton(new ImageIcon("images\\arm\\인클라인덤벨컬.jpg"));
    JButton button4 = new JButton(new ImageIcon("images\\arm\\트라이셉스익스텐션.jpg"));
    JButton button5 = new JButton(new ImageIcon("images\\arm\\해머컬.jpg"));
    GridPanelArm(){
        gridPanelInit();

    }

    void gridPanelInit(){
        setLayout(new GridLayout(2,3));
        setOpaque(true);
        setBackground(Color.RED);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
    }
}
