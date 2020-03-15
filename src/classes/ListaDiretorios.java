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
    
    public void inserirDiretorio(String nomeDiretorio){
        NoDiretorio novoDir = new NoDiretorio(null, nomeDiretorio);
                
        if(this.inicioDir == null){
             setInicioDir(novoDir);
             setFimDir(novoDir);
        }
        else{
            getFimDir().setProx(novoDir);
            setFimDir(novoDir);
        }
    }
    
    
    //buscarDiretorio("C:\\Unoeste/Mestrado")
    public NoDiretorio buscarDiretorio(String caminho){
        
        
        
        
        return null;
    }
    
}
