package br.univel.cadastro;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TelaCadastroCliente extends MolduraAbstract {

	/**
	 * Create the panel.
	 */
	public TelaCadastroCliente() {
   super();
   
	}

	@Override
	protected void configuraMiolo() {
super.add(new MioloCadastroCliente(),BorderLayout.CENTER);
		
	}
	

}
