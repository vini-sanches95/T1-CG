/**
 * Created by ViniciusSanches on 15/12/16.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.LinkedList;
import java.util.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.Timer;



public class Main extends JPanel implements ActionListener{

    private static Game game;
    public static Player player;



    public static void main(String[] args){

        JFrame display = new JFrame("Block Destroyer");
        display.setSize(500, 500);
        Player p = new Player(100, 100, 50, 50);
        display.add(p);
        display.setVisible(true);


        //setDisplay();
//        initGame();
        //loop(display);

        //repaint();

    }

    @Override
    public void paint(Graphics g){

        player.paint(g);
    }

//    private static void setDisplay(){
//
//        JFrame display = new JFrame("Block Destroyer");
//        display.setSize(500, 500);
//        display.setVisible(true);
//        display.add(new Player(100, 100, 50, 50));
//
//    }

    private static void initGame(){

        game = new Game();
        //add(new Player(100, 100, 50, 50));

    }

    private static void loop(JFrame d){

        while(true){
            //getInput();
            //render();
            player.update();
            d.setVisible(true);
            //repaint();

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

//    private static void getInput(){
//        game.getInput();
//    }

//    private static void render(){
//        game.render();
//    }
//
//    private static void update(){
//        game.update();
//    }

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

}
