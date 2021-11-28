import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
        TitleLabel label = new TitleLabel();
        Menu menu = new Menu();
        MidPanel mid = new MidPanel();
        String str;
        JPopupMenu popup = new JPopupMenu();
        JMenuItem add;
        JMenuItem delete;
        int key;
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
        popupInit();
        popupAndPhoto();
        addListener();
    }
    void addDialog(){
        String addPhotoName = JOptionPane.showInputDialog("어떤 사진으로 추가(수정)하시겠습니까?");
        mid.pane.backs.addPhoto(addPhotoName);

    }
    void deleteDialog(){
        String deletePhotoName = JOptionPane.showInputDialog("어떤 사진을 삭제하시겠습니까?");
        if(key == 0){
            mid.pane.backs.deletePhoto(deletePhotoName);
            mid.descript.setText("");
        }else if(key == 1){
            mid.pane.chests.deletePhoto(deletePhotoName);
            mid.descript.setText("");
        }else if(key == 2){
            mid.pane.shoulders.deletePhoto(deletePhotoName);
            mid.descript.setText("");
        }else if(key == 3){
            mid.pane.legs.deletePhoto(deletePhotoName);
            mid.descript.setText("");
        }else{
            mid.pane.arms.deletePhoto(deletePhotoName);
            mid.descript.setText("");
        }
    }
    void popupInit(){
        add = new JMenuItem("추가(수정)");
        delete = new JMenuItem("삭제");
        add.addActionListener(e -> addDialog());
        delete.addActionListener(e -> deleteDialog());
        popup.add(add);
        popup.add(delete);
    }
    void popupAndPhoto(){
        for(int i=0;i<mid.pane.backs.back.length;i++){
            for(int j=0;j<mid.pane.backs.back[i].buttons.length;j++){
                int finalI = i;
                int finalJ = j;
                mid.pane.backs.back[i].buttons[j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if((e.getModifiersEx() & InputEvent.BUTTON3_DOWN_MASK) != 0){
                            //mid.pane.backs.back[1].buttons[1].requestFocus();
                            key = 0;
                            popup.show(mid.pane.backs.back[finalI].buttons[finalJ],e.getX(),e.getY());
                        }
                    }
                });
            }
        }
        for(int i=0;i<mid.pane.chests.chest.length;i++){
            for(int j=0;j<mid.pane.chests.chest[i].buttons.length;j++){
                int finalI = i;
                int finalJ = j;
                mid.pane.chests.chest[i].buttons[j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if((e.getModifiersEx() & InputEvent.BUTTON3_DOWN_MASK) != 0){
                            //mid.pane.backs.back[1].buttons[1].requestFocus();
                            key = 1;
                            popup.show(mid.pane.chests.chest[finalI].buttons[finalJ],e.getX(),e.getY());
                        }
                    }
                });
            }
        }
        for(int i=0;i<mid.pane.shoulders.shoulder.length;i++){
            for(int j=0;j<mid.pane.shoulders.shoulder[i].buttons.length;j++){
                int finalI = i;
                int finalJ = j;
                mid.pane.shoulders.shoulder[i].buttons[j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if((e.getModifiersEx() & InputEvent.BUTTON3_DOWN_MASK) != 0){
                            key = 2;
                            popup.show(mid.pane.shoulders.shoulder[finalI].buttons[finalJ],e.getX(),e.getY());
                        }
                    }
                });
            }
        }
        for(int i=0;i<mid.pane.legs.leg.length;i++){
            for(int j=0;j<mid.pane.legs.leg[i].buttons.length;j++){
                int finalI = i;
                int finalJ = j;
                mid.pane.legs.leg[i].buttons[j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if((e.getModifiersEx() & InputEvent.BUTTON3_DOWN_MASK) != 0){
                            key = 3;
                            popup.show(mid.pane.legs.leg[finalI].buttons[finalJ],e.getX(),e.getY());
                        }
                    }
                });
            }
        }
        for(int i=0;i<mid.pane.arms.arm.length;i++){
            for(int j=0;j<mid.pane.arms.arm[i].buttons.length;j++){
                int finalI = i;
                int finalJ = j;
                mid.pane.arms.arm[i].buttons[j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if((e.getModifiersEx() & InputEvent.BUTTON3_DOWN_MASK) != 0){
                            key = 4;
                            popup.show(mid.pane.arms.arm[finalI].buttons[finalJ],e.getX(),e.getY());
                        }
                    }
                });
            }
        }
    }
    void menuAndPanel(){// 메뉴와 midPanel의 연동을 위한 버튼 클릭 리스너를 등록
        menu.menuButton[0].addActionListener(e -> {
            str = e.getActionCommand();

            //mid.pane.backs.requestFocus();
            if( str.equals("Back")) {
                mid.pane.card.show(mid.pane,"등");
                mid.pane.backs.requestFocus();
            }
        });
        menu.menuButton[1].addActionListener(e -> {
            str = e.getActionCommand();
            if( str.equals("Chest")){
                mid.pane.card.show(mid.pane,"가슴");
                mid.pane.chests.requestFocus();
            }
        });
        menu.menuButton[2].addActionListener(e -> {
            str = e.getActionCommand();
            if( str.equals("Shoulder")){
                mid.pane.card.show(mid.pane,"어깨");
                mid.pane.shoulders.requestFocus();
            }
        });
        menu.menuButton[3].addActionListener(e -> {
            str = e.getActionCommand();
            if( str.equals("Leg")){
                mid.pane.card.show(mid.pane,"하체");
                mid.pane.legs.requestFocus();
            }
        });
        menu.menuButton[4].addActionListener(e -> {
            str = e.getActionCommand();
            if( str.equals("Arm")){
                mid.pane.card.show(mid.pane,"팔");
                mid.pane.arms.requestFocus();
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
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    mid.pane.backs.card.show(mid.pane.backs,"1");
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
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    mid.pane.chests.card.show(mid.pane.chests,"1");
                }
            }
        });
        mid.pane.shoulders.requestFocus();
        mid.pane.shoulders.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode == KeyEvent.VK_LEFT){
                    mid.pane.shoulders.card.show(mid.pane.shoulders,"0");
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    mid.pane.shoulders.card.show(mid.pane.shoulders,"1");
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
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    mid.pane.legs.card.show(mid.pane.legs,"1");
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
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    mid.pane.arms.card.show(mid.pane.arms,"1");
                }
            }
        });

    }
    public static void main(String[] args) {
        new Main();
    }
}
