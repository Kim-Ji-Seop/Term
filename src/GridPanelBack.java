import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GridPanelBack extends JPanel implements MouseListener {
    //GridPanelBack back = new GridPanelBack();
    //isRightMouseButton(MouseEvent anEvent) - 마우스 우클릭
    JPopupMenu pm = new JPopupMenu();
    JMenuItem insert = new JMenuItem("사진 추가");
    JMenuItem delete = new JMenuItem("사진 삭제");
    GridPanelBack(){
        gridPanelInit();
    }
    void gridPanelInit(){
        setLayout(new GridLayout(2,3));
        setOpaque(true);
        setBackground(Color.blue);
        add(pm);
        pm.add(insert);
        pm.addSeparator();
        pm.add(delete);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) {
            pm.show(this, e.getX(), e.getY());
        }
    }
    @Override
    public void mousePressed(MouseEvent e){}
    @Override
    public void mouseReleased(MouseEvent e){}
    @Override
    public void mouseEntered(MouseEvent e){}
    @Override
    public void mouseExited(MouseEvent e){}
}
