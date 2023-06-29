package com.raj;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Tetris extends JFrame {

    JLabel statusBar;

    public Tetris() {
        statusBar = new JLabel ("0"); //to display lines number
        statusBar.setFont(new Font("Arial", Font.BOLD, 24));
        add (statusBar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);
        //start lines down
        board.start();

        setSize(500,900);
        setTitle("Awesome Tetris Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JLabel getStatusBar () {
        return statusBar;
    }

    public static void main (String [] args) {
        Tetris myTetris = new Tetris ();
        myTetris.setLocationRelativeTo(null);
        myTetris.setVisible(true);


    }
}
