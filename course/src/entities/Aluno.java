package entities;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalMedia() {
		return nota1 + nota2 + nota3;
	}
	public double missingPoint( ) {
		if (finalMedia() < 60.0) {
			return 60.0 - finalMedia();
		}
		else {
			return 0.0;
		}
	}
}
