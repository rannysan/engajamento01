package engajamento01;

public class alunos {
    private String nome;
	
    public alunos(String nome) {
        setNome(nome);  
    }

    public String getNome(){
        return nome;
    }

    public void setNome(final String nome){
        this.nome = nome;
    }

    @Override 
    public String toString(){
        return getNome();
    }

	public String imprimir() {
		return nome;
	}
}