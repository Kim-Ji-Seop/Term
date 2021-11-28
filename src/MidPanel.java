import ex.ImageList;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MidPanel extends JPanel {
    Description descript = new Description();
    Border border = BorderFactory.createLineBorder(Color.black);
    CardViewInMidPanel pane = new CardViewInMidPanel();
    MidPanel(){
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        setBorder(border);
        InitPanel();
        addListener();

    }
    void InitPanel(){
        add(pane);
        add(descript,BorderLayout.SOUTH);
    }

    void addListener(){
        for(int i=0;i<pane.backs.back.length;i++){
            for(int j=0;j<pane.backs.back[i].buttons.length;j++){
                int finalJ = j;
                int finalI = i;
                pane.backs.back[i].buttons[j].addActionListener(e -> {
                    pane.backs.requestFocus();
                    descript.setText(pane.backs.backDescript.get(finalJ + finalI *6));
                });
            }
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //가슴운동 사진 클릭 시
        for(int i=0;i<pane.chests.chest.length;i++){
            for(int j=0;j<pane.chests.chest[i].buttons.length;j++){
                int finalJ = j;
                int finalI = i;
                pane.chests.chest[i].buttons[j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pane.chests.requestFocus();
                        descript.setText(pane.chests.chestDescript.get(finalJ + finalI *6));
                    }
                });
            }
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //어깨운동 사진 클릭 시
        for(int i=0;i<pane.shoulders.shoulder.length;i++){
            for(int j=0;j<pane.shoulders.shoulder[i].buttons.length;j++){
                int finalJ = j;
                int finalI = i;
                pane.shoulders.shoulder[i].buttons[j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pane.shoulders.requestFocus();
                        descript.setText(pane.shoulders.shoulderDescript.get(finalJ + finalI *6));
                    }
                });
            }
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //하체운동 사진 클릭 시
        for(int i=0;i<pane.legs.leg.length;i++){
            for(int j=0;j<pane.legs.leg[i].buttons.length;j++){
                int finalJ = j;
                int finalI = i;
                pane.legs.leg[i].buttons[j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pane.legs.requestFocus();
                        descript.setText(pane.legs.legDescript.get(finalJ + finalI *6));
                    }
                });
            }
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //팔운동 사진 클릭 시
        for(int i=0;i<pane.arms.arm.length;i++){
            for(int j=0;j<pane.arms.arm[i].buttons.length;j++){
                int finalJ = j;
                int finalI = i;
                pane.arms.arm[i].buttons[j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pane.arms.requestFocus();
                        descript.setText(pane.arms.armDescript.get(finalJ + finalI *6));
                    }
                });
            }
        }
    }

}
