package s12algoritmosmiercoles;

import java.awt.List;
import java.util.LinkedList;

public class Cola {
    LinkedList<Enlace> enlaces = new LinkedList<>();;

    public Cola() {
    }
    
    public boolean enqueue(Enlace en) {
        return enlaces.add(en);
    }
    
    public Enlace dequeue() {
        Enlace enla = null;
        if (!enlaces.isEmpty()) {
            enla = enlaces.getFirst();
            enlaces.removeFirst();
        }
        return enla;
    }
    
    public void clear() {
        enlaces.clear();
    }
    
    public boolean isEmpty() {
        return enlaces.isEmpty();
    }
    
    
    public int size() {
        return enlaces.size();
    }
    
    public Enlace peek() {
        return enlaces.getFirst();
    }
    
    public LinkedList<Enlace> listar() {
        return enlaces;
    }
}
