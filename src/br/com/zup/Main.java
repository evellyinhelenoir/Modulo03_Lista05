package br.com.zup;


    public class Main {
        public static void main(String[] args) {
            Colaborador colab = new Colaborador("Eve", "Vitor Machieto", "99999", 900, 100, 542);
            Vigilante vigilante = new Vigilante("Vigia", "Cogumelo", "12033435", 323, 200, 434, 2124, 2433);
            Programador prog = new Programador("Hack", "Guaianases", "12900", 5000, 1234, 554, "Java");
            Administrador adm = new Administrador("Adm", "Avenida Indio", "275739", 9999,234, 224, 2324);
            Fornecedor fornecedor = new Fornecedor("Nike", "Abobrinha", "99999", 1000, 20);


            System.out.println(fornecedor.obterSaldo());


            double salarioAdm = adm.getSalario();
            double salarioProg = prog.getSalario();
            double salarioVigilante = vigilante.getSalario();
            double salarioColaborador = colab.getSalario();

            System.out.println("Salario Programador: "+salarioProg);
            System.out.println("Salario Administrador: "+salarioAdm);
            System.out.println("Salario Vigilante: "+salarioVigilante);
            System.out.println("Salario Colaborador: "+salarioColaborador);


        }
}
