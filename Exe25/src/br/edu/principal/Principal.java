package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco, imp = 0, transp = 0, seguro, fim, total_imp = 0, origem;
        String meio_t = "", carga = "";

        System.out.println("Digite o Preço (ou 0 para finalizar): ");
        preco = scanner.nextDouble();
        scanner.nextLine();

        while (preco > 0) {
            System.out.println("Origem [1, 2 ou 3]:");
            origem = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Meio de Transporte [T, F ou A]:");
            meio_t = scanner.nextLine().toUpperCase();

            System.out.println("Carga Perigosa [S ou N]:");
            carga = scanner.nextLine().toUpperCase();

            if (origem == 1) {
                imp = preco * 0.10;
            } else if (origem == 2) {
                imp = preco * 0.15;
            } else if (origem == 3) {
                imp = preco * 0.20;
            }

            if (carga.equals("S")) {
                if (origem == 1) {
                    transp = 50;
                } else if (origem == 2) {
                    transp = 21;
                } else if (origem == 3) {
                    transp = 24;
                }
            } else if (carga.equals("N")) {
                if (origem == 1) {
                    transp = 12;
                } else if (origem == 2) {
                    transp = 21;
                } else if (origem == 3) {
                    transp = 60;
                }
            }

            if (origem == 2 || meio_t.equals("A")) {
                seguro = preco / 2;
            } else {
                seguro = 0;
            }

            fim = preco + imp + transp + seguro;
            total_imp += imp;

            System.out.println("Imposto: R$ " + imp);
            System.out.println("Valor do Transporte: R$ " + transp);
            System.out.println("Seguro: R$ " + seguro);
            System.out.println("Preço Final: R$ " + fim);

            System.out.println("Digite o Preço (ou 0 para finalizar): ");
            preco = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("Total de Impostos: R$ " + total_imp);
        scanner.close();
    }
}

