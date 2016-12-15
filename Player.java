/**
 * Created by ViniciusSanches on 15/12/16.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.Timer;


public class Player extends JPanel implements KeyListener{

    float centerX, centerY; //position of the player
    float width, height;    // width and heigth of the player rectangle
    float speed;
    JPanel container;
    int direction; // which direction the player is moving to

    public Player(float x, float y, float w, float h){
        this.centerX = x;
        this.centerY = y;
        this.width = w;
        this.height = h;
        this.direction = 0;
        this.speed = 40f;

    }

    public void clear(Graphics g){
        Graphics2D gr2 = (Graphics2D) g;
        Rectangle2D rec = new Rectangle2D.Double(this.centerX, this.centerY, this.width, this.height);
        gr2.setColor(this.container.getBackground());
        gr2.fill(rec);
    }

    public void paint(Graphics g){
        Graphics2D gr2 = (Graphics2D) g;
        Rectangle2D rec = new Rectangle2D.Double(this.centerX, this.centerY, this.width, this.height);
        gr2.setColor(Color.CYAN);
        gr2.fill(rec);
    }

    public void move(int dir){
        centerX += speed * dir;
        centerY += speed * dir;
    }

    public void update(){
        move(direction);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
            direction = 1;
            update();
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT) {
            direction = -1;
            update();
        }
    }


    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
            direction = 0;
            update();
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT) {
            direction = 0;
            update();
        }
    }
}
