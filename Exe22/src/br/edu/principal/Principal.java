package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double idade, tot_f = 0, tot_m = 0, soma_1 = 0, cont_m1 = 0, cont_m2 = 0, tot = 0, cont_f1 = 0, media_idade, perc, menor_idade = 0;
        char sexo, exp;

        idade = scanner.nextInt();

        while (idade != 0) {
            System.out.print("Informe o sexo (M/F): ");
            sexo = scanner.next().charAt(0);
            System.out.print("Tem experiência (S/N): ");
            exp = scanner.next().charAt(0);

            if (sexo == 'F' && exp == 'S') {
                if (tot == 0) {
                    menor_idade = idade;
                    tot = 1;
                } else if (idade < menor_idade) {
                    menor_idade = idade;
                }

                tot_f++;
                if (idade < 21) {
                    cont_f1++;
                }
            }

            if (sexo == 'M') {
                tot_m++;
                if (idade > 45) {
                    cont_m1++;
                }

                if (exp == 'S') {
                    soma_1 += idade;
                    cont_m2++;
                }
            }

            idade = scanner.nextInt();
        }

        System.out.println(tot_f);
        System.out.println(tot_m);

        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência");
        } else {
            media_idade = soma_1 / cont_m2;
            System.out.println(media_idade);
        }

        if (tot_m == 0) {
            System.out.println("Nenhum homem");
        } else {
            perc = (cont_m1 * 100) / tot_m;
            System.out.println(perc);
        }

        System.out.println(cont_f1);
        System.out.println(menor_idade);

        scanner.close();
    }
}

