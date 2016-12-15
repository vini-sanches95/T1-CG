import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.Timer;

public class Bouncers extends JPanel implements ActionListener {
    private List<Ball> balls;
    private Timer animation;

    public Bouncers() {
        balls = new LinkedList<Bouncers.Ball>();

        balls.add(new Ball(10, 10, 20, this));
        balls.add(new Ball(15, 20, 20, this));
        balls.add(new Ball(17, 30, 20, this));
        balls.add(new Ball(4, 40, 20, this));


        this.animation = new Timer(10, this);
        this.animation.start();
    }

    @Override
    public void paint(Graphics g) {
        for ( Ball b : this.balls ) {
            b.clear(g);
            b.tick();
            b.paint(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        repaint();
    }

    public static void main(String [] args) {
        JFrame f = new JFrame("Hello");
        f.setSize(200, 300);

        Bouncers b = new Bouncers();
        f.add(b);
        f.setVisible(true);
    }

    static class Ball {
        float radius;
        float x,y;
        int dirx, diry;
        JPanel container;

        Ball(float x, float y, float radius, JPanel cont) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.container = cont;

            this.dirx = (int) (Math.random() * 3);
            this.diry = (int) (Math.random() * 3);
        }

        public void clear(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            Ellipse2D e = new Ellipse2D.Double(this.x, this.y, this.radius, this.radius);
            g2.setColor(this.container.getBackground());
            g2.fill(e);
        }

        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            Ellipse2D e = new Ellipse2D.Double(this.x, this.y, this.radius, this.radius);
            g2.setColor(Color.red);
            g2.fill(e);
        }

        public void tick() {
            if ( this.x + dirx >= this.container.getWidth() ) {
                dirx *= -1;
            }

            if ( this.x + dirx <= 0 ) {
                dirx *= -1;
            }

            if ( this.y + diry >= this.container.getHeight() ) {
                diry *= -1;
            }

            if ( this.y + diry <= 0 ) {
                diry *= -1;
            }

            this.x += dirx;
            this.y += diry;
        }
    }


}