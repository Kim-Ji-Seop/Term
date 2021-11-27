import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;

class MyKeyListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode =e.getKeyCode();
        if(keyCode == VK_LEFT){

        }
        if(keyCode == VK_RIGHT){

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}