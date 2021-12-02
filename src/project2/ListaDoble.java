package project2;

public class ListaDoble {

    NodoDoble first, last;

    public static int tamaño;
    
    // se crean los nodos

    public ListaDoble() {
        first = null;
        last = null;
        tamaño = 0;

    }

    // si la lista esta vacia
    public boolean isEmpty() {
        if (first == null && last == null) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        while (!isEmpty()) {
            borrar(first);

        }
    }

    // para incertar nuevo nodo cambiar de pociosion
    public void insertar(String nom, String dir) {

        NodoDoble nuevo = new NodoDoble(nom, dir);
        if (first == null) {
            first = nuevo;
            first.siguiente = first;
            nuevo.anterior = last;
            last = nuevo;
        } else {
            last.siguiente = nuevo;
            nuevo.siguiente = first;
            nuevo.anterior = last;
            last = nuevo;
            first.anterior = last;
        }
        tamaño++;
    }

    // retornar tamaño
    public int size() {
        if (isEmpty()) {

            return 0;

        } else {
            return tamaño;
        }
    }

    //para retornar un contador que dice nonde esta el nodo en la lista
    public int index(NodoDoble b) {
        NodoDoble aux = first;
        int con = 0;
        do {
            if (aux == b) {
                return con;
            }
            aux = aux.siguiente;
            con++;
        } while (aux != first);

        return -1;
    }

    public NodoDoble get_cancion(int index) {
        if (index < 0 || index >= tamaño) {
            return null;
        }
        int n = 0;
        NodoDoble aux = first;
        while (n != index) {
            aux = aux.siguiente;
            n++;
        }
        return aux;
    }

    public void borrar(NodoDoble d) {
       
        boolean encontrado = false;
       NodoDoble actual = first;
       NodoDoble anterior = last;
        do {
            if (actual == d) { // para buscar segun el nombre de la cancion
                if (actual == first) {
                    first = first.siguiente;
                    last.siguiente = first;
                    first.anterior = last;
                } else if (actual == last) {// condicion cuando se elimina el ultimo
                    last = anterior;
                    first.anterior = last;
                    last.siguiente = first;
                } else {
                    anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = anterior;
                }
                encontrado = true;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != first && encontrado == false);
    }

}
