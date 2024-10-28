package pacoteBiblioteca;

public class Biblioteca {

    String nome;
    String endereco;
    Livro [] livrosDaBiblioteca = new Livro [100];
    int qntLivro = 0;




public Biblioteca (String nome,String endereco){

    this.nome = nome;
    this.endereco = endereco;



}



 void verificarDisponibilidade(){


    if (qntLivro > 1){
        System.out.println(" Tem livros disponivel ");
    }
    else{
        System.out.println("Nao tem livros Disponiveis");
    }


   }
    void cadastrarLivro(String titulo, String autor, String isbn, int anoPublicacao, int qntEstoque) {
        if (qntLivro < livrosDaBiblioteca.length) {

            Livro novoLivro = new Livro(titulo, autor, isbn, anoPublicacao, qntEstoque);
            livrosDaBiblioteca[qntLivro] = novoLivro;
            qntLivro++;
            System.out.println("Livro cadastrado: " + novoLivro.getTitulo());
        } else {
            System.out.println("Não pode cadastrar mais livros");
        }


   }

   void localizarLivroPorTitulo(String titulo){

       boolean encontrado = false;

       for (int i = 0; i < qntLivro; i++) {
           Livro livro = livrosDaBiblioteca[i];
           if (livro != null && livro.getTitulo().equals(titulo)) {
               System.out.println("Livro encontrado:");
               System.out.println("Título: " + livro.getTitulo());
               System.out.println("Autor: " + livro.getAutor());
               System.out.println("ISBN: " + livro.getIsbn());
               System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
               System.out.println("Quantidade em Estoque: " + livro.getQntEstoque());
               encontrado = true;
               break;
           }
       }

       if (!encontrado) {
           System.out.println("Livro não encontrado com o título: " + titulo);
       }








   }

   void localizarLivroPorAutor(String autor){




       boolean encontrado = false;

       for (int i = 0; i < qntLivro; i++) {
           Livro livro = livrosDaBiblioteca[i];
           if (livro.getAutor().equalsIgnoreCase(autor)) {
               System.out.println("Livro encontrado:");
               System.out.println("Título: " + livro.getTitulo());
               System.out.println("Autor: " + livro.getAutor());
               System.out.println("ISBN: " + livro.getIsbn());
               System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
               System.out.println("Quantidade em Estoque: " + livro.getQntEstoque());
               encontrado = true;
           }
       }

       if (!encontrado) {
           System.out.println("Nenhum livro encontrado do autor: " + autor);
       }



   }

   void devolver(String titulo){

       boolean encontrado = false;
       for (int i = 0; i < qntLivro; i++) {
           Livro livro = livrosDaBiblioteca[i];
           if (livro.getTitulo().equalsIgnoreCase(titulo)) {
               livro.setQntEstoque(livro.getQntEstoque() + 1);
               System.out.println("Livro devolvido com sucesso: " + titulo);
               encontrado = true;
               break;
           }
       }

       if (!encontrado) {
           System.out.println("Livro não encontrado para devolução: " + titulo);
       }



   }

   void emprestar(String titulo){

       boolean encontrado = false;

       for (int i = 0; i < qntLivro; i++) {
           Livro livro = livrosDaBiblioteca[i];
           if (livro.getTitulo().equals(titulo)) {
               if (livro.getQntEstoque() > 0) {
                   livro.setQntEstoque(livro.getQntEstoque() - 1);
                   System.out.println("Livro emprestado com sucesso: " + titulo);
               } else {
                   System.out.println("Não há exemplares disponíveis para emprestar: " + titulo);
               }
               encontrado = true;
               break;
           }
       }

       if (!encontrado) {
           System.out.println("Livro não encontrado para empréstimo: " + titulo);
       }





   }

   void exibirInfo(){

       if (qntLivro == 0) {
           System.out.println("Não há livros cadastrados na biblioteca.");
       } else {
           System.out.println("Livros cadastrados na biblioteca:");
           for (int i = 0; i < qntLivro; i++) {
               Livro livro = livrosDaBiblioteca[i];
               livro.exibirInfo();
               System.out.println();
           }
       }



   }



}
