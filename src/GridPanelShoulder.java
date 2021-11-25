import javax.swing.*;
import java.awt.*;

public class GridPanelShoulder extends JPanel {
    JButton button = new JButton(new ImageIcon("images\\shoulder\\덤벨숄더프레스.jpg"));
    JButton button1 = new JButton(new ImageIcon("images\\shoulder\\벤트오버레터럴레이즈.jpg"));
    JButton button2 = new JButton(new ImageIcon("images\\shoulder\\업라이트로우.jpg"));
    JButton button3 = new JButton(new ImageIcon("images\\shoulder\\오버헤드프레스.jpg"));
    JButton button4 = new JButton(new ImageIcon("images\\shoulder\\사이드레터럴레이즈.jpg"));
    JButton button5 = new JButton(new ImageIcon("images\\shoulder\\프런트레이즈.jpg"));
    GridPanelShoulder(){
        gridPanelInit();
    }
    void gridPanelInit(){
        setLayout(new GridLayout(2,3));
        setOpaque(true);
        setBackground(Color.BLACK);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
    }
}
