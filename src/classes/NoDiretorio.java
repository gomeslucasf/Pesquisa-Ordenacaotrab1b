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
    private ListaDiretorios listaDiretorios;

    public NoDiretorio( String nome) {
        this.prox = null;
        this.nome = nome;
        this.listaArquivos = null;
        this.listaDiretorios =null;
    }

    public NoDiretorio(){
        this.prox = null;
        this.listaArquivos = null;
        
        this.listaDiretorios =null;
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

    public void setListaArquivos(NoArquivo ini, NoArquivo fim) {
        this.listaArquivos.setFimArq(fim);
        this.listaArquivos.setInicioArq(ini);
    }

    public void setListaDiretorios(NoDiretorio ini, NoDiretorio fim) {
        this.listaDiretorios.setFimDir(fim);
        this.listaDiretorios.setInicioDir(ini);
    }
    
    
    
    public ListaArquivos getListaArquivos() {
        return listaArquivos;
    }

    public ListaDiretorios getListaDiretorios() {
        return listaDiretorios;
    }
    
    
}
