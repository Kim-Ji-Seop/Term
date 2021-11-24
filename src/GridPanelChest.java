import javax.swing.*;
import java.awt.*;

public class GridPanelChest extends JPanel {
    GridPanelChest(){
        gridPanelInit();
    }
    void gridPanelInit(){
        setLayout(new GridLayout(2,3));
        setOpaque(true);
        setBackground(Color.GRAY);
    }
}
