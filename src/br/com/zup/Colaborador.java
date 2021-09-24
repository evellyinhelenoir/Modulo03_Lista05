package br.com.zup;

public class Colaborador extends Pessoa{
    private double salario;
    private double imposto;
    private int codigoSetor;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public Colaborador(String nome, String endereco, String telefone, double salario, double imposto, int codigoSetor) {
        super(nome, endereco, telefone);
        this.salario = salario;
        this.imposto = imposto;
        this.codigoSetor = codigoSetor;
    }

    public double calcularSalario(){
        double salarioLiquido = salario - imposto;
        return salarioLiquido;
    }
}
