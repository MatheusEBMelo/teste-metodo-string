package Ado;

public class ContarPalavra {
		    public static void main (String args[]){
		      String randomText = "Matheus gosta da maysa e a maysa gosta do matheus";

		        String text = "maysa";
		        int quantidade = 0;
		        for (int i = 0; i < randomText.length(); i++) {
		            if (randomText.substring(i).startsWith(text)) {    // startsWith = Testa se esta string começa com o prefixo especificado
		                quantidade ++;
		            }
		        }
		        System.out.println(randomText + " contém " + text + " " + quantidade + " vezes.");

		    }
}
