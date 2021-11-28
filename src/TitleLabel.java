import javax.swing.*;
import java.awt.*;

public class TitleLabel {
    JLabel title = new JLabel("My Health Album");
    TitleLabel(){
        title.setPreferredSize(new Dimension(30,88));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Ink Free",Font.BOLD,30));
        title.setForeground(Color.BLACK);
        title.setFont(title.getFont().deriveFont(50.0f));
        title.setOpaque(true);
        title.setBackground(Color.WHITE);
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
    }
}
