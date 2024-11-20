package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double op, sal = 0, imp = 0, aum = 0, novo_sal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU DE OPÇÕES");
        System.out.println("1- Imposto");
        System.out.println("2- Novo Salário");
        System.out.println("3- Classificação");
        System.out.println("4- Finalizar Programa");
        System.out.println("Digite a Opção desejada:");
        op = scanner.nextDouble();

        if (op < 1 || op > 4) {
            System.out.println("Opção Inválida!");
        } else {
            if (op == 1) {
                System.out.println("Digite o Salário:");
                sal = scanner.nextDouble();

                if (sal < 500) {
                    imp = sal * 0.05;
                } else if (sal <= 850) {
                    imp = sal * 0.10;
                } else {
                    imp = sal * 0.15;
                }

                System.out.println("Imposto: R$ " + imp);
            }

            if (op == 2) {
                System.out.println("Digite o Salário:");
                sal = scanner.nextDouble();

                if (sal > 1500) {
                    aum = 25;
                } else if (sal >= 750) {
                    aum = 50;
                } else if (sal >= 450) {
                    aum = 75;
                } else {
                    aum = 100;
                }

                novo_sal = sal + aum;
                System.out.println("Novo Salário: R$ " + novo_sal);
            }

            if (op == 3) {
                System.out.println("Digite o Salário:");
                sal = scanner.nextDouble();

                if (sal <= 700) {
                    System.out.println("Classificação: Mal Remunerado");
                } else {
                    System.out.println("Classificação: Bem Remunerado");
                }
            }

            if (op == 4) {
                System.out.println("Programa Finalizado.");
            }
        }

        scanner.close();
    }
}
