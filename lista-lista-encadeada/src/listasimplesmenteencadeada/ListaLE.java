package listasimplesmenteencadeada;


public class ListaLE {	
	private No sentinelaInicial = new No(null, null);
    private No sentinelaFinal = new No(null, null);
	private int tamanho = 0;
	
	
    public ListaLE() {
        this.sentinelaInicial.setProximo(this.sentinelaFinal);
    }
    
    public int size() {
        return tamanho;
    }   
    
    //metodo isEmpty
    public boolean taVazia() {
        return tamanho == 0;
    }
    
    // Metodo first
    public No primeiro() {
    	if(sentinelaInicial.getProximo() != sentinelaFinal) {
    		return sentinelaInicial.getProximo();
    	}
    	System.out.println("Lista Vazia");
    	
    	return sentinelaInicial;
    }
    public No ultimo(No indice) {
    	while(indice.getProximo() != sentinelaFinal) {
    		indice = indice.getProximo();
    	}
    
		return indice;
    }
    
    public No getSentinelaInicial() {
    	return sentinelaInicial;
    }
    
    // Metodo display
    public void listar(No indice) {
    	if(indice != null) {
    		System.out.println(indice.getObjeto());	
    		indice = indice.getProximo();
    		listar(indice);
    	}
    	else {
    		System.out.println("A lista está vazia");
    	}
    }
    
    // Metodo last

    
    // Metodo before
    public No anterior(No atual) {
    	No indice = sentinelaInicial.getProximo();
    	while(indice.getProximo() != atual) {
    		indice = indice.getProximo();
    	}
		return indice;    
	}

    // Metodo after
    public No proximo(No atual) {
        return atual.getProximo();
    }
    
    // eu estou trocando só o conteudo do nó
    public void substituicao(No no, Object objeto) {
        no.setObjeto(objeto);
    }
    
    // Troca a posição dos objetos dos nós
    public void trocaPosicao(No trocado, No trocador) {
    	Object temp = trocado.getObjeto();
    	trocado.setObjeto(trocador.getObjeto());
    	trocador.setObjeto(temp);
    }
    
    //metodo insertBefore
    public No inserirAntes(No atual, Object objeto) {
    	No novo = new No(atual, objeto);
    	No ant = anterior(atual);
    	ant.setProximo(novo);
    	tamanho++;
    	return novo;
    }
    
   // Metodo inserAfter
    public No inserirDepois(No atual, Object objeto) {
    	No novo = new No(atual.getProximo(), objeto);
    	atual.setProximo(novo);
    	novo.setProximo(novo);
    	tamanho++;
    	return novo;
    }
    
    
    
    
    //Metodo insertFirst
    public No inserirInicio(Object objeto) {
    	No novo = new No(sentinelaInicial.getProximo(), objeto);
    	sentinelaInicial.setProximo(novo);
    	tamanho++;
    	return novo;
    }
    
    //Metodo insertLast 
    public void inserirFim(Object objeto) {
    	No novo = new No(sentinelaFinal, objeto);
    	if(sentinelaInicial.getProximo() == sentinelaFinal) {
    		sentinelaInicial.setProximo(novo);
    	}
    	
    	else {
            No ant = anterior(sentinelaFinal);
        	ant.setProximo(novo);
    	}
    	tamanho++;

    }
    
    
    public No encontrar(Object objeto) {
    	No indice = sentinelaInicial.getProximo();
    	while(objeto == indice.getObjeto()) {
    		indice = indice.getProximo();
    	}
    	return indice;
    }
    
    
    
    //Metodo isFirst
    public boolean eIncial(No atual) {
    	No ant = anterior(atual);
    	return anterior(ant) == null;
    }
    
    //Metodo isLast
    public boolean eUltimo(No atual) {
    	return atual.getProximo() == sentinelaFinal;
    }
    
//    public void remover(No n) {
//        n.getAnt().setProx(n.getProx());
//        n.getProx().setAnt(n.getAnt());
//        n.setAnt(null); // JAVA N PRECISA
//        n.setProx(null); // JAVA N PRECISA
//        this.TAMANHO--;
//    }
}
