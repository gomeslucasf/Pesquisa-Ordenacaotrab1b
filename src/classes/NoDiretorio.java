package classes;
/**
 *
 * @author Gomes
 * @author Geroldi
 */
public class NoDiretorio {
    private NoDiretorio prox;
    private String nome;
    private ListaArquivos listaArquivos;

    public NoDiretorio(NoDiretorio prox, String nome) {
        this.prox = prox;
        this.nome = nome;
        this.listaArquivos = null;
    }

    public NoDiretorio(){
        this.prox = null;
        this.listaArquivos = null;
        this.nome = "";
    }
    
    public NoDiretorio getProx() {
        return prox;
    }

    public void setProx(NoDiretorio prox) {
        this.prox = prox;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /*
    Codigo da Lista
    */
    
    
}
