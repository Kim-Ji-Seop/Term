import javax.swing.*;
import java.awt.*;

public class GridPanelLeg extends JPanel {
    GridPanelLeg(){
        gridPanelInit();
    }
    void gridPanelInit(){
        setLayout(new GridLayout(2,3));
        setOpaque(true);
        setBackground(Color.GREEN);
    }
}
