import javax.swing.*;
import java.awt.*;

public class GridPanelArm extends JPanel {
    GridPanelArm(){
        gridPanelInit();
    }

    void gridPanelInit(){
        setLayout(new GridLayout(2,3));
        setOpaque(true);
        setBackground(Color.RED);
    }
}
