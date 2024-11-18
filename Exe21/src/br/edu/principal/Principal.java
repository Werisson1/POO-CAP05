package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num, soma = 0, qtd = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;
        double qtd_par = 0, soma_par = 0, qtd_impar = 0, media, perc, media_par;

        
        while (true) {
            System.out.print("Digite um número (ou 30000 para sair): ");
            num = scanner.nextDouble();

            
            if (num == 30000) {
                break;
            }

           
            if (qtd == 0) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }

           
            soma += num;
            qtd++;

         
            if (num % 2 == 0) {
                soma_par += num;
                qtd_par++;
            } else {
                qtd_impar++;
            }
        }

        
        if (qtd == 0) {
            System.out.println("Nenhum número digitado.");
        } else {
           
            System.out.println("Soma: " + soma);
            System.out.println("Quantidade de números: " + qtd);

            media = soma / qtd;
            System.out.println("Média geral: " + media);

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);

          
            if (qtd_par == 0) {
                System.out.println("Nenhum número par.");
            } else {
                media_par = soma_par / qtd_par;
                System.out.println("Média dos números pares: " + media_par);
            }

      
            perc = (qtd_impar * 100.0) / qtd;
            System.out.println("Porcentagem de números ímpares: " + perc + "%");
        }

        scanner.close(); 
    }
}
