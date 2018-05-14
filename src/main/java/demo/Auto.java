package demo;

/**
 * @author jgorriti
 *
 */
public class Auto {
	private String marca;
	private String modelo;
	private String patente;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return (this.patente == null || this.modelo == null) ? "" : this.marca + " " +  this.modelo + " -> " + this.patente;
	}
	

}
