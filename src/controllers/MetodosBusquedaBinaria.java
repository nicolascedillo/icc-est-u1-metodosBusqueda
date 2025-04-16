package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {
    
    private Persona[] personas;
    private ShowConsole showConsole;

    public MetodosBusquedaBinaria(Persona[] personas){
        this.personas = personas;
        this.showConsole = new ShowConsole();
        System.out.println("Clase MBB creada");
    }

    public int findPersonByCode (int code){
        int bajo = 0;
        int alto = personas.length -1;

        while(bajo <= alto){
            int central = bajo + (alto - bajo) / 2;
            //int central2 = (alto + bajo)/2
            if(personas[central].getCode() == code){
                return central;
            }

            if(personas[central].getCode() < code){
                bajo = central +1;
            } else{
                alto = central -1;
            }

        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFind = showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson == -1) {
            System.out.println("No hay persona con ese código");
        }else{
            showConsole.showMessage("Persona con código " + codeToFind + " encontrada");
            showConsole.showMessage(personas[indexPerson].toString());
        }
    }

    private int findPersonByName(String name){
        int bajo = 0;
        int alto = personas.length -1;

        while(bajo <= alto){
            int central = bajo + (alto - bajo) / 2;

            if(personas[central].getName().equals(name)){
                return central;
            }

            if(personas[central].getName().compareTo(name) < 0){
                bajo = central +1;
            } else{
                alto = central -1;
            }

        }
        return -1;
    }

    public void showPersonByName(){
        ordenarPorNombre(personas);
        String nameToFind = showConsole.getName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson == -1) {
            System.out.println("No hay persona con ese código");
        }else{
            showConsole.showMessage("Persona con nombre " + nameToFind + " encontrada");
            showConsole.showMessage(personas[indexPerson].toString());
        }
    }

    public void ordenarPorNombre(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String nombreActual = personas[j].getName();
                String nombreSiguiente = personas[j + 1].getName();
                
                if (nombreActual.compareTo(nombreSiguiente) > 0) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }
    
}
