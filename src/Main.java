import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    TitleLabel label = new TitleLabel();
    Menu menu = new Menu();
    MidPanel mid = new MidPanel();
    String str;

    Main(){
        setTitle("Term Project");
        setBackground(Color.WHITE);
        setLayout(new BorderLayout(0,0));
        add(menu, BorderLayout.WEST);
        add(label.title,BorderLayout.NORTH);
        add(mid,BorderLayout.CENTER);
        setResizable(false);
        setLocation(600, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(590, 500);
        setVisible(true);
        menuAndPanel();
    }
    void menuAndPanel(){
        menu.menuButton[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = e.getActionCommand();
                if( str.equals("등")) {
                    mid.pane.card.show(mid.pane,"등");
                }
            }
        });
        menu.menuButton[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = e.getActionCommand();
                if( str.equals("가슴")){
                    mid.pane.card.show(mid.pane,"가슴");
                }
            }
        });
        menu.menuButton[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = e.getActionCommand();
                if( str.equals("어깨")){
                    mid.pane.card.show(mid.pane,"어깨");
                }
            }
        });
        menu.menuButton[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = e.getActionCommand();
                if( str.equals("하체")){
                    mid.pane.card.show(mid.pane,"하체");
                }
            }
        });
        menu.menuButton[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = e.getActionCommand();
                if( str.equals("팔")){
                    mid.pane.card.show(mid.pane,"팔");
                }
            }
        });
    }
    public static void main(String[] args) {
        new Main();
    }
}
