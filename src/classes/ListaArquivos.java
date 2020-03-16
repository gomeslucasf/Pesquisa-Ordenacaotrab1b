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
        NoArquivo novoArq = new NoArquivo(nomeArquivo);
        
        if(this.inicioArq == null){
            setInicioArq(novoArq);
            setFimArq(novoArq);
        }
        else{
            getFimArq().setProx(novoArq);
            setFimArq(novoArq);
        } 
    }
    
     public NoArquivo buscarArquivo(String nome){
        NoArquivo noAux = new NoArquivo();
        PilhaArquivo pilha = new PilhaArquivo();
        
        //empilhando
        noAux = getInicioArq();
 
        while(noAux != null){
            if(pilha.getHead() != null)
                noAux.setProx(pilha.getHead());
            pilha.setHead(noAux);
            noAux = noAux.getProx();
        }


        while(pilha.getHead() != null){
            noAux =  pilha.getHead();
            pilha.setHead(pilha.getHead());
            if(noAux.getNome() == nome){
                pilha.setHead(null);
            }
        }
        
        return noAux;
    }
    
    
}
