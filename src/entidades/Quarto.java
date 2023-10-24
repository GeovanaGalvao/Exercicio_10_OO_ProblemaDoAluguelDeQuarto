package entidades;

public class Quarto {
	
	private int numero;
	private boolean ocupado = false;
	private Pessoa pessoa;
	
	public Quarto(int numero) { this.numero = numero; }

	public int getNumero() { return numero; }
	public boolean getOcupado() { return ocupado; }
	public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }
	public Pessoa getPessoa() {	return pessoa; }
	public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
	
	public String toString() { return getOcupado() ? "\nQuarto numero " + getNumero()
		+ " ocupado!\n\nDados da pessoa ocupando o quarto:\n" + getPessoa() : 
		"\nQuarto numero " + getNumero() + " desocupado!";
	}	
}
