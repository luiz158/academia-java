package com.mycompany.mercaderia.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class BuscaMercaderiaFrame extends JFrame {
	
	private JTextField tfNome;
	private JButton bBuscar;
	
	public BuscaMercaderiaFrame() {
		setTitle("Buscar");
		setSize(250, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		inicializaComponentes();
	}
	
	private void inicializaComponentes() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(montaPanelBuscaMercadoria(), BorderLayout.CENTER);
		panel.add(montaPanelBotoesBusca(), BorderLayout.SOUTH);
		this.add(panel);
		
		GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
	}
	
	private JPanel montaPanelBotoesBusca() {
		JPanel panel = new JPanel();
		bBuscar = new JButton("Buscar");
		bBuscar.setActionCommand("buscarMercaderiasAction");
		bBuscar.setMnemonic(KeyEvent.VK_B);
		panel.add(bBuscar);
		return panel;
	}

	private JPanel montaPanelBuscaMercadoria() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(8, 1));

		tfNome = new JTextField();
		panel.add(new JLabel("Nombre:"));
		panel.add(tfNome);
		return panel;
	}
	
	public void resetForm() {
		tfNome.setText("");
	}
	
	public JButton getBuscarButton() {
		return bBuscar;
	}

	/**
	 * @return texto
	 */
	public String getText() {
		return tfNome.getText();
	}
	
}
