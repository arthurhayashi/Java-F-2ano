import java.util.Scanner;

public class Turma {
private String curso,disciplina;

	public Turma() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Coloque o nome do curso: ");
		setCurso(scanner.nextLine());
		System.out.println("Coloque o nome da disciplina: ");
		setDisciplina(scanner.nextLine());
	}
	public void setCurso(String curso1) {
		curso=curso1;
	}
	public void setDisciplina(String disciplina1) {
		disciplina=disciplina1;
	}
		public String getCurso() {
			return curso;
		}
		public String getDisciplina() {
			return disciplina;
		}
		public void exibeDados() {
			System.out.println("O nome do curso eh: " + getCurso() + "\nO nome da disciplina eh: " + getDisciplina());
		}
}
