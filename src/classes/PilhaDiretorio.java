
package classes;

/**
 *
 * @author Gomes
 */
public class PilhaDiretorio {
    private NoDiretorio head;

    public PilhaDiretorio(NoDiretorio head) {
        this.head = head;
    }

    public PilhaDiretorio() {
        this.head = null;
    }

    public NoDiretorio getHead() {
        return head;
    }

    public void setHead(NoDiretorio head) {
        this.head = head;
    }
    
    
    
    
}
