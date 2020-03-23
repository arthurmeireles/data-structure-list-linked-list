package listasimplesmenteencadeada;

public class No {
	private No proximo;
	private Object objeto;
	
	
	public No(No proximo, Object objeto) {
		this.proximo = proximo;
		this.setObjeto(objeto);
	}
	
	
	public No getProximo() {
		return proximo;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}


	public Object getObjeto() {
		return objeto;
	}


	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}
	
	
	
}
