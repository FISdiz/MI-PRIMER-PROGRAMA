package miprimerprograma;
import java.util.Scanner;

public class MiPrimerPrograma {

	public static void main(String[] args) {
		
		int i,j,contador;
		contador = 0;
		for(j=0;j<10;j++){
			for(i=0;i<10;i++) {
				System.out.printf("%d * %d = %d\n",j, i, j*i);
				contador+=1;
			}
			contador+=1;
		}
		System.out.print(contador);
		
		
	}

}
