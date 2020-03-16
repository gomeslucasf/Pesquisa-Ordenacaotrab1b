/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Gomes
 */
public class PilhaArquivo {
    private NoArquivo head;

    public PilhaArquivo() {
    }

    public PilhaArquivo(NoArquivo head) {
        this.head = head;
    }
    
    public NoArquivo getHead() {
        return head;
    }

    public void setHead(NoArquivo head) {
        this.head = head;
    }
    
}
