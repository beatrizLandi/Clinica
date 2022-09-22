package br.senai.sp.jandira;

import java.io.ObjectInputStream.GetField;

import java.time.LocalDate;
import java.time.LocalTime;
import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;

import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;

import br.senai.sp.jandira.model.PlanoSaude;

public class ClinicaApp {

	public static void main(String[] args) {

		// especialidade

		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otoringolaringologia");

		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Fisioterapia");
		especialidade3.setDescricao("");

		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Gastroenterologia");

		Especialidade especialidade5 = new Especialidade();
		especialidade5.setNome("Clinica geral");

		// Planos

		PlanoSaude plano1 = new PlanoSaude();
		plano1.setOperadora("amil");
		plano1.setTipoPlano("bronze");

		// JOptionPane.showMessageDialog(null, plano.getDadosPlano());

		PlanoSaude plano2 = new PlanoSaude();
		plano2.setOperadora("bradesco");
		plano2.setTipoPlano("ouro");

		// System.out.println(planoBradesco.getDadosPlano());

		// JOptionPane.showMessageDialog(null, planoBradesco.getDadosPlano());
		PlanoSaude plano3 = new PlanoSaude("amil");
		
		// endereço

		Endereco endereco1 = new Endereco();
		endereco1.setBairro("jardim primeir de maio");
		endereco1.setCep("06365-730");
		endereco1.setCidade("osasco");
		endereco1.setComplemento("perto do mercado coracao do angelica");
		endereco1.setEstado(Estados.SAO_PAULO);
		endereco1.setLougradouro(null);
		endereco1.setNumero("3");

		Endereco endereco2 = new Endereco();
		endereco2.setBairro("avnida jose saulup");
		endereco2.setCep("06660-460");
		endereco2.setCidade("itapevi");
		endereco2.setComplemento("proximo a caixa dágua");
		endereco2.setEstado(Estados.SAO_PAULO);
		endereco2.setLougradouro("avenida");
		endereco2.setNumero("963");

		// medico

		Medico medico1 = new Medico();
		medico1.setGenero(null);
		medico1.setNome("Ana");
		medico1.setCRM("999-444");
		medico1.setDataNascimento(LocalDate.of(1997, 5, 15));

		// vetor especialidade

		Especialidade[] especialidades = {  especialidade3, especialidade5 };
		medico1.setEspecialidades(especialidades);

		Medico medico2 = new Medico();
		medico2.setGenero(null);
		medico2.setNome("Alec´s");
		medico2.setCRM("333-222");
		medico2.setDataNascimento(LocalDate.of(1990, 7, 21));

		// vetor especialidade
		Especialidade[] especialidades2 = { especialidade1, especialidade4,  };
		medico2.setEspecialidades(especialidades2);
		
		//paciente
		Paciente paciente1 =new  Paciente();
		paciente1.setCPF("54902254832");
		paciente1.setEmail("pinheirocamila4986@gmal.com");
		paciente1.setEndereco(endereco2);
		paciente1.setNome("camila alves Pinheio");
		paciente1.setPlanoDeSaude("plano de saude" + plano1);
		paciente1.setRG("602223404");
		paciente1.setSexo("feminino");
		paciente1.setTelefone("9534382228");
		paciente1.setTipoSanguineo("nao identificado");
		
		//paciente
		Paciente paciente2 =new  Paciente();
		paciente2.setCPF("49346696800");
		paciente2.setEmail("coelhalandi@gmail.com");
		paciente2.setEndereco(endereco1);
		paciente2.setNome("Andressa Beatriz Fidelis landi Coelho");
		paciente2.setPlanoDeSaude("plano de saude" + plano2);
		paciente2.setRG("5953-420");
		paciente2.setSexo("feminino");
		paciente2.setTelefone("98064-5781");
		paciente2.setTipoSanguineo("A+");
			
				
		//exibir dados paciente
		
		//nome
		System.out.println("nome "+ paciente1.getNome());

		//cidade
		System.out.println("endereco "+ paciente1.getEndereco().getCidade());
		
		//estado
		System.out.println("estado "+paciente1.getEndereco().getEstado());

	//telefone
		System.out.println("Telefone para contato "+paciente1.getTelefone());
		
		
		//o paciente presisa passar cpm o clinico geral no dia 22 de setembrono dia 22/9/2022 as 15;25
		
		
		Agenda agenda = new Agenda();
		agenda.setDataConsulta(LocalDate.of(2022, 9, 2));
		agenda.setHoraConsulta(LocalTime.of(15, 25));
		agenda.setMedico(medico1);
		agenda.setObservacao("paciente com alergia dipirona");
		agenda.setPaciente(paciente1);
		agenda.setEspecialidade(especialidade5);
	

		Agenda agenda2 = new Agenda();
		agenda2.setDataConsulta(LocalDate.of(2022, 9, 26));
		agenda2.setHoraConsulta(LocalTime.of( 9, 0));
		agenda2.setMedico(medico2);
		agenda2.setObservacao("paciente com chagas por que bebeu caldo de cana  ");
		agenda2.setPaciente(paciente2);
		agenda2.setEspecialidade(especialidade1);
		
		//exibir dados
		
		//nome
		System.out.println("nome "+agenda2.getPaciente().getNome());
		//especialidade
		System.out.println("especialidade"+agenda2.getEspecialidade());
		//medico
		System.out.println("medico"+agenda2.getMedico().getNome());
		//data e hora
		System.out.println("data e hora " +agenda2.getDataConsulta());
		System.out.println("hora da consulta"+agenda2.getHoraConsulta());
		//plano saude
		System.out.println("plano saude"+agenda2.getPaciente().getPlanoDeSaude());
		
		
		
		System.out.println("nome "+agenda.getPaciente().getNome());
		//especialidade
		System.out.println("especialidade"+agenda.getEspecialidade());
		//medico
		System.out.println("medico"+agenda.getMedico().getNome());
		//data e hora
		System.out.println("data e hora " +agenda.getDataConsulta());
		System.out.println("hora da consulta"+agenda.getHoraConsulta());
		//plano saude
		System.out.println("plano saude"+agenda.getPaciente().getPlanoDeSaude());
		
	
	}

}
