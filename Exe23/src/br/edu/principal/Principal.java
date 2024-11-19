package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sal, qtd, tipo, valor_kw, gasto, acresc;
        double total, tot_geral = 0, qtd_cons = 0;

        System.out.print("Informe o salário: ");
        sal = scanner.nextDouble();
        
        valor_kw = sal / 8;

        while (true) {
            System.out.print("Informe a quantidade consumida (ou 0 para sair): ");
            qtd = scanner.nextDouble();

            if (qtd == 0) {
                break;
            }

            gasto = qtd * valor_kw;

            System.out.print("Informe o tipo de consumo (1, 2 ou 3): ");
            tipo = scanner.nextDouble();

            if (tipo == 1) {
                acresc = gasto * 5 / 100;
            } else if (tipo == 2) {
                acresc = gasto * 10 / 100;
            } else if (tipo == 3) {
                acresc = gasto * 15 / 100;
            } else {
                acresc = 0;
                System.out.println("Tipo de consumo inválido. Nenhum acréscimo será aplicado.");
            }

            total = gasto + acresc;
            tot_geral += total;

            if (total >= 500 && total <= 1000) {
                qtd_cons++;
            }

            System.out.println("Gasto: " + gasto);
            System.out.println("Acréscimo: " + acresc);
            System.out.println("Total: " + total);
        }

        System.out.println("Total Geral: " + tot_geral);
        System.out.println("Quantidade de consumidores entre 500 e 1000: " + qtd_cons);

        scanner.close();
    }
}

	


