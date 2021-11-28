import ImagePathStorage.ImageList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArmCardView extends JPanel {
    int MAX=2;
    int count=0;
    java.util.List<String> armList = new ArrayList<>();
    List<String> armDescript = new ArrayList<>();
    ImageList imageList = new ImageList();
    CardLayout card = new CardLayout();
    GridPanel[] arm = new GridPanel[MAX];
    ArmCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    void addPhoto(String str){
        for(int i=0;i<arm.length;i++){
            for(int j=0;j<arm[i].buttons.length;j++){
                try{
                    if(imageList.imagePathsArm.get(j+i*6).replace("images\\arm\\","").equals(str+".jpg")){
                        armList.add(count,imageList.imagePathsArm.get(j+i*6));
                        armDescript.add(count,imageList.descriptsArm.get(j+i*6));
                    }
                }catch (Exception ignored){}
            }
        }
        try{
            for(int i=0;i<arm.length;i++){
                for(int j=0;j<arm[i].buttons.length;j++){
                    try{
                        arm[i].buttons[j].setIcon(new ImageIcon(armList.get(j+i*6)));
                    }catch (Exception ignored){}
                }
            }
        }catch (Exception ignored){}
        count=0;
        for (String s : armList) {
            if (!s.equals("")) {
                count++;
            }
        }
        if(count > 6){
            add(arm[1],"1");
            card.show(this,"1");
        }
    }
    void deletePhoto(String str){
        for(int i=0;i<arm.length;i++){
            for(int j=0;j<arm[i].buttons.length;j++){
                try{
                    if(armList.get(j+i*6).replace("images\\arm\\","").equals(str+".jpg")){
                        armList.remove(j+i*6);
                        armDescript.remove(j+i*6);
                    }
                }catch (Exception ignored){}
            }
        }
        count=0;
        for (String s : armList) {
            if (!s.equals("")) {
                count++;
            }
        }

        try{
            for(int i=0;i<arm.length;i++){
                for(int j=0;j<arm[i].buttons.length;j++){
                    try{
                        arm[i].buttons[j].setIcon(new ImageIcon(armList.get(j+i*6)));
                    }catch (Exception ignored){}
                }
            }
        }catch (Exception ignored){

        }
        if(count == 6){
            remove(arm[1]);
        }
    }
    void subPanelInit(){
        for(int i=0;i<arm.length;i++){
            arm[i] = new GridPanel();
        }

        for(int i=0;i<arm.length;i++){
            for(int j=0;j<arm[i].buttons.length;j++){
                try{
                    armList.add(imageList.imagePathsArm.get(j+i*6));
                }catch (Exception e){
                    armList.add("");
                }
            }
        }

        for(int i=0;i<arm.length;i++){
            for(int j=0;j<arm[i].buttons.length;j++){
                try{
                    arm[i].buttons[j] = new JButton(new ImageIcon(armList.get(j+i*6)));
                    arm[i].add(arm[i].buttons[j]);
                }catch (Exception e){
                    arm[i].buttons[j] = new JButton("");
                    arm[i].add(arm[i].buttons[j]);
                }

            }
        }

        for(int i=0;i<arm.length;i++){
            for(int j=0;j<arm[i].buttons.length;j++){
                try{
                    armDescript.add(imageList.descriptsArm.get(j+i*6));
                }catch (Exception e){
                    armDescript.add("");
                }
            }
        }
    }
    void Init(){
        add(arm[0],"0");
        add(arm[1],"1");
        card.show(this,"0");
    }
}
