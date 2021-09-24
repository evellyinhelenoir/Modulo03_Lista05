package br.com.zup;
    public class Administrador extends Colaborador{
        private double ajudaCusto;

        public double getAjudaCusto() {
            return ajudaCusto;
        }

        public void setAjudaCusto(double ajudaCusto) {
            this.ajudaCusto = ajudaCusto;
        }

        public Administrador(String nome, String endereco, String telefone, double salario, double imposto, int codigoSetor, double ajudaCusto) {
            super(nome, endereco, telefone, salario, imposto, codigoSetor);
            this.ajudaCusto = ajudaCusto;
        }

        @Override
        public double calcularSalario(){
            double salarioLiquido = ajudaCusto + (getSalario() - getImposto());
            return salarioLiquido;
        }
    }
