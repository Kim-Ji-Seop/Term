package GridPanel;

import ImagePathStorage.ImageList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShoulderCardView extends JPanel {
    int MAX=1;
    int count=0;
    public List<String> shoulderList = new ArrayList<>();
    public List<String> shoulderDescript = new ArrayList<>();
    public CardLayout card = new CardLayout();
    public ImageList imageList = new ImageList();
    public GridPanel[] shoulder = new GridPanel[MAX];

    public ShoulderCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    public void addPhoto(String str){
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
    }
    public void deletePhoto(String str){
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
                    }catch (Exception ignored){
                        shoulder[i].buttons[j].setIcon(new ImageIcon(""));
                    }
                }
            }
        }catch (Exception ignored){

        }
    }
    public void subPanelInit(){
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

    }
    public void Init(){
        add(shoulder[0],"0");
        card.show(this,"0");
    }
}
