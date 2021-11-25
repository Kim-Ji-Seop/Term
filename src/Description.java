import javax.swing.*;
import java.awt.*;

public class Description extends JLabel {
    public Description(){
        setPreferredSize(new Dimension(30,70));
        setHorizontalAlignment(JLabel.CENTER);
        setFont(new Font("Cascadia Mono",Font.BOLD,15));
        setFont(getFont().deriveFont(15.0f));
        setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        setText("설명란");
    }
}
