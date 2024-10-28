package pacoteBiblioteca;

public class Usuario {

   String nome;
   String id;
   String email;
   int limiteEmPosse;




public Usuario (String nome,String id,String email){

    this.nome = nome;
    this.id = id;
    this.email = email;


}


public String getNome (){

    return nome;
}


public String getId(){

    return id;
}


public String getEmail(){

    return email;
}



void exibirInfo(){

   System.out.println("Nome: " + getNome());
   System.out.println("ID: " + getId());
   System.out.println("E-mail: " + getEmail());



}






}
