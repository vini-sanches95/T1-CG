package br;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by Leo on 15/12/2016.
 */
public class Barra{
    private int largurabarra = 90;
    private int alturabarra = 30;
    private int posicaobarra = 0;
    private int velobarra = 10;
    private int margem = 35;
    private int Width;
    private int Height;

    public Barra(int width, int height){
        this.Width = width;
        this.Height = height;
    }
    public boolean keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            if(posicaobarra > -1*Width/2+largurabarra/2+margem) {
                posicaobarra = posicaobarra - velobarra;
                return true;
            }
        }

        if (key == KeyEvent.VK_RIGHT) {
            if(posicaobarra < Width/2-largurabarra/2-margem) {
                posicaobarra = posicaobarra + velobarra;
                return true;
            }
        }
        return false;
    }

    public int getPosicaoX(){
        return Width/2-largurabarra/2+posicaobarra;
    }
    public int getPosicaoY(){
        return Height-alturabarra-margem;
    }
    public int getLargurabarra(){
        return largurabarra;
    }
    public int getAlturabarra(){
        return alturabarra;
    }

}
