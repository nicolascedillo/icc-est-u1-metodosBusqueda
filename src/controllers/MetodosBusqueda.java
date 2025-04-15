package controllers;

public class MetodosBusqueda {
    private views.ShowConsole showConsole;
    private int[] arreglo;

    public int busquedaLineal (int[] arreglo, int x){
        for (int i = 0;i<=arreglo.length;i++){
            if (arreglo[i] == x){
                return i;
            }
        } 
        return -1;
    }
}
