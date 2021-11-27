import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
        addListener();
        this.mid.pane.backs.requestFocus();
        this.mid.pane.chests.requestFocus();

    }
    void menuAndPanel(){// 메뉴와 midPanel의 연동을 위한 버튼 클릭 리스너를 등록
        menu.menuButton[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = e.getActionCommand();
                mid.pane.backs.requestFocus();
                if( str.equals("등")) {
                    mid.pane.card.show(mid.pane,"등");
                }
            }
        });
        menu.menuButton[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = e.getActionCommand();
                mid.pane.chests.requestFocus();
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
                    mid.pane.shoulders.requestFocus();
                    mid.pane.card.show(mid.pane,"어깨");
                }
            }
        });
        menu.menuButton[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = e.getActionCommand();
                if( str.equals("하체")){
                    mid.pane.legs.requestFocus();
                    mid.pane.card.show(mid.pane,"하체");
                }
            }
        });
        menu.menuButton[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = e.getActionCommand();
                if( str.equals("팔")){
                    mid.pane.arms.requestFocus();
                    mid.pane.card.show(mid.pane,"팔");
                }
            }
        });
    }
    void addListener(){
        mid.pane.backs.requestFocus();
        mid.pane.backs.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode == KeyEvent.VK_LEFT){
                    mid.pane.backs.card.show(mid.pane.backs,"0");
                    System.out.println("0");
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    mid.pane.backs.card.show(mid.pane.backs,"1");
                    System.out.println("1");
                }
            }
        });
        mid.pane.chests.requestFocus();
        mid.pane.chests.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode == KeyEvent.VK_LEFT){
                    mid.pane.chests.card.show(mid.pane.chests,"0");
                    System.out.println("2");
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    mid.pane.chests.card.show(mid.pane.chests,"1");
                    System.out.println("3");
                }
            }
        });
        mid.pane.legs.requestFocus();
        mid.pane.legs.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode == KeyEvent.VK_LEFT){
                    mid.pane.legs.card.show(mid.pane.legs,"0");
                    System.out.println("4");
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    mid.pane.legs.card.show(mid.pane.legs,"1");
                    System.out.println("5");
                }
            }
        });
        mid.pane.arms.requestFocus();
        mid.pane.arms.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode == KeyEvent.VK_LEFT){
                    mid.pane.arms.card.show(mid.pane.arms,"0");
                    System.out.println("6");
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    mid.pane.arms.card.show(mid.pane.arms,"1");
                    System.out.println("7");
                }
            }
        });
    }
    public static void main(String[] args) {
        new Main();
    }
}
