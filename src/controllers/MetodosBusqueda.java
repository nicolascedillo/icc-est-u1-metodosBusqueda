package controllers;

import models.*;
import views.ShowConsole;

public class MetodosBusqueda {
    private views.ShowConsole showConsole;
    private int[] arreglo;
    private Persona[] people;

    public MetodosBusqueda(Persona[] personas){
        showConsole = new ShowConsole();
        this.people = personas;
        showPersonByCode();
    }

    public int busquedaLineal (int[] arreglo, int x){
        for (int i = 0; i < arreglo.length ; i++){
            if (arreglo[i] == x){
                return i;
            }
        } 
        return -1;
    }

    public int findPersonByCode(int code){
        for (int i = 0; i < people.length ; i++){
            if (people[i].getCode() == code)
            return  i;
        }
        return-1;
    }

    public void showPersonByCode(){
        int codeTofind = showConsole.getCode();
        int indexPersona = findPersonByCode(codeTofind);
        if(indexPersona >= 0){
            showConsole.showMessage("Persona Encontrada");
            showConsole.showMessage(people[indexPersona].toString());
        }else{
            showConsole.showMessage("Persona no encontrada");
        }
    }
}
