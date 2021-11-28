import ImagePathStorage.ImageList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BackCardView extends JPanel {
    int MAX=2;
    int count=0;
    ImageList imageList = new ImageList();
    List<String> backList = new ArrayList<>();
    List<String> backDescript = new ArrayList<>();
    CardLayout card = new CardLayout();
    GridPanel[] back = new GridPanel[MAX];
    BackCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }

    void addPhoto(String str){
        for(int i=0;i<back.length;i++){
            for(int j=0;j<back[i].buttons.length;j++){
                try{
                    if(imageList.imagePathsBack.get(j+i*6).replace("images\\back\\","").equals(str+".jpg")){
                        backList.add(count,imageList.imagePathsBack.get(j+i*6));
                        backDescript.add(count,imageList.descriptsBack.get(j+i*6));
                    }
                }catch (Exception ignored){}
            }
        }
        try{
            for(int i=0;i<back.length;i++){
                for(int j=0;j<back[i].buttons.length;j++){
                    try{
                        back[i].buttons[j].setIcon(new ImageIcon(backList.get(j+i*6)));
                    }catch (Exception ignored){}
                }
            }
        }catch (Exception ignored){}
        count=0;
        for (String s : backList) {
            if (!s.equals("")) {
                count++;
            }
        }
        if(count > 6){
            add(back[1],"1");
            card.show(this,"1");
        }
    }


    void deletePhoto(String str){
        for(int i=0;i<back.length;i++){
            for(int j=0;j<back[i].buttons.length;j++){
                try{
                    if(backList.get(j+i*6).replace("images\\back\\","").equals(str+".jpg")){
                        backList.remove(j+i*6);
                        backDescript.remove(j+i*6);
                    }
                }catch (Exception ignored){}
            }
        }
        try{
            for(int i=0;i<back.length;i++){
                for(int j=0;j<back[i].buttons.length;j++){
                    try{
                        back[i].buttons[j].setIcon(new ImageIcon(backList.get(j+i*6)));
                    }catch (Exception ignored){}
                }
            }
        }catch (Exception ignored){

        }
        count=0;
        for (String s : backList) {
            if (!s.equals("")) {
                count++;
            }
        }
        if(count == 6){
            remove(back[1]);
        }

    }
    public void subPanelInit(){
        for(int i=0;i<back.length;i++){
            back[i] = new GridPanel();
        }

        for(int i=0;i<back.length;i++){
            for(int j=0;j<back[i].buttons.length;j++){
                try{
                    backList.add(imageList.imagePathsBack.get(j+i*6));
                }catch (Exception e){
                    backList.add("");
                }
            }
        }

        for(int i=0;i<back.length;i++){
            for(int j=0;j<back[i].buttons.length;j++){
                try{
                    back[i].buttons[j] = new JButton(new ImageIcon(backList.get(j+i*6)));
                    back[i].add(back[i].buttons[j]);
                }catch (Exception e){
                    back[i].buttons[j] = new JButton("");
                    back[i].add(back[i].buttons[j]);
                }

            }
        }

        for(int i=0;i<back.length;i++){
            for(int j=0;j<back[i].buttons.length;j++){
                try{
                    backDescript.add(imageList.descriptsBack.get(j+i*6));
                }catch (Exception e){
                    backDescript.add("");
                }
            }
        }

    }
    void Init(){
        add(back[0],"0");
        add(back[1],"1");
        card.show(this,"0");
    }



}
