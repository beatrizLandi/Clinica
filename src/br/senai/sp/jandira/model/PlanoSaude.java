package br.senai.sp.jandira.model;

public class PlanoSaude {

	
private String operadora;
private String tipoPlano;
	
public void setOperadora( String operadora) {
	this.operadora = operadora;
}
 public String getOperadora() {
	  return this.operadora;
 }
  
 public void setTipoPlano(String tipoPlano) {
	 this.tipoPlano = tipoPlano;
 }
 
 public String getTipoPlano () {
	 return this.tipoPlano;
 }
 
 public String getDadosPlano() {
	 return "operadora"  +this.operadora + ","  +this.tipoPlano;
 }
}
