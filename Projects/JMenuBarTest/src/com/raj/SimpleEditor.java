package com.raj;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class SimpleEditor extends JFrame {

    public static void main(String[] args) {

        JFrame frame = new SimpleEditor();
        JPanel panel = new JPanel();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);

    }

    private JEditorPane editPane;
    private JMenuItem New;
    private JMenuItem Open;
    private JMenuItem SaveAs;
    private JMenuItem Exit;
    private JMenuItem Cut;
    private JMenuItem Copy;
    private JMenuItem Paste;

    public SimpleEditor() {
        editPane = new JEditorPane("text/rtf","");
        JScrollPane scroller = new JScrollPane(editPane);
        setContentPane(scroller);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        setSize(600,500);
        setTitle("Text Editor");

        JMenu fileMenu = new JMenu("File");

        Open = new JMenuItem("Open");
        SaveAs = new JMenuItem("Save");
        Exit = new JMenuItem("Exit");

        fileMenu.add(Open);
        fileMenu.add(SaveAs);
        fileMenu.add(Exit);

        Open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser c = new JFileChooser();
                // Demonstrate "Open" dialog:
                int rVal = c.showOpenDialog(SimpleEditor.this);
                if (rVal == JFileChooser.APPROVE_OPTION) {
                    editPane.setText(c.getSelectedFile().getName());
                    editPane.setText(c.getCurrentDirectory().toString());
                }
                if (rVal == JFileChooser.CANCEL_OPTION) {
                    editPane.setText("You pressed cancel");
                    editPane.setText("");
                }
            }
        });

        SaveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showSaveDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                }
            }
        });

        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JMenu editMenu = new JMenu("Edit");

        Cut = new JMenuItem("Cut");

        Action cutAction = new DefaultEditorKit.CutAction();
        cutAction.putValue(Action.NAME, "Cut");
        editMenu.add(cutAction);

        Copy = new JMenuItem("Copy");

        Action copyAction = new DefaultEditorKit.CopyAction();
        copyAction.putValue(Action.NAME, "Copy");
        editMenu.add(copyAction);

        Paste = new JMenuItem("Paste");

        Action pasteAction = new DefaultEditorKit.PasteAction();
        pasteAction.putValue(Action.NAME, "Paste");
        editMenu.add(pasteAction);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
    }
}