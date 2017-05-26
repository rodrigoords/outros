/** 
 * Disciplina: Programa��o Orientada a Objetos                                 
 * Professor:  Jos� Perini                                                     
 * Assunto:    POO � Projeto Pr�tico � Avalia��o M2 / 2� Bimestre
 *                                                            
 * Grupo:      Andr� Queiroz          RA: 1510010198
 *             Raiany de Ara�jo       RA: 1510000693
 *             Rodrigo Sene           RA: 1510030133                                                                     
 */
package br.com.metrocamp.emprestimo.domain;

public class Gerente extends Pessoa{


	public Gerente(String nome){
		
		super(nome);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		super.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		super.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		super.cpf = cpf;
	} 
	
	
	
}
