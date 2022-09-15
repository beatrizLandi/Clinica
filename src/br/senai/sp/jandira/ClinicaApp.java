package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoSaude;

public class ClinicaApp {

	public static void main(String[] args) {
	
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");

		
		System.out.println(especialidade.getNome());
		
		PlanoSaude plano= new PlanoSaude();
		plano.setOperadora("amil");
		plano.setTipoPlano("bronze");
		
		JOptionPane.showMessageDialog(null, plano.getDadosPlano());
		
		PlanoSaude planoBradesco = new PlanoSaude();
		planoBradesco.setOperadora("bradesco");
		planoBradesco.setTipoPlano("ouro");
		
		System.out.println(planoBradesco.getDadosPlano());
		
		JOptionPane.showMessageDialog(null, planoBradesco.getDadosPlano());
	}

}
