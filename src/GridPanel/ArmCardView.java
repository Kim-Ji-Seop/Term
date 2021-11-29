package GridPanel;

import ImagePathStorage.ImageList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArmCardView extends JPanel {
    int MAX=2;
    int count=0; //리스트에 저장되어있는 경로의 수를 구하기 위한 변수이다.
    public List<String> armList = new ArrayList<>(); // 사진경로 리스트에서 경로를 불러오면 팔운동에 관한 사진은 이 리스트에 저장된다.
    public List<String> armDescript = new ArrayList<>();       // 사진에 대한 설명은 이 리스트에 저장된다.
    public ImageList imageList = new ImageList();
    public CardLayout card = new CardLayout();
    public GridPanel[] arm = new GridPanel[MAX];
    public ArmCardView(){
        setLayout(card);
        subPanelInit();
        Init();
    }
    public void addPhoto(String str){ // 사진을 추가하는 함수
        for(int i=0;i<arm.length;i++){
            for(int j=0;j<arm[i].buttons.length;j++){
                try{                                               //리스트에 저장된 경로중에서 사진파일의 상위 디렉토리인 images/arm/이라는 경로를 따로 분리해준다(파싱)
                    if(imageList.imagePathsArm.get(j+i*6).replace("images\\arm\\","").equals(str+".jpg")){
                        armList.add(count,imageList.imagePathsArm.get(j+i*6)); // 팔운동 사진 리스트를 동기화시켜주는 것이라고 생각해주면 된다.
                        armDescript.add(count,imageList.descriptsArm.get(j+i*6));
                    }
                }catch (Exception ignored){}
            }
        }
        try{
            for(int i=0;i<arm.length;i++){
                for(int j=0;j<arm[i].buttons.length;j++){
                    try{
                        arm[i].buttons[j].setIcon(new ImageIcon(armList.get(j+i*6))); //setIcon이라는 함수를 사용해 줘야 버튼상의 이미지가 바뀔 수 있다.
                    }catch (Exception ignored){}
                }
            }
        }catch (Exception ignored){}
        count=0;
        for (String s : armList) { // 해당 리스트에 있는 String 값 중에서 빈문자열이 아닌 경로가 저장이 되어있는지를 확인하는 반복문이다.
            if (!s.equals("")) { // 만약에 경로가 있다면 갯수를 증가시키므로
                count++;        // count변수는 리스트에 저장되어있는 경로의 수(사진의 수)라고 보면 된다.
            }
        }
        if(count > 6){
            add(arm[1],"1");// 한 화면에 6개의 사진이 들어가 있으므로 해당사진이 6개가 넘어가면 패널을 하나 더 추가하고
            card.show(this,"1"); // 추가했음을 직관적으로 알기 위해서 해당 패널로 넘어가게 된다.
        }
    }
    public void deletePhoto(String str){
        for(int i=0;i<arm.length;i++){
            for(int j=0;j<arm[i].buttons.length;j++){
                try{
                    if(armList.get(j+i*6).replace("images\\arm\\","").equals(str+".jpg")){
                        armList.remove(j+i*6); // 리스트에 저장된 사진을 삭제한다. 사진설명또한 삭제한다.
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
    public void subPanelInit(){
        for(int i=0;i<arm.length;i++){ // 패널배열에 관한 초기선언을 해준다.
            arm[i] = new GridPanel();
        }

        for(int i=0;i<arm.length;i++){
            for(int j=0;j<arm[i].buttons.length;j++){
                try{
                    armList.add(imageList.imagePathsArm.get(j+i*6)); // imageList의 갯수가 패널에 저장될 수 있는 사진의 갯수보다 적을 경우엔
                }catch (Exception e){                               // 인덱스 에러가 날 수 있기 때문에  try-catch문으로 보호하고
                    armList.add("");                                // 에러가 나는 경우에, 해당 리스트에는 빈문자열을 적어두기로했다.
                }
            }
        }

        for(int i=0;i<arm.length;i++){
            for(int j=0;j<arm[i].buttons.length;j++){
                try{
                    arm[i].buttons[j] = new JButton(new ImageIcon(armList.get(j+i*6)));// 버튼들을 이미지들로 초기화하는 코드
                    arm[i].add(arm[i].buttons[j]); //패널에 이미지 추가
                }catch (Exception e){
                    arm[i].buttons[j] = new JButton("");
                    arm[i].add(arm[i].buttons[j]);
                }

            }
        }

        for(int i=0;i<arm.length;i++){
            for(int j=0;j<arm[i].buttons.length;j++){
                try{
                    armDescript.add(imageList.descriptsArm.get(j+i*6)); // 설명 추가
                }catch (Exception e){
                    armDescript.add("");
                }
            }
        }
    }
    public void Init(){
        add(arm[0],"0");
        add(arm[1],"1");
        card.show(this,"0"); // 처음에 메인으로 보일 화면을 지정해준다.
    }
}
