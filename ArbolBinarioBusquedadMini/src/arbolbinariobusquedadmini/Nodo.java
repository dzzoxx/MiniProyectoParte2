
package arbolbinariobusquedadmini;

public class Nodo {//cada objeto nodo tiene:
   int dato;
   Nodo izquierdo;
   Nodo derecho;
   int altura;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
        this.altura = 1;
        
    }
}
