package br;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.awt.Shape;
/**
 * Created by Leo on 15/12/2016.
 */
public class Blocos{
        private List<Shape> blocos = new ArrayList<Shape>();
        private int margem = 14;
        private int nlinhasblocos = 6;
        private int ncolunasblocos = 9;
        private int largurabloco = 50;
        private int alturabloco = 30;

    public Blocos(){
        int incx = margem;
        int incy = margem;
        for(int i = 0; i < nlinhasblocos ; i++) {
            incx = margem;
            for(int j = 0; j < ncolunasblocos ; j++) {
                blocos.add(new Rectangle(incx, incy, largurabloco, alturabloco));
                incx = incx + largurabloco + margem;
            }
            incy = incy + alturabloco + margem ;
        }
    }

     public List getBlocos(){

         return blocos;
     }

    }
