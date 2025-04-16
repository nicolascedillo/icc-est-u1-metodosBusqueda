import controllers.MetodosBusqueda;
import controllers.MetodosBusquedaBinaria;
import models.*;
public class App {
    public static void main(String[] args) throws Exception {

        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "Maria");
        personas[2] = new Persona(103, "Carlos");
        personas[3] = new Persona(104, "Ana");
        personas[4] = new Persona(105, "Luis");
        personas[5] = new Persona(106, "Sofia");
        personas[6] = new Persona(107, "Pedro");

        MetodosBusqueda mB = new MetodosBusqueda(personas);

        int[] arreglo = {1,2,3};
        int x = 2;

        int index = mB.busquedaLineal(arreglo, x);
        System.out.println(index);

        int posicion = mB.findPersonByCode(106);
        System.out.println(posicion);

        MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);

        mBB.showPersonByCode();

        mBB.showPersonByName();

    }
}
