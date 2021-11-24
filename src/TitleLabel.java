import javax.swing.*;
import java.awt.*;

public class TitleLabel {
    JLabel title = new JLabel("헬스종목앨범");
    TitleLabel(){
        title.setPreferredSize(new Dimension(30,88));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Cascadia Mono",Font.BOLD,30));
        title.setForeground(Color.BLUE);
        title.setFont(title.getFont().deriveFont(30.0f));
        title.setOpaque(true);
        title.setBackground(Color.WHITE);
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
    }
}
