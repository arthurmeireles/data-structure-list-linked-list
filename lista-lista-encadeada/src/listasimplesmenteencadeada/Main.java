package listasimplesmenteencadeada;

import java.util.Scanner;
	 
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String variavel;
		
		ListaLE lista = new ListaLE();
		
		while(true) {
            System.out.print(" --- MENU ----"
                    + "\n1. size"
                    + "\n2. isEmpty"
                    + "\n3. isFirst"
                    + "\n4. isLast"
                    + "\n5. first"
                    + "\n6. last"
                    + "\n7. before"
                    + "\n8. after"
                    + "\n9. replaceElement"
                    + "\n10. swapElements"
                    + "\n11. insertBefore"
                    + "\n12. insertAfter"
                    + "\n13. insertFirst"
                    + "\n14. insertLast"
                    + "\n15. remove"
                    + "\n16. display\n");
            int entradaMenu = input.nextInt();
            
            // Testada
            if(entradaMenu == 1) {
            	System.out.println("O tamanho atual da lista é: " + lista.size());
            }
            // Testada
            if(entradaMenu == 2) {
            	System.out.println("Tá vazia? "+ lista.taVazia());
            }
            if(entradaMenu == 3) {
                System.out.println("isFirst: " + lista.eIncial( lista.primeiro() ) );

            }
            if(entradaMenu == 4) {
            	No indice = lista.getSentinelaInicial();
                System.out.println("isLast: " + lista.eUltimo(lista.ultimo(indice)) );
            }
            
            // Essa Função mostra qual o primeiro da lista. Função Testada
            if(entradaMenu == 5) {
            	System.out.println(lista.primeiro().getObjeto());
            }
            
            if(entradaMenu == 6) {
            	No indice = lista.getSentinelaInicial();
            	System.out.println(lista.ultimo(indice).getObjeto());
            }
            if(entradaMenu == 7) {
            	System.out.println("Digite o elemento: ");
            	variavel = input.next();
            	No result = lista.encontrar(variavel);
            	
            	System.out.println("Digite o novo elemento: ");
            	variavel = input.next();
            	lista.inserirAntes(result, variavel);            	
            }
            if(entradaMenu == 8) {
            	System.out.println("Digite o elemento: ");
            	variavel = input.next();
            	No result = lista.encontrar(variavel);
            	
            	System.out.println("Digite o novo elemento: ");
            	variavel = input.next();
            	lista.inserirDepois(result, variavel);
            }
            if(entradaMenu == 9) {
            	System.out.println("Digite o elemento: ");
            	variavel = input.next();
            	No result = lista.encontrar(variavel);
            	
            	System.out.println("Digite o novo elemento: ");
            	variavel = input.next();            	
            	lista.substituicao(result, variavel);
            }
            if(entradaMenu == 10) {
            	
            	System.out.println("Digite o elemento: ");
            	variavel = input.next();
            	No result = lista.encontrar(variavel);            	
            	
            	System.out.println("Digite o elemento: ");
            	variavel = input.next();
            	No result2 = lista.encontrar(variavel);
            	lista.trocaPosicao(result, result2);
            }
            if(entradaMenu == 11) {
            	System.out.println("Digite o elemento para buscarmos: ");
            	variavel = input.next();
            	No result = lista.encontrar(variavel);
            	
            	System.out.println("Digite o novo elemento: ");
            	variavel = input.next();   
            	lista.inserirAntes(result, variavel);
            }
            if(entradaMenu == 12) {
            	System.out.println("Digite o elemento para buscarmos: ");
            	variavel = input.next();
            	No result = lista.encontrar(variavel);
            	
            	System.out.println("Digite o novo elemento: ");
            	variavel = input.next();   
            	
            	lista.inserirDepois(result, variavel);
            }
            
            // Testada
            if(entradaMenu == 13) {
            	System.out.println("Digite o conteúdo do objeto");
            	variavel = input.next();
            	
            	lista.inserirInicio(variavel);
            	
            }
            
            // Testada
            if(entradaMenu == 14) {
            	System.out.println("Digite o conteúdo do objeto");
            	variavel = input.next();
            	lista.inserirFim(variavel);
            }
            if(entradaMenu == 15) {
            	
            }
            // Testada
            if(entradaMenu == 16) {
            	No indice = lista.getSentinelaInicial();
            	lista.listar(indice);
            }
		}
		
	}
	
}
