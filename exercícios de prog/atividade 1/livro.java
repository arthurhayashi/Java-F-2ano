import java.util.Scanner;

public class livro {
	private String titulo,autor;
	
	public livro(String T, String A) {
		setTitulo (T);
		setAutor (A);
	}
	public livro() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Coloque o nome do titulo: ");
		setTitulo(scanner.nextLine());
		System.out.println("Coloque o nome do Autor: ");
		setAutor(scanner.nextLine());
	}
	public void setTitulo(String nomeTitulo) {
		titulo=nomeTitulo;
	}
	public void setAutor(String nomeAutor) {
		autor=nomeAutor;
	}
	
		public String getTitulo() {
			return titulo;
		}
		public String getAutor() {
			return autor;
		}
	
	/*public void dadoLivro () {
		System.out.println("Coloque o nome do título: " +getTitulo() +"\nColoque o nome do autor: " +getAutor());
	}
	*/
	public void exibeDados() {
		System.out.println("Título: " + getTitulo() + "Autor: " +getAutor());
	}
}


