package classes;

/**
 *
 * @author Gomes
 * @author Geroldi
 */
public class NoArquivo {
    private NoArquivo prox;
    private String nome;

    public NoArquivo(String nome) {
        this.prox = null;
        this.nome = nome;
    }

    public NoArquivo() {
    }

    
    public NoArquivo getProx() {
        return prox;
    }

    public void setProx(NoArquivo prox) {
        this.prox = prox;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
