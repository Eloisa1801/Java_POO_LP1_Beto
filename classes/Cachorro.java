package classes;

public class Cachorro {
// Atributos
    private String nome;
    private int idade;
    private String raca;
    private boolean dono;
    private boolean castrado;
    private double peso;
    
// Construtor  - criar e alocar

// public Cachorro(){

// }


public Cachorro(String name){
    System.out.println("Estou sendo criado com o nome: " + name);
}


// GETTERS-atribuir e SETTERS-

//Nome
public void setNome(String n){
    this.nome = n;
}

public String getNome(){
    return this.nome;
}

//Idade
public void setIdade(int n){
    this.idade = n;
}

public int getIdade(){
    return this.idade;
}

//Raca
public void setRaca(String n){
    this.raca = n;
}

public String getRaca(){
    return this.raca;
}

//Dono
public void setDono(boolean n){
    this.dono = n;
}

public boolean geDono(){
    return this.dono;
}

//Castrado
public void setCastrado(boolean n){
    this.castrado = n;
}

public boolean getCastrado(){
    return this.castrado;
}

//Peso
public void setPeso(double n){
    this.peso = n;
}

public double getPeso(){
    return this.peso;
}


// Metodos 
    public String toString(){
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nRaça: " + this.raca + "\nDono: " + this.dono + "\nCastrado: " + this.castrado + "\nPeso: " + this.peso + "kg";
    }



}



