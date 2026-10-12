package arbolbinariobusquedadmini;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        ArbolBinario arbol = new ArbolBinario();
        
        String respuesta;
        int dato;
        int opcion;
        
        System.out.println("===== ARBOL BINARIO =====");
        do {            
            System.out.println("\nIngrese el dato que desea insertar: ");
            dato = lector.nextInt();
            
            arbol.insertar(dato);
            System.out.println("");
            arbol.mostrarArbol();
            System.out.println("Deseas insertar otro dato? (s/n)");
            respuesta=lector.next();
            
        } while (respuesta.equalsIgnoreCase("s"));
        
       
        
        do {         
            System.out.println("<<< MENU DE RECORRIDOS >>>");
System.out.println("\n1. PREORDEN");
System.out.println("2. INORDEN");
System.out.println("3. POSTORDEN");
System.out.println("4. BUSCAR DATO");
System.out.println("5. ELIMINAR DATO");
            System.out.println("7. FACTOR DE EQUILIBRIO");
            System.out.println("8. MOSTRAR ARBOL");
            System.out.println("9. ALTURA DEL ARBOL");
System.out.println("10. Salir");
            
            System.out.println("Selecciones una opcion: ");
            opcion = lector.nextInt();
            
            switch (opcion) {

    case 1:
        System.out.println("\nRecorrido PreOrden (R - I - D):");
        arbol.preOrden();
        break;

    case 2:
        System.out.println("\nRecorrido InOrden (I - R - D):");
        arbol.inOrden();
        break;

    case 3:
        System.out.println("\nRecorrido PostOrden (I - D - R):");
        arbol.postOrden();
        break;

    case 4:
        System.out.println("\nIngrese el dato que desea buscar:");
        dato = lector.nextInt();
        if (arbol.buscar(dato)) {
            System.out.println("El dato "+dato+" si se encuentra en el arbol. ");
            
            System.out.println("Altura del nodo: "+arbol.alturaNodo(dato));
        } else {
            System.out.println("El dato no se encuantra en el arbol");
        }
        break;

        
    case 5:
        System.out.println("\nIngrese el dato que desea eliminar:");
        dato = lector.nextInt();

        if (arbol.buscar(dato)) {
            arbol.eliminar(dato);
            System.out.println("El dato " + dato + " fue eliminado.");
            
            System.out.println("\nArbol actualizado: ");
            arbol.mostrarArbol();
        } else {
            System.out.println("El dato no se encuentra en el arbol.");
        }
        break;

    case 6:
        System.out.println("\nIngrese el dato:");
        dato = lector.nextInt();
        
        int altura =arbol.alturaNodo(dato);
        if (altura == -1) {
            System.out.println("El dato no existe.");
        } else {
            System.out.println("Altura del nodo "+dato+": "+altura);
        }
        break;
    case 7:
        System.out.println("Ingrese el dato: ");
        dato = lector.nextInt();
        
        int factor = arbol.factorEquilibrio(dato);
        if (factor == -999) {
            System.out.println("El dato no existe");
        } else {
            System.out.println("Factor de equilibrio del nodo "+dato+" : "+factor);
            
        }
        break;
    case 8: 
        System.out.println("\nArbol AVL:");
        arbol.mostrarArbol();
        break;
    case 9:
        System.out.println("\nAltura del arbol: "+arbol.alturaArbol()
        );
        break;
    case 10:
        System.out.println("\nPrograma finalizado.");
        break;
    default:
        System.out.println("\nOpcion no valida");
}
        } while (opcion !=10);
        lector.close();
    }
    
}
