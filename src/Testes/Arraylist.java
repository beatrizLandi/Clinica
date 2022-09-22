package Testes;
 
 import java.lang.reflect.Array;
 import java.util.ArrayList;
 
 import br.senai.sp.jandira.model.PlanoSaude;
import br.senai.sp.jandira.model.dao.PlanoSaudeDAO;

	public class Arraylist {

	public static void main(String[] args) {
//	
//
//			//Planos de saude
//		
//		PlanoSaude plano1 =new PlanoSaude();
//		plano1.setOperadora("unimed");
//	
//		plano1.setTipoPlano("bronze");
//		
//		
//		
//		PlanoSaude[] planos = {
//				plano1,
//				new PlanoSaude("porto seguro"),
//				new PlanoSaude("porto inseguro")
//				};
//		
//		//ultilização arraylist
//	
//		ArrayList<String> cidades = new ArrayList<>();
//		cidades.add("São Paulo");
//		cidades.add("jandira");
//		cidades.add("barueri");
//		cidades.add("Itapevi");
//		cidades.add("cotia");
//		cidades.add("carapicuiba");
//		
//		System.out.println(cidades.get(4));
//		System.out.println(cidades.size());
//		
//		ArrayList<PlanoSaude> planos2 = new ArrayList<>();
//		planos2.add(new PlanoSaude("Notredame"));
//		planos2.add(new PlanoSaude("Ativia"));
//		planos2.add(new PlanoSaude("Bio saude"));
//		planos2.add(new PlanoSaude("Blue med"));
//		
//		PlanoSaude planoNovo = new PlanoSaude();
//		
//	
//		
//		int nota1 =10;
//		Integer nota2 =5;
//		
//		ArrayList<Double> precosList = new ArrayList<>();
//		precosList.add(5.9);
//		
//		
//		//vetor com 3 planos de saude
//		
//		

	PlanoSaude plano1 = new PlanoSaude("amil", "basic");
	PlanoSaudeDAO dao = new PlanoSaudeDAO(plano1);
	dao.gravar();
	
	System.out.println(dao.listarTodos());
//		
//		
	}
//
}
