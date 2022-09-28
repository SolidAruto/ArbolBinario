package arbolbinario;

import javax.swing.JTextField;

public class arbol {
    private Nodo raiz;
    private String cad = "";
    private int cont = 0;
    
    public arbol(String dato){
        raiz = new Nodo (dato);
        raiz.setIzquierda(null);
        raiz.setDerecha(null);
    }
    
    public void insertarIzquierda(String dato, Nodo ref){
        if(ref != null){
            Nodo nuevo = new Nodo(dato);
            ref.setIzquierda(nuevo);
        }
    }
    public void insertarDerecha(String dato, Nodo ref){
        if(ref != null){
            Nodo nuevo = new Nodo(dato);
            ref.setDerecha(nuevo);
        }
    }
    
    public String niveles(Nodo ref){
        if(ref != null){
            if(ref == raiz){
                cad = "";
            }
            cad = cad + " " + ref.getDato();
            niveles (ref.getIzquierda());
            niveles (ref.getDerecha());
        }
        return cad;
    }
    
    public String preOrden (Nodo ref){
        if(ref != null){
            if(ref == raiz){
                cad = cad + " " + ref.getDato();
                preOrden(ref.getIzquierda());
                preOrden(ref.getDerecha());
            }
        }
        return cad;
    }
    
    public String inOrden (Nodo ref) {
        if(ref != null){
            if (ref == null){
                cad = "";
            }
            inOrden(ref.getIzquierda());
            cad = cad + " " + ref.getDato();
            inOrden(ref.getDerecha());
        }
        return cad;
    } 
    
    public String posOrden(Nodo ref){
        if(ref != null){
            if(ref == null){
                cad = "";
            }
            posOrden(ref.getDerecha());
            posOrden(ref.getIzquierda());
            cad = cad + " " + ref.getDato();
        }
       return cad; 
    }
    
    public Nodo getRaiz(){
        return raiz;
    }

    public void insertarIzquierda(JTextField txt2, Nodo raiz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertarDerecha(JTextField txt3, Nodo raiz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
