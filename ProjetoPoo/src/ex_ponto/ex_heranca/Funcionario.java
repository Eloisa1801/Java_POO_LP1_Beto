package ProjetoPoo.src.ex_ponto.ex_heranca;



public class Funcionario extends Pessoa {
    private String matricula;
    private String dtEntrada;
    private String cargo;
    
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDtEntrada() {
        return this.dtEntrada;
    }

    public void setDtEntrada(String dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}