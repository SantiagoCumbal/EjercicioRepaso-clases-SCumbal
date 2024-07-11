package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AMT {
    public JPanel MainPanel;
    private JButton aceptarButton;
    private JButton aceptarButton1;

    public AMT() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setContentPane(new IngresarAMT().MainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600,600);
                frame.setVisible(true);
                ((JFrame)SwingUtilities.getWindowAncestor(aceptarButton)).dispose();
            }
        });
    }
}
