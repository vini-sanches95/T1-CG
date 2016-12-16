package br;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.Shape;
import java.util.*;
import java.util.List;

/**
 * Created by Leo on 15/12/2016.
 */
public class Screen extends JPanel {
    private Barra barra;
    private Blocos blocos;
    private List<Shape> listblocos;

    public Screen(int widht, int height){
        barra = new Barra(widht,height);
        blocos = new Blocos();
        listblocos = blocos.getBlocos();
        repaint();
    }

    public void keyPressed(KeyEvent e) {
            if(barra.keyPressed(e) == true) {
                repaint();
            }
    }


    public void paint(Graphics g){ //objeto Graphics utilizado para desenhar na tela
        super.paint(g); //super chamado para limpar a tela

        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(barra.getPosicaoX(),barra.getPosicaoY(),barra.getLargurabarra(),barra.getAlturabarra());

        for(Shape bloco : listblocos){
            g2d.fill(bloco);
        }
    }

}
