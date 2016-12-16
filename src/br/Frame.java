package br;
import br.Screen;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import static sun.audio.AudioPlayer.player;

/**
 * Created by Leo on 15/12/2016.
 */
public class Frame extends JFrame implements ActionListener {
    Screen s;
    private int Width = 600;
    private int Height = 600;

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public class TAdapter extends KeyAdapter { //Classe para captação de teclas
        @Override
        public void keyPressed(KeyEvent e) {
            s.keyPressed(e);
        }
    }

    public void init(){ //Metodo que Inicia Interface
        setLocationRelativeTo(null);
        s = new Screen(Width,Height); //Nova instancia da classe "Screen"
        add(s);
        setVisible(true); //Define Visibilidade de tudo anterior
    }

    public Frame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Width,Height); //Tamanho da janela
        setResizable(false); //Se permite alteracao de tamanho da janela
        setTitle("<nome do jogo>");//Nome da janela
        addKeyListener(new Frame.TAdapter());//Adiciona o adptador para captura de teclas
        init(); //Inicia interface
    }

    public static void main(String args[]){ //Main
        new Frame(); //Instancia de Frame
    }





}
