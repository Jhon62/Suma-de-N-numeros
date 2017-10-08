/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Jhon
 */
public class SumadeNumeros_N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner t = new Scanner(System.in);
		
		int N, fin=0;
		
		System.out.print("Ingrese un numero mayor a 0: ");
		N = t.nextInt();
		
		if(N > 0){
			for(int i=1; i<=N; i++){
				fin = fin + i;
			}
			
			System.out.println("El valor total es: " + fin);
		}else{
			System.out.println("El valor introducido no es mayor a 0");
		}
	
    }
    
}
