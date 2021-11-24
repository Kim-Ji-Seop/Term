import javax.swing.*;
import java.awt.*;

public class GridPanelShoulder extends JPanel {
    GridPanelShoulder(){
        gridPanelInit();
    }
    void gridPanelInit(){
        setLayout(new GridLayout(2,3));
        setOpaque(true);
        setBackground(Color.BLACK);
    }
}
