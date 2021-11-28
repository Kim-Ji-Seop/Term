import ImagePathStorage.ImageList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LegCardView extends JPanel{
    int MAX=2;
    int count=0;
    java.util.List<String> legList = new ArrayList<>();
    List<String> legDescript = new ArrayList<>();
    CardLayout card = new CardLayout();
    GridPanel[] leg = new GridPanel[MAX];
    ImageList imageList = new ImageList();
    LegCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    void addPhoto(String str){
        for(int i=0;i<leg.length;i++){
            for(int j=0;j<leg[i].buttons.length;j++){
                try{
                    if(imageList.imagePathsLeg.get(j+i*6).replace("images\\leg\\","").equals(str+".jpg")){
                        legList.add(count,imageList.imagePathsLeg.get(j+i*6));
                        legDescript.add(count,imageList.descriptsLeg.get(j+i*6));
                    }
                }catch (Exception ignored){}
            }
        }
        try{
            for(int i=0;i<leg.length;i++){
                for(int j=0;j<leg[i].buttons.length;j++){
                    try{
                        leg[i].buttons[j].setIcon(new ImageIcon(legList.get(j+i*6)));
                    }catch (Exception ignored){}
                }
            }
        }catch (Exception ignored){}
        count=0;
        for (String s : legList) {
            if (!s.equals("")) {
                count++;
            }
        }
        if(count > 6){
            add(leg[1],"1");
            card.show(this,"1");
        }
    }
    void deletePhoto(String str){
        for(int i=0;i<leg.length;i++){
            for(int j=0;j<leg[i].buttons.length;j++){
                try{
                    if(legList.get(j+i*6).replace("images\\leg\\","").equals(str+".jpg")){
                        legList.remove(j+i*6);
                        legDescript.remove(j+i*6);
                    }
                }catch (Exception ignored){}
            }
        }
        count=0;
        for (String s : legList) {
            if (!s.equals("")) {
                count++;
            }
        }

        try{
            for(int i=0;i<leg.length;i++){
                for(int j=0;j<leg[i].buttons.length;j++){
                    try{
                        leg[i].buttons[j].setIcon(new ImageIcon(legList.get(j+i*6)));
                    }catch (Exception ignored){}
                }
            }
        }catch (Exception ignored){

        }
        if(count == 6){
            remove(leg[1]);
        }
    }
    void subPanelInit(){
        for(int i=0;i<leg.length;i++){
            leg[i] = new GridPanel();
        }
        //////////////////////////////////////////////////////////////////////////////////////
        for(int i=0;i<leg.length;i++){
            for(int j=0;j<leg[i].buttons.length;j++){
                try{
                    legList.add(imageList.imagePathsLeg.get(j+i*6));
                }catch (Exception e){
                    legList.add("");
                }
            }
        }
        for(int i=0;i<leg.length;i++){
            for(int j=0;j<leg[i].buttons.length;j++){
                try{
                    leg[i].buttons[j] = new JButton(new ImageIcon(legList.get(j+i*6)));
                    leg[i].add(leg[i].buttons[j]);
                }catch (Exception e){
                    leg[i].buttons[j] = new JButton("");
                    leg[i].add(leg[i].buttons[j]);
                }

            }
        }
        for(int i=0;i<leg.length;i++){
            for(int j=0;j<leg[i].buttons.length;j++){
                try{
                    legDescript.add(imageList.descriptsLeg.get(j+i*6));
                }catch (Exception e){
                    legDescript.add("");
                }
            }
        }
    }
    void Init(){
        add(leg[0],"0");
        add(leg[1],"1");
        card.show(this,"0");
    }
}