//package br;
//
//import java.awt.Image;
//import java.awt.event.KeyEvent;
//import java.util.ArrayList;
//import javax.swing.ImageIcon;
//
//public class Player {
//    private String playerPath = "/br/craft.png";
//    private int x, y, dx, dy;
//    private Image image;
//    private ArrayList missiles;
//    private final int CRAFT_SIZE = 20;
//
//    public Player() {
//        ImageIcon ii = new ImageIcon(playerPath);
//        image = ii.getImage();
//        missiles = new ArrayList();
//        x = 20;
//        y = 20;
//    }
//    public void keyPressed(KeyEvent e) {
//        int key = e.getKeyCode();
//        if (key == KeyEvent.VK_SPACE) {
//            fire();
//        }
//        if (key == KeyEvent.VK_LEFT) {
//            dx = -1;
//        }
//        if (key == KeyEvent.VK_RIGHT) {
//            dx = 1;
//        }
//        if (key == KeyEvent.VK_UP) {
//            dy = -1;
//        }
//        if (key == KeyEvent.VK_DOWN) {
//            dy = 1;
//        }
//    }
//    public void keyReleased(KeyEvent e) {
//        int key = e.getKeyCode();
//        if (key == KeyEvent.VK_LEFT) {
//            dx = 0;
//        }
//        if (key == KeyEvent.VK_RIGHT) {
//            dx = 0;
//        }
//        if (key == KeyEvent.VK_UP) {
//            dy = 0;
//        }
//        if (key == KeyEvent.VK_DOWN) {
//            dy = 0;
//        }
//    }
//   public void fire() {
//        //missiles.add(new Projectile(x + CRAFT_SIZE, y + CRAFT_SIZE/2));
//    }
//}//end class Player