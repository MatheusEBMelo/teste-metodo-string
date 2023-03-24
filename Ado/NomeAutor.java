package Ado;

import java.util.Scanner;

public class NomeAutor {
	 public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
	     
		 System.out.println("#NOME AUTOR#");
		 
		 System.out.println("Digite seu nome completo:");
		 String nomeAutor = input.next();
		 
		 
		 retornarReferenciaBibliografica(nomeAutor);
		 
	 }
	 
	 public static String retornarReferenciaBibliografica(String nomeAutor) {
	        String resultado = "";
	        String nomeQuebrado[] = nomeAutor.split(" ");
	        for(int i = 1; i<nomeQuebrado.length;i++){
	            if(i != nomeQuebrado.length - 1 ){
	            resultado = resultado + nomeQuebrado[i]+" ";
	            }else{
	            resultado = resultado + nomeQuebrado[i]+", " + nomeQuebrado[0];
	            System.out.println(resultado);}
	         }
	     
	        return resultado;
	        
	    }
}