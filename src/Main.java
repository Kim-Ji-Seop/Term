import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    TitleLabel label = new TitleLabel();
    Menu menu = new Menu();
    MidPanel mid = new MidPanel();

    Main(){
        setTitle("Term Project");
        setBackground(Color.WHITE);
        setLayout(new BorderLayout(0,0));
        add(menu, BorderLayout.WEST);
        add(label.title,BorderLayout.NORTH);
        add(mid,BorderLayout.CENTER);

        setLocation(600, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(590, 500);
        setVisible(true);
    }


    public static void main(String[] args){
        new Main();
    }
}
