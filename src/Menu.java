import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JPanel {
    JButton[] menuButton = new JButton[5];
    MidPanel midPanel = new MidPanel();
    public Menu() {
        InitMenuLabelData();
        buttonPressEffect();
    }
    public void InitMenuLabelData(){
        setLayout(new GridLayout(5,1,3,0));
        setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        for(int i=0;i<menuButton.length;i++){
            menuButton[i] = new JButton();
            menuButton[i].setOpaque(true);
            menuButton[i].setHorizontalAlignment(SwingConstants.CENTER);//가운데정렬
            menuButton[i].setBackground(Color.WHITE);
            menuButton[i].setFont(new Font(Font.MONOSPACED,Font.BOLD,15));
            menuButton[i].setBorder(BorderFactory.createEmptyBorder(0,5,0,5));
            add(menuButton[i]);
        }
        menuButton[0].setText("Back");
        menuButton[1].setText("Chest");
        menuButton[2].setText("Shoulder");
        menuButton[3].setText("Leg");
        menuButton[4].setText("Arm");
    }
    public void buttonPressEffect(){
        menuButton[0].addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                midPanel.pane.backs.requestFocus();
                menuButton[0] = (JButton)e.getSource();
                menuButton[0].setForeground(Color.RED);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                midPanel.pane.backs.requestFocus();
                menuButton[0] = (JButton)e.getSource();
                menuButton[0].setForeground(Color.BLACK);
            }
        });
        menuButton[1].addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                menuButton[1] = (JButton)e.getSource();
                menuButton[1].setForeground(Color.RED);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                menuButton[1] = (JButton)e.getSource();
                menuButton[1].setForeground(Color.BLACK);
            }
        });
        menuButton[2].addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                menuButton[2] = (JButton)e.getSource();
                menuButton[2].setForeground(Color.RED);

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                menuButton[2] = (JButton)e.getSource();
                menuButton[2].setForeground(Color.BLACK);
            }
        });
        menuButton[3].addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                menuButton[3] = (JButton)e.getSource();
                menuButton[3].setForeground(Color.RED);

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                menuButton[3] = (JButton)e.getSource();
                menuButton[3].setForeground(Color.BLACK);
            }
        });

        menuButton[4].addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                menuButton[4] = (JButton)e.getSource();
                menuButton[4].setForeground(Color.RED);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                menuButton[4] = (JButton)e.getSource();
                menuButton[4].setForeground(Color.BLACK);
            }
        });

    }
}
