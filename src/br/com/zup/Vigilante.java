package br.com.zup;

public class Vigilante extends Colaborador{
    private double adicionalNoturna;
    private double ajudaCusto;

    public double getAdicionalNoturna() {
        return adicionalNoturna;
    }

    public void setAdicionalNoturna(double adicionalNoturna) {
        this.adicionalNoturna = adicionalNoturna;
    }

    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }


    public Vigilante(String nome, String endereco, String telefone, double salario, double imposto, int codigoSetor, double adicionalNoturna, double ajudaCusto) {
        super(nome, endereco, telefone, salario, imposto, codigoSetor);
        this.adicionalNoturna = adicionalNoturna;
        this.ajudaCusto = ajudaCusto;
    }

    @Override
    public double calcularSalario(){
        double salarioLiquido = adicionalNoturna + ajudaCusto + (getSalario() - getImposto());
        return salarioLiquido;
    }
}
