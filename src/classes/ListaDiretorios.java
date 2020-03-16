package classes;
/**
 *
 * @author Gomes
 * @author Geroldi
 */
public class ListaDiretorios {
    private NoDiretorio inicioDir;
    private NoDiretorio fimDir;

    public ListaDiretorios() {
        this.inicioDir = null;
        this.fimDir = null;
    }

    public NoDiretorio getInicioDir() {
        return inicioDir;
    }

    public void setInicioDir(NoDiretorio inicioDir) {
        this.inicioDir = inicioDir;
    }

    public NoDiretorio getFimDir() {
        return fimDir;
    }

    public void setFimDir(NoDiretorio fimDir) {
        this.fimDir = fimDir;
    }
    
    public void inserirDiretorio(String nomeDiretorio, String caminho){
        NoDiretorio novoDir = new NoDiretorio(nomeDiretorio);
              
        NoDiretorio pai = buscarDiretorio(caminho);
        
        if(this.inicioDir == null){
             pai.getListaDiretorios().setInicioDir(novoDir);
             pai.getListaDiretorios().setFimDir(novoDir);
        }
        else{
            pai.getListaDiretorios().getFimDir().setProx(novoDir);
            pai.getListaDiretorios().setFimDir(novoDir);
        }
    }
    
    //buscarDiretorio("C:\\Unoeste/Mestrado");
    public NoDiretorio buscarDiretorio(String caminho){
        String [] endereco = caminho.split("\\");
        String [] caminhoString = endereco[1].split("/");
        NoDiretorio noAux = new NoDiretorio();
        ListaDiretorios listaAux = new ListaDiretorios();
        PilhaDiretorio pilha = new PilhaDiretorio();
        
        //empilhando
        noAux = getInicioDir();
        
        for(int vet=0;vet <= caminhoString.length;vet++){
            while(noAux != null){
                if(pilha.getHead() != null)
                    noAux.setProx(pilha.getHead());
                pilha.setHead(noAux);
                noAux = noAux.getProx();
            }
            
            
            while(pilha.getHead() != null){
                noAux =  pilha.getHead();
                pilha.setHead(pilha.getHead());
                if(noAux.getNome() == caminhoString[vet]){
                    pilha.setHead(null);
                }
            }
            
            if(noAux.getNome() == caminhoString[vet]){
               if(noAux.getListaDiretorios()!=null){
                   listaAux = noAux.getListaDiretorios();
               }
            }
        
            noAux = listaAux.getInicioDir();
        }
        
        return noAux;
    }
    
}
