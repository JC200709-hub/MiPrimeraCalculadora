package com.mycompany.calculadora;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;    
import javax.swing.border.LineBorder;
public class Calculadora {
    int BoardWidth = 360;
        int BoardHeight = 540;
        
        JFrame frame = new JFrame("Calculadora");
        
        Calculadora() {
        frame.setVisible(true);
        frame.setSize(BoardWidth, BoardHeight);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        
        
        }
}
    
    

