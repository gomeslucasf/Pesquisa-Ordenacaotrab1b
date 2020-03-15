package classes;

/**
 * @author Gomes
 * @author Geroldi
 */
public class ListaArquivos {
    private NoArquivo inicioArq;
    private NoArquivo fimArq; 

    public ListaArquivos() {
        this.inicioArq = null;
        this.fimArq = null;
    }

    public NoArquivo getInicioArq() {
        return inicioArq;
    }

    public void setInicioArq(NoArquivo inicioArq) {
        this.inicioArq = inicioArq;
    }

    public NoArquivo getFimArq() {
        return fimArq;
    }

    public void setFimArq(NoArquivo fimArq) {
        this.fimArq = fimArq;
    }
    
    public void inserirArquivo(String nomeArquivo){
        NoArquivo novoArq = new NoArquivo(null, nomeArquivo);
        
        if(this.inicioArq == null){
            setInicioArq(novoArq);
            setFimArq(novoArq);
        }
        else{
            getFimArq().setProx(novoArq);
            setFimArq(novoArq);
        } 
    }
    
}
