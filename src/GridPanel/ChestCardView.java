package GridPanel;

import GridPanel.GridPanel;
import ImagePathStorage.ImageList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ChestCardView extends JPanel {
    int MAX=2;
    int count=0;
    public CardLayout card = new CardLayout();
    public GridPanel[] chest = new GridPanel[MAX];
    public ImageList imageList = new ImageList();
    public List<String> chestList = new ArrayList<>();
    public List<String> chestDescript = new ArrayList<>();
    public ChestCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    public void addPhoto(String str){
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
    public void deletePhoto(String str) {
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
    public void subPanelInit(){
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
    public void Init(){
        add(chest[0],"0");
        add(chest[1],"1");
        card.show(this,"0");
    }
}
