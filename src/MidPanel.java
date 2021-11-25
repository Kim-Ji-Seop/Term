import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MidPanel extends JPanel {
    Description descript = new Description();
    Border border = BorderFactory.createLineBorder(Color.black);
    CardViewInMidPanel pane = new CardViewInMidPanel();
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
        pane.back.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                descript.setText("Hi");
            }
        });
    }

}
