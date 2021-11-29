import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    TitleLabel label = new TitleLabel();
    Menu menu = new Menu();
    MidPanel mid = new MidPanel();
    String str;
    JPopupMenu popup = new JPopupMenu(); //팝업 객체
    JMenuItem add; // 팝업 안에 들어갈 추가 아이템
    JMenuItem delete; // 삭제아이템
    int key; // 팝업으로 추가 / 삭제를 눌렀을 때, 5개의 메뉴중에서 어디 메뉴를 선택했는지에 대한 key값이다. 이 값에 따라 추가,삭제함수로 분기된다.
    Main(){
        setTitle("Term Project");
        setBackground(Color.WHITE);
        setLayout(new BorderLayout(0,0));
        add(menu, BorderLayout.WEST);          // 이 프레임엔 메뉴 패널, 타이틀라벨, 미드 패널이 존재한다.
        add(label.title,BorderLayout.NORTH);
        add(mid,BorderLayout.CENTER);
        setResizable(false);         //프레임의 크기를 고정한다.
        setLocation(600, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(590, 500);
        setVisible(true);
        menuAndPanel();//메뉴와 미드패널간의 리스너에 대한 반응을 정의한 함수.
        popupInit();//팝업을 초기화한 함수.
        popupAndPhoto();//마우스 우클릭 -> 팝업메뉴나타남을 구현.
        addListener();//키보드 리스너를 등록한 함수다. 방향키 좌우로 화면을 넘길 수 있게 구현했음. shoulder부분은 예외임. 안넘어가게 해놨음.
    }
    void addDialog(){//다이얼로그를 띄운다.
        String addPhotoName = JOptionPane.showInputDialog("어떤 사진으로 추가하시겠습니까?(운동명을 적어주세요)");// 여기서 적은 문자열을 각 메뉴의 addPhoto함수의 인자로 넣는다.
        if(key == 0){                                                                                    // 문자열.jpg의 상위디렉토리 path를 따로 파싱하여 경로를 추가하고 삭제한다.
            mid.pane.backs.addPhoto(addPhotoName);
            mid.descript.setText("");
        }else if(key == 1){
            System.out.println(addPhotoName);
            mid.pane.chests.addPhoto(addPhotoName);
            mid.descript.setText("");
        }else if(key == 2){
            mid.pane.shoulders.addPhoto(addPhotoName);
            mid.descript.setText("");
        }else if(key == 3){
            mid.pane.legs.addPhoto(addPhotoName);
            mid.descript.setText("");
        }else{
            mid.pane.arms.addPhoto(addPhotoName);
            mid.descript.setText("");
        }
    }
    void deleteDialog(){//삭제 다이얼로그
        String deletePhotoName = JOptionPane.showInputDialog("어떤 사진을 삭제하시겠습니까?(운동명을 적어주세요)");
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
        add = new JMenuItem("사진 추가");
        delete = new JMenuItem("사진 삭제");
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

            if( str.equals("Back")) {
                mid.pane.card.show(mid.pane,"등");
                mid.pane.backs.requestFocus();           //키보드와 마우스리스너에는 requestFocus()함수가 있어야함. 해당 컴포넌트의 포커싱이 중요하기 때문이다.
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
    void addListener(){   // 키보드리스너를 구현해놨다.
        mid.pane.backs.requestFocus();
        mid.pane.backs.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode == KeyEvent.VK_LEFT){ //키보드 좌방향키
                    mid.pane.backs.card.show(mid.pane.backs,"0");
                }
                if(keyCode == KeyEvent.VK_RIGHT){//키보드 우방향키
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
