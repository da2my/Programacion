package controller;

import model.TableroGUI;

public class MainTableroGUI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TableroGUI tablero1; 
	
	public MainTableroGUI() {
        initComponents();
    }

	private void initComponents() {
		tablero1 = new TableroGUI(10, true);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		javax.swing.GroupLayout tableroGUI1Layout = new javax.swing.GroupLayout(tablero1);
		tablero1.setLayout(tableroGUI1Layout);
		tableroGUI1Layout.setHorizontalGroup(tableroGUI1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 349, Short.MAX_VALUE));
		tableroGUI1Layout.setVerticalGroup(tableroGUI1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 349, Short.MAX_VALUE));
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(tablero1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(176, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(tablero1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(13, Short.MAX_VALUE)));
		pack();
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainTableroGUI().setVisible(true);
			}
		});

	}

}
