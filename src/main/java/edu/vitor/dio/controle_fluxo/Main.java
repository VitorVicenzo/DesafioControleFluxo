package edu.vitor.dio.controle_fluxo;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        
        try {
			contar(parametroUm, parametroDois);
            
		
		}catch (ParametrosInvalidosException exception) {
           
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O primeiro parametro deve ser menor que o segundo.");
            }
		int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }    
    }
}