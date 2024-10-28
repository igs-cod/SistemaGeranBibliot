package pacoteBiblioteca;

public class Livro {

   private String titulo;
   private String autor;
   private String isbn;
   private int anoPublicacao;
   private int qntEstoque;


public Livro(String titulo,String autor,String isbn,int anoPublicacao,int qntEstoque){

     this.titulo = titulo;
     this.autor = autor;
     this.isbn = isbn;
     this.anoPublicacao = anoPublicacao;
     this.qntEstoque = qntEstoque;

    }


public String getTitulo (){

   return titulo;

   }

public String getAutor(){

   return autor;
   }

public String getIsbn(){

   return isbn;

   }

public int getAnoPublicacao(){

    return anoPublicacao;
}


public int getQntEstoque(){

        return qntEstoque;
    }


    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }


    void exibirInfo() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Quantidade em Estoque: " + getQntEstoque());
    }




}



