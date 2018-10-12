package com.qa.TheInfiniteTerrainSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;

public class GameInterface extends JFrame implements ActionListener {

	public GameInterface () {
		Button btnNorth;
		Button btnSouth;
		Button btnEast;
		Button btnWest;

	// Background
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		/*setLayout(new BorderLayout());
        JLabel Background = new JLabel();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\TheInfiniteTerrainSystem.Chocolate_Hills.jpg").getImage().getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_DEFAULT));
        Background.setIcon(imageIcon);
        setContentPane(Background);
*/
        //New Layout
        setLayout(new GridBagLayout());
        GridBagConstraints gc  = new GridBagConstraints();

        //Window Settings
        setTitle("Main Menu");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);

        //Components
        JLabel lblTitle = new JLabel("Infinite Terrain System");
        lblTitle.setForeground(Color.GREEN);
        lblTitle.setFont(new Font("Serif", Font.BOLD, 32));
        gc.fill = GridBagConstraints.BOTH;
        gc.weighty = 0.5;
        gc.gridx = 1;
        gc.gridy = 0;
        //gc.insets = new Insets(200,0,0,0);
        add(lblTitle, gc);

        btnNorth = new Button("North");
        btnNorth.setFont(new Font("Serif", Font.PLAIN, 20));
        gc.fill = GridBagConstraints.BOTH;
        gc.weighty = 1.0;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.insets = new Insets(0,0,0,0);
        add(btnNorth, gc);
        btnNorth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              moveNorth();  
            }
        });

        btnSouth = new Button("South");
        btnSouth.setFont(new Font("Serif", Font.PLAIN, 20));
        gc.fill = GridBagConstraints.BOTH;
        gc.weighty = 1.0;
        gc.gridx = 1;
        gc.gridy = 2;
        add(btnSouth, gc);
        btnSouth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                moveSouth();
            }
        });


        btnEast = new Button("East");
        btnEast.setFont(new Font("Serif", Font.PLAIN, 20));
        gc.fill = GridBagConstraints.BOTH;
        gc.weighty = 1.0;
        gc.gridx = 1;
        gc.gridy = 3;
        add(btnEast, gc);
        btnEast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	moveEast();
            }
        });

        btnWest = new Button("West");
        btnWest.setFont(new Font("Serif", Font.PLAIN, 20));
        gc.fill = GridBagConstraints.BOTH;
        gc.weighty = 1.0;
        gc.gridx = 1;
        gc.gridy = 4;
        gc.insets = new Insets(0,0,200,0);
        add(btnWest, gc);
        btnWest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                moveWest();
            }
        });



	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void moveNorth() {
		System.out.println("Moved North");;
	}
	public void moveSouth() {
		System.out.println("Moved South");;
	}
	public void moveEast() {
		System.out.println("Moved East");;
	}
	public void moveWest() {
		System.out.println("Moved West");;
	}

}
