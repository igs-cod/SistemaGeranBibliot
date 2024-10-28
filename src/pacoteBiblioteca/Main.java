package pacoteBiblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca sariava = new Biblioteca("Biblioteca Sariava","Rua projetada");


        sariava.cadastrarLivro("Harry poter", " jkrolins", "1234", 2000, 4);

        sariava.cadastrarLivro(" Como ficar rico", "Pablo Marçal", "12345", 2024, 8);


        sariava.exibirInfo();


        sariava.verificarDisponibilidade();


        sariava.emprestar("Harry poter");


        sariava.devolver("Harry poter");


        sariava.exibirInfo();
    }
}
