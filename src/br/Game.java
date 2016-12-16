//package br;
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//import javax.swing.JPanel;
//import javax.swing.Timer;
//
//public class Game extends JPanel implements ActionListener {
//    private Player player;
//    private Timer timer;
//
//    private int winHeight;
//    private int winWidth;
//    private final int UP = KeyEvent.VK_UP;
//    private final int DOWN = KeyEvent.VK_DOWN;
//    private final int LEFT = KeyEvent.VK_LEFT;
//    private final int RIGHT = KeyEvent.VK_RIGHT;
//    private final int SPACE = KeyEvent.VK_SPACE;
//
//    public Game(int w, int h) {
//        addKeyListener(new TAdapter());
//        setBackground(Color.BLACK);
//        setFocusable(true);
//        setDoubleBuffered(true);
//
//        player = new Player();
//
//        winHeight = h;
//        win
//
//                Width = w;
//
//        timer = new Timer(5, this);
//        timer.start();
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//
//        Graphics2D g2d = (Graphics2D) g;
////        g2d.drawImage(player.getImage(), player.getX(), player.getY(), this);
////
////        ArrayList proj = player.getMissiles();
////
////        for (Object p : proj) {
////            Projectile b = (Projectile) p;
////            g2d.drawImage(b.getImage(), b.getX(), b.getY(), this);
////        }
//
//        Toolkit.getDefaultToolkit().sync();
//        g.dispose();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        // Update projectile locations
////        ArrayList ms = player.getMissiles();
////
////        for (int i = 0; i < ms.size(); i++) {
////            Projectile p = (Projectile) ms.get(i);
////            if (p.getX() <= winWidth) {
////                p.move();
////            } else {
////                ms.remove(p);
////            }
////        }
////        player.move();
//        repaint();
//    }
//
//    private class TAdapter extends KeyAdapter {
//        @Override
//        public void keyReleased(KeyEvent e) {
//            player.keyReleased(e);
//        }
//
//        @Override
//        public void keyPressed(KeyEvent e) {
//            player.keyPressed(e);
//        }
//    }
//    public static void main(){
//
//    }
//
//    // end class TAdapter
//}// end class Game