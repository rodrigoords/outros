/** 
 * Disciplina: Programação Orientada a Objetos                                 
 * Professor:  José Perini                                                     
 * Assunto:    POO – Projeto Prático – Avaliação M2 / 2º Bimestre
 *                                                            
 * Grupo:      André Queiroz          RA: 1510010198
 *             Raiany de Araújo       RA: 1510000693
 *             Rodrigo Sene           RA: 1510030133                                                                     
 */
package br.com.metrocamp.emprestimo.domain;

public class Produto {
	
	private String id; 
	private String tipoContrato;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	} 
	
}
