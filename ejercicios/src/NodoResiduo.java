public class ArbolResiduos {
    NodoResiduo raiz;
    
    public void construirArbol() {
        raiz = new NodoResiduo("Residuos");
        
        raiz.izquierdo = new NodoResiduo("Orgánicos");
        raiz.derecho = new NodoResiduo("Inorgánicos");
        
        raiz.izquierdo.izquierdo = new NodoResiduo("Comida");
        raiz.izquierdo.derecho = new NodoResiduo("Jardín");
        
        raiz.derecho.izquierdo = new NodoResiduo("Plástico");
        raiz.derecho.derecho = new NodoResiduo("Papel");
    }
    
    public void imprimir(NodoResiduo nodo, int nivel) {
        if (nodo == null) {
            return;
        }
        
        String espacios = "";
        for (int i = 0; i < nivel; i++) {
            espacios = espacios + "  ";
        }
        
        System.out.println(espacios + nodo.nombre + " (Nivel " + nivel + ")");
        
        imprimir(nodo.izquierdo, nivel + 1);
        imprimir(nodo.derecho, nivel + 1);
    }
    
    public static void main(String[] args) {
        ArbolResiduos arbol = new ArbolResiduos();
        arbol.construirArbol();
        
        System.out.println("=== ÁRBOL DE RESIDUOS ===\n");
        arbol.imprimir(arbol.raiz, 0);
    }
}