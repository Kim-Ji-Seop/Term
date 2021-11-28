package ex;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ImageList {
    public List<String> imagePathsBack = new ArrayList<>();
    public List<String> imagePathsChest = new ArrayList<>();
    public List<String> imagePathsShoulder = new ArrayList<>();
    public List<String> imagePathsLeg = new ArrayList<>();
    public List<String> imagePathsArm = new ArrayList<>();
    File file = new File("images"); // images파일 기준의 file변수
    File[] subfiles = file.listFiles();//file의 하위 경로를 subfiles에 담는다.
    File[] sub1 = new File[5];//경로를 저장해둘 배열 변수를 선언한다.
    File[] sub2;//sub1의 listFiles를 넣을 변수를 선언한다.
    public List<String> descriptsBack = new ArrayList<>();
    public List<String> descriptsChest = new ArrayList<>();
    public List<String> descriptsShoulder = new ArrayList<>();
    public List<String> descriptsLeg = new ArrayList<>();
    public List<String> descriptsArm = new ArrayList<>();
    public ImageList(){
        filePathInList();
        descriptInit();
    }
    void filePathInList() {//외부 폴더의 경로를 저장하여 사진을 리스트에 저장하는 함수
        for (int i = 0; i < subfiles.length; i++) {
            sub1[i] = new File(subfiles[i].getPath());
            sub2 = sub1[i].listFiles();
            if (sub2 != null) {
                for (int j = 0; j < sub2.length; j++) {
                    if (sub1[i].getName().equals("arm")) {
                        imagePathsArm.add(j, sub2[j].getPath());
                    } else if (sub1[i].getName().equals("back")) {
                        imagePathsBack.add(j, sub2[j].getPath());
                    } else if (sub1[i].getName().equals("chest")) {
                        imagePathsChest.add(j, sub2[j].getPath());
                    } else if (sub1[i].getName().equals("leg")) {
                        imagePathsLeg.add(j, sub2[j].getPath());
                    } else {
                        imagePathsShoulder.add(j, sub2[j].getPath());
                    }
                }
            }
        }
    }
    public void descriptInit(){//사진에 대한 설명을 리스트에 저장하는 함수
        //등운동 설명리스트 -------------------------------------------------------------------------------------------
        descriptsBack.add("데드리프트 - 코어에 힘을 주어 바벨을 수직으로 들어올리는 운동");
        descriptsBack.add("렛풀다운 - 케이블을 수직으로 내려 등에 자극을 주는 운동");
        descriptsBack.add("바벨로우 - 바벨을 잡고 하는 로우운동");
        descriptsBack.add("시티드로우 - 앉아서 케이블을 당기는 방식으로 수행한다.");
        descriptsBack.add("원암덤벨로우 - 바벨을 쓰지않고 덤벨을 사용하는 로우 운동");
        descriptsBack.add("케이블풀오버 - 케이블을 이용하며 팔로 잡아당기며 수행한다.");
        descriptsBack.add("티바로우 - 좁은 그립으로 로우를 수행한다.");
        descriptsBack.add("풀업 - 견갑을 고정하고 가슴이 철봉을 향하게 등으로 당겨줌.");

        //가슴운동 설명리스트 -----------------------------------------------------------------------------------------
        descriptsChest.add("덤벨프레스 - 벤치에 누워 덤벨로 수행하는 가슴운동");
        descriptsChest.add("딥스 - 평행봉을 이용하여 몸을 수직으로 상승,하강을 반복하는 운동");
        descriptsChest.add("벤치프레스 - 벤치에 누워 바벨로 수행하는 가슴운동");
        descriptsChest.add("인클라인 벤치프레스 - 45도 정도 기울어진 벤치에 몸을 기대어 수행");
        descriptsChest.add("체스트 프레스 - 머신을 잡고 수평방향으로 밀어서 가슴을 수축한다.");
        descriptsChest.add("케이블 오버 - 케이블을 상체로 들어올려 가슴하부를 자극");
        descriptsChest.add("펙덱플라이 - 케이블을 상체로 들어올려 가슴하부를 자극");
        descriptsChest.add("푸쉬업 - '팔굽혀펴기' 이며 팔을 구부렸다 펴며 가슴을 자극");

        //어깨운동 설명리스트 -----------------------------------------------------------------------------------------
        descriptsShoulder.add("덤벨숄더프레스 - 덤벨을 만세하듯 위로 올려 어깨를 자극");
        descriptsShoulder.add("벤트오버레터럴레이즈 - 레이즈 행위를 뒤로하여 후면어깨를 자극");
        descriptsShoulder.add("사이드레터럴레이즈 - 레이즈 행위를 양쪽으로 하여 측면어깨를 자극");
        descriptsShoulder.add("업라이트로우 - 바벨을 가슴까지 들어올려 어깨를 자극");
        descriptsShoulder.add("오버헤드프레스 - 바벨을 만세하듯 들어올려 어깨 전반을 자극");
        descriptsShoulder.add("프런트레이즈 - 레이즈 행위를 앞으로 하여 전면어깨를 자극");

        //하체운동 설명리스트 -----------------------------------------------------------------------------------------
        descriptsLeg.add("런지 - 정면을 보고 서서 한쪽 다리를 뒤쪽으로 내딛으며 무릎을 굽힌다.");
        descriptsLeg.add("레그익스텐션 - 단순하게 무릎을 펴는 동작");
        descriptsLeg.add("레그컬 - 패드에 누워 무릎을 접는 동시에 허벅지를 패드에서 들어준다");
        descriptsLeg.add("레그프레스 - 기구에 기대어 무게를 버티고 미는 운동");
        descriptsLeg.add("루마니안데드리프트 - 데드리프트의 동작에서 바벨을 땅에 놓지않는다.");
        descriptsLeg.add("스쿼트 - 고관절을 뒤로빼고 상체를 일자로 하여 앉았다 일어선다.");
        descriptsLeg.add("카프레이즈 - 종아리를 자극하는 운동");

        //팔운동 설명리스트 -------------------------------------------------------------------------------------------
        descriptsArm.add("덤벨컬 - 덤벨을 이용하여 이두를 자극하는 운동");
        descriptsArm.add("바벨컬 - 바벨을 이용하여 이두를 자극하는 운동");
        descriptsArm.add("벤치딥 - 벤치에 팔을 지탱하여 삼두를 자극하는 운동");
        descriptsArm.add("인클라인덤벨컬 - 다른 근육의 개입을 없애고 팔에만 집중하는 덤벨컬");
        descriptsArm.add("트라이셉스익스텐션 - 바벨로 삼두를 자극하는 운동");
        descriptsArm.add("트라이셉스케이블프레스다운 - 팔을 구부린 상태에서 펴며 수축");
        descriptsArm.add("트라이셉스킥백 - 덤벨컬과 비슷한 방식에 반대로 생각하면 된다.");
        descriptsArm.add("해머컬 - 팔의 전완근, 이두 바깥라인을 잡아주는 운동");
    }

}
