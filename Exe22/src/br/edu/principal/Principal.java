package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double idade, tot_f, tot_m, soma_1, cont_m1, cont_m2, tot, cont_f1, media_idade, perc, menor_idade;
		
		char sexo, exp;
		
		
		
		tot = 0;
		tot_f = 0;
		tot_m = 0;
		cont_m1 = 0;
		cont_m2 = 0;
		cont_m2 = 0;
		cont_f1 = 0;
		
		
		idade = scanner.nextInt();
		
		while(idade != 0) {
			sexo = 'M';
			exp = 'S';
			
			if(sexo == 'F' && exp == 'S') {
				if(tot == 0) {
					menor_idade = idade;
					tot = 1;
				} else if(idade < menor_idade) {
					menor_idade = idade;
					
				}
				
				if(sexo == 'M') {
					tot_m ++;
				}
				
				if(sexo == 'F') {
					tot_f ++;
					
				}
				
				if(sexo == 'F' && idade < 21 && exp == 'S') {
					cont_f1 ++;
					
				}
				
				
					
				
			}
		
		
     }
		
		

}}

		
		
		
		

	


