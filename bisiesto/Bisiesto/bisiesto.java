package Bisiesto;

import java.util.Scanner;

/**
 * Clase bisiesto
 * Esta clase compreba si un año es bisiesto o no.
 * @author halle
 *
 */

public class bisiesto {

	public static void main(String[] args) {
		int ano;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("introduzca cualquier año para saber si es bisiesto (ejemplo 2050 o 1990)");
		ano=sc.nextInt();
		}while(ano<0);
		if(esbisiesto(ano)) {
			System.out.println(ano+" es un año bisiesto");
		}else {
			System.out.println(ano+" no es un año bisiesto");
		}
	}
	public static boolean esbisiesto (int ano) {
		if (ano%4==0&&ano%100!=0||ano%400==0&&ano%100==0) {
			return true;
		}else {
			return false;
		}
	}

}