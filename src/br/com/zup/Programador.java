package br.com.zup;

public class Programador extends Colaborador{
    private String lingaguem;

    public String getLingaguem() {
        return lingaguem;
    }

    public void setLingaguem(String lingaguem) {
        this.lingaguem = lingaguem;
    }

    public Programador(String nome, String endereco, String telefone, double salario, double imposto, int codigoSetor, String lingaguem) {
        super(nome, endereco, telefone, salario, imposto, codigoSetor);
        this.lingaguem = lingaguem;
    }

    public double calcularSalario(){
        double salarioLiquido = getSalario() - getImposto();
        return salarioLiquido;
    }
}
