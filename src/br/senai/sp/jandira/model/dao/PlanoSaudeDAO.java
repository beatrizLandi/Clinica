package br.senai.sp.jandira.model.dao;

import java.util.ArrayList;

import Testes.Arraylist;
import br.senai.sp.jandira.model.PlanoSaude;

public class PlanoSaudeDAO {
	
	private PlanoSaude planoSaude;
	private ArrayList<PlanoSaude>planos;
	
	public PlanoSaudeDAO(PlanoSaude planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	public void gravar() {
		planos.add(planoSaude);
	}

	public ArrayList<PlanoSaude> listarTodos(){
		return planos;
	}
}
