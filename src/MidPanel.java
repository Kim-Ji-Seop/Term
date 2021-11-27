import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MidPanel extends JPanel {
    Description descript = new Description();
    Border border = BorderFactory.createLineBorder(Color.black);
    CardViewInMidPanel pane = new CardViewInMidPanel();
    int i=0;
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
        //등운동 사진 클릭 시
        pane.backs.back[0].button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pane.backs.requestFocus();
                descript.setText("데드리프트 - 코어에 힘을 주어 바벨을 수직으로 들어올리는 운동");
            }
        });
        pane.backs.back[0].button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.backs.requestFocus();
                descript.setText("렛풀다운 - 케이블을 수직으로 내려 등에 자극을 주는 운동");
            }
        });
        pane.backs.back[0].button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.backs.requestFocus();
                descript.setText("바벨로우 - 바벨을 잡고 하는 로우운동");
            }
        });
        pane.backs.back[0].button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.backs.requestFocus();
                descript.setText("시티드로우 - 앉아서 케이블을 당기는 방식으로 수행한다.");
            }
        });
        pane.backs.back[0].button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.backs.requestFocus();
                descript.setText("원암덤벨로우 - 바벨을 쓰지않고 덤벨을 사용하는 로우 운동");
            }
        });
        pane.backs.back[0].button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.backs.requestFocus();
                descript.setText("케이블풀오버 - 케이블을 이용하며 팔로 잡아당기며 수행한다.");
            }
        });
        // 등운동 앨범 다음패널
        pane.backs.back[1].button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.backs.requestFocus();
                descript.setText("티바로우 - 좁은 그립으로 로우를 수행한다.");
            }
        });
        pane.backs.back[1].button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.backs.requestFocus();
                descript.setText("풀업 - 견갑을 고정하고 가슴이 철봉을 향하게 등으로 당겨줌.");
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //가슴운동 사진 클릭 시
        pane.chests.chest[0].button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.chests.requestFocus();
                descript.setText("덤벨프레스 - 벤치에 누워 덤벨로 수행하는 가슴운동");
            }
        });
        pane.chests.chest[0].button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.chests.requestFocus();
                descript.setText("딥스 - 평행봉을 이용하여 몸을 수직으로 상승,하강을 반복하는 운동");
            }
        });
        pane.chests.chest[0].button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.chests.requestFocus();
                descript.setText("벤치프레스 - 벤치에 누워 바벨로 수행하는 가슴운동");
            }
        });
        pane.chests.chest[0].button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.chests.requestFocus();
                descript.setText("인클라인 벤치프레스 - 45도 정도 기울어진 벤치에 몸을 기대어 수행");
            }
        });
        pane.chests.chest[0].button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.chests.requestFocus();
                descript.setText("체스트 프레스 - 머신을 잡고 수평방향으로 밀어서 가슴을 수축한다.");
            }
        });
        pane.chests.chest[0].button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.chests.requestFocus();
                descript.setText("케이블 오버 - 케이블을 상체로 들어올려 가슴하부를 자극");
            }
        });
        pane.chests.chest[1].button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.chests.requestFocus();
                descript.setText("펙덱플라이 - 케이블을 상체로 들어올려 가슴하부를 자극");
            }
        });
        pane.chests.chest[1].button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.chests.requestFocus();
                descript.setText("푸쉬업 - '팔굽혀펴기' 이며 팔을 구부렸다 펴며 가슴을 자극");
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //어깨운동 사진 클릭 시
        pane.shoulders.shoulder.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.shoulders.requestFocus();
                descript.setText("덤벨숄더프레스 - 덤벨을 만세하듯 위로 올려 어깨를 자극");
            }
        });
        pane.shoulders.shoulder.button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.shoulders.requestFocus();
                descript.setText("벤트오버레터럴레이즈 - 레이즈 행위를 뒤로하여 후면어깨를 자극");
            }
        });
        pane.shoulders.shoulder.button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.shoulders.requestFocus();
                descript.setText("업라이트로우 - 바벨을 가슴까지 들어올려 어깨를 자극");
            }
        });
        pane.shoulders.shoulder.button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.shoulders.requestFocus();
                descript.setText("오버헤드프레스 - 바벨을 만세하듯 들어올려 어깨 전반을 자극");
            }
        });
        pane.shoulders.shoulder.button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.shoulders.requestFocus();
                descript.setText("사이드레터럴레이즈 - 레이즈 행위를 양쪽으로 하여 측면어깨를 자극");
            }
        });
        pane.shoulders.shoulder.button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.shoulders.requestFocus();
                descript.setText("프런트레이즈 - 레이즈 행위를 앞으로 하여 전면어깨를 자극");
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //하체운동 사진 클릭 시
        pane.legs.leg[0].button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.legs.requestFocus();
                descript.setText("런지 - 정면을 보고 서서 한쪽 다리를 뒤쪽으로 내딛으며 무릎을 굽힌다.");
            }
        });
        pane.legs.leg[0].button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.legs.requestFocus();
                descript.setText("레그익스텐션 - 단순하게 무릎을 펴는 동작");
            }
        });
        pane.legs.leg[0].button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.legs.requestFocus();
                descript.setText("레그컬 - 패드에 누워 무릎을 접는 동시에 허벅지를 패드에서 들어준다");
            }
        });
        pane.legs.leg[0].button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                descript.setText("루마니안데드리프트 - 데드리프트의 동작에서 바벨을 땅에 놓지않는다.");
            }
        });
        pane.legs.leg[0].button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.legs.requestFocus();
                descript.setText("스쿼트 - 고관절을 뒤로빼고 상체를 일자로 하여 앉았다 일어선다.");
            }
        });
        pane.legs.leg[0].button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.legs.requestFocus();
                descript.setText("카프레이즈 - 종아리를 자극하는 운동");
            }
        });
        pane.legs.leg[1].button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.legs.requestFocus();
                descript.setText("레그프레스 - 기구에 기대어 무게를 버티고 미는 운동");
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //팔운동 사진 클릭 시
        pane.arms.arm[0].button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.arms.requestFocus();
                descript.setText("덤벨컬 - 덤벨을 이용하여 이두를 자극하는 운동");
            }
        });
        pane.arms.arm[0].button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.arms.requestFocus();
                descript.setText("바벨컬 - 바벨을 이용하여 이두를 자극하는 운동");
            }
        });
        pane.arms.arm[0].button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.arms.requestFocus();
                descript.setText("벤치딥 - 벤치에 팔을 지탱하여 삼두를 자극하는 운동");
            }
        });
        pane.arms.arm[0].button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.arms.requestFocus();
                descript.setText("인클라인덤벨컬 - 다른 근육의 개입을 없애고 팔에만 집중하는 덤벨컬");
            }
        });
        pane.arms.arm[0].button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.arms.requestFocus();
                descript.setText("트라이셉스익스텐션 - 바벨로 삼두를 자극하는 운동");
            }
        });
        pane.arms.arm[0].button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.arms.requestFocus();
                descript.setText("해머컬 - 팔의 전완근, 이두 바깥라인을 잡아주는 운동");
            }
        });
        pane.arms.arm[1].button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.arms.requestFocus();
                descript.setText("트라이셉스케이블프레스다운 - 팔을 구부린 상태에서 펴며 수축을 주는 방법");
            }
        });
        pane.arms.arm[1].button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pane.arms.requestFocus();
                descript.setText("트라이셉스킥백 - 덤벨컬과 비슷한 방식에 반대로 생각하면 된다.");
            }
        });
    }

}
