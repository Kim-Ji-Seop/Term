import ImagePathStorage.ImageList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShoulderCardView extends JPanel {
    int MAX=2;
    int count=0;
    List<String> shoulderList = new ArrayList<>();
    List<String> shoulderDescript = new ArrayList<>();
    CardLayout card = new CardLayout();
    ImageList imageList = new ImageList();
    GridPanel[] shoulder = new GridPanel[MAX];

    ShoulderCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    void addPhoto(String str){
        for(int i=0;i<shoulder.length;i++){
            for(int j=0;j<shoulder[i].buttons.length;j++){
                try{
                    if(imageList.imagePathsShoulder.get(j+i*6).replace("images\\shoulder\\","").equals(str+".jpg")){
                        shoulderList.add(count,imageList.imagePathsShoulder.get(j+i*6));
                        shoulderDescript.add(count,imageList.descriptsShoulder.get(j+i*6));
                    }
                }catch (Exception ignored){}
            }
        }
        try{
            for(int i=0;i<shoulder.length;i++){
                for(int j=0;j<shoulder[i].buttons.length;j++){
                    try{
                        shoulder[i].buttons[j].setIcon(new ImageIcon(shoulderList.get(j+i*6)));
                    }catch (Exception ignored){}
                }
            }
        }catch (Exception ignored){}
        count=0;
        for (String s : shoulderList) {
            if (!s.equals("")) {
                count++;
            }
        }
        if(count > 6){
            add(shoulder[1],"1");
            card.show(this,"1");
        }
    }
    void deletePhoto(String str){
        for(int i=0;i<shoulder.length;i++){
            for(int j=0;j<shoulder[i].buttons.length;j++){
                try{
                    if(shoulderList.get(j+i*6).replace("images\\shoulder\\","").equals(str+".jpg")){
                        shoulderList.remove(j+i*6);
                        shoulderDescript.remove(j+i*6);
                    }
                }catch (Exception ignored){}
            }
        }
        count=0;
        for (String s : shoulderList) {
            if (!s.equals("")) {
                count++;
            }
        }

        try{
            for(int i=0;i<shoulder.length;i++){
                for(int j=0;j<shoulder[i].buttons.length;j++){
                    try{
                        shoulder[i].buttons[j].setIcon(new ImageIcon(shoulderList.get(j+i*6)));
                    }catch (Exception ignored){}
                }
            }
        }catch (Exception ignored){

        }
        if(count == 6){
            remove(shoulder[1]);
        }
    }
    void subPanelInit(){
        for(int i=0;i<shoulder.length;i++){
            shoulder[i] = new GridPanel();
        }
        //////////////////////////////////////////////////////////////////////////////////////
        for(int i=0;i<shoulder.length;i++){
            for(int j=0;j<shoulder[i].buttons.length;j++){
                try{
                    shoulderList.add(imageList.imagePathsShoulder.get(j+i*6));
                }catch (Exception e){
                    shoulderList.add("");
                }
            }
        }

        for(int i=0;i<shoulder.length;i++){
            for(int j=0;j<shoulder[i].buttons.length;j++){
                try{
                    shoulder[i].buttons[j] = new JButton(new ImageIcon(shoulderList.get(j+i*6)));
                    shoulder[i].add(shoulder[i].buttons[j]);
                }catch (Exception e){
                    shoulder[i].buttons[j] = new JButton("");
                    shoulder[i].add(shoulder[i].buttons[j]);
                }

            }
        }

        for(int i=0;i<shoulder.length;i++){
            for(int j=0;j<shoulder[i].buttons.length;j++){
                try{
                    shoulderDescript.add(imageList.descriptsShoulder.get(j+i*6));
                }catch (Exception e){
                    shoulderDescript.add("");
                }
            }
        }
        count=0;
        for (String s : shoulderList) {
            if (!s.equals("")) {
                count++;
            }
        }
        if(count == 6){
            remove(shoulder[1]);
        }
    }
    void Init(){
        add(shoulder[0],"0");
        add(shoulder[1],"1");
        card.show(this,"0");
    }
}
