package com.java21days;

import javax.swing.*;
import java.awt.*;

public class Alphabet extends JFrame {

    public Alphabet() {
        super("Alphabet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(360, 120);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        setLayout(lm);
        JButton a = new JButton("Alibi");
        JButton b = new JButton("Alibi");
        JButton c = new JButton("Alibi");
        JButton d = new JButton("Alibi");
        JButton e = new JButton("Alibi");
        JButton f = new JButton("Alibi");
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exception) {
            System.err.println(exception);
        }
    }

    public static void main(String[] args) {
        Alphabet.setLookAndFeel();
        Alphabet frame = new Alphabet();
    }
}
