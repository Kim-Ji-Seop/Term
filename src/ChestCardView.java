import ImagePathStorage.ImageList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ChestCardView extends JPanel {
    int MAX=2;
    int count=0;
    CardLayout card = new CardLayout();
    GridPanel[] chest = new GridPanel[MAX];
    ImageList imageList = new ImageList();
    List<String> chestList = new ArrayList<>();
    List<String> chestDescript = new ArrayList<>();
    ChestCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    void addPhoto(String str){
        for(int i=0;i<chest.length;i++){
            for(int j=0;j<chest[i].buttons.length;j++){
                try{
                    if(imageList.imagePathsChest.get(j+i*6).replace("images\\chest\\","").equals(str+".jpg")){
                        chestList.add(count,imageList.imagePathsChest.get(j+i*6));
                        chestDescript.add(count,imageList.descriptsChest.get(j+i*6));
                    }
                }catch (Exception ignored){}
            }
        }
        try{
            for(int i=0;i<chest.length;i++){
                for(int j=0;j<chest[i].buttons.length;j++){
                    try{
                        chest[i].buttons[j].setIcon(new ImageIcon(chestList.get(j+i*6)));
                    }catch (Exception ignored){}
                }
            }
        }catch (Exception ignored){}
        count=0;
        for (String s : chestList) {
            if (!s.equals("")) {
                count++;
            }
        }
        if(count > 6){
            add(chest[1],"1");
            card.show(this,"1");
        }
    }
    void deletePhoto(String str) {
        for (int i = 0; i < chest.length; i++) {
            for (int j = 0; j < chest[i].buttons.length; j++) {
                try {
                    if (chestList.get(j + i * 6).replace("images\\chest\\", "").equals(str + ".jpg")) {
                        chestList.remove(j + i * 6);
                        chestDescript.remove(j + i * 6);
                    }
                } catch (Exception ignored) {
                }
            }
        }
        count = 0;
        for (String s : chestList) {
            if (!s.equals("")) {
                count++;
            }
        }
        if(count == 6){
            remove(chest[1]);
        }

        try {
            for (int i = 0; i < chest.length; i++) {
                for (int j = 0; j < chest[i].buttons.length; j++) {
                    try {
                        chest[i].buttons[j].setIcon(new ImageIcon(chestList.get(j + i * 6)));
                    } catch (Exception ignored) {
                    }
                }
            }
        } catch (Exception ignored) {

        }

    }
    void subPanelInit(){
        for(int i=0;i<chest.length;i++){
            chest[i] = new GridPanel();
        }
        for(int i=0;i<chest.length;i++){
            for(int j=0;j<chest[i].buttons.length;j++){
                try{
                    chestList.add(imageList.imagePathsChest.get(j+i*6));
                }catch (Exception e){
                    chestList.add("");
                }
            }
        }

        for(int i=0;i<chest.length;i++){
            for(int j=0;j<chest[i].buttons.length;j++){
                try{
                    chest[i].buttons[j] = new JButton(new ImageIcon(chestList.get(j+i*6)));
                    chest[i].add(chest[i].buttons[j]);
                }catch (Exception e){
                    chest[i].buttons[j] = new JButton("");
                    chest[i].add(chest[i].buttons[j]);
                }

            }
        }

        for(int i=0;i<chest.length;i++){
            for(int j=0;j<chest[i].buttons.length;j++){
                try{
                    chestDescript.add(imageList.descriptsChest.get(j+i*6));
                }catch (Exception e){
                    chestDescript.add("");
                }
            }
        }
    }
    void Init(){
        add(chest[0],"0");
        add(chest[1],"1");
        card.show(this,"0");
    }
}
