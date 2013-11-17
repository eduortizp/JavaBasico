package app.clase4.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Colecciones {

    public static void main(String[] args) {
        Colecciones.ejemploMap();
    }

    public static void ejemploMap() {

        Estudiante jose = new Estudiante("Jose", "Zapata Bolognesi,");
        Estudiante luis = new Estudiante("Luis", "Ayasta Libertad,");
        Estudiante memo = new Estudiante("Memo", "Lopez Union,");
        
        HashMap<String, Estudiante> listado = new HashMap<String, Estudiante>();
        listado.put("123", luis);
        listado.put("124", memo);
        listado.put("125", jose);
        
        listado.get("124").printEstudiante();
        
        Collection<Estudiante> listadoMap = listado.values();
        for (Estudiante estudiante : listado.values()){
            estudiante.printEstudiante();
        }

    }

    public static void ejemploLoHashSet() {

        Estudiante jose = new Estudiante("Jose", "Zapata Bolognesi,");
        Estudiante luis = new Estudiante("Luis", "Ayasta Libertad,");
        Estudiante memo = new Estudiante("Memo", "Lopez Union,");
        Estudiante tato = new Estudiante("Tato", "Union Lopez,");
        Estudiante july = new Estudiante("July", "Quiroz Espinoza,");
        Estudiante mary = new Estudiante("Mary", "Palomino Briceño,");
        Estudiante telmo = new Estudiante("Telmo", "Casas de la Puente,");
        Estudiante jacky = new Estudiante("Jacky", "Cotrina Chavez,");

        Set<Estudiante> listado = new HashSet<Estudiante>();
        listado.add(jose);
        listado.add(luis);
        listado.add(luis);
        listado.add(memo);
        listado.add(tato);
        listado.add(tato);
        listado.add(july);
        listado.add(mary);
        listado.add(mary);
        listado.add(telmo);
        listado.add(jacky);

        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }
        System.out.println(listado.size());

    }

    public static void ejemploLinkedList() {

        Estudiante jose = new Estudiante("Jose", "Zapata Bolognesi,");
        Estudiante luis = new Estudiante("Luis", "Ayasta Libertad,");
        Estudiante memo = new Estudiante("Memo", "Lopez Union,");

        LinkedList<Estudiante> listado = new LinkedList<Estudiante>();

        listado.add(jose);
        listado.add(luis);
        listado.add(memo);

        ListIterator<Estudiante> ite = listado.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) listado.poll();
            e.printEstudiante();
        }
        System.out.println(listado.size());
    }

    public static void ejemploEstudiantes() {

        Estudiante jose = new Estudiante("Jose", "Zapata Bolognesi,");
        Estudiante luis = new Estudiante("Luis", "Ayasta Libertad,");
        Estudiante memo = new Estudiante("Memo", "Lopez Union,");
        Estudiante tato = new Estudiante("Tato", "Union Lopez,");
        Estudiante july = new Estudiante("July", "Quiroz Espinoza,");
        Estudiante mary = new Estudiante("Mary", "Palomino Briceño,");
        Estudiante telmo = new Estudiante("Telmo", "Casas de la Puente,");
        Estudiante jacky = new Estudiante("Jacky", "Cotrina Chavez,");

        List<Estudiante> listado = new ArrayList<Estudiante>();
        listado.add(jose);
        listado.add(luis);
        listado.add(memo);
        listado.add(tato);
        listado.add(july);
        listado.add(mary);
        listado.add(telmo);
        listado.add(jacky);

        Collections.sort(listado);

        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }
        System.out.println(listado.get(1));

        Estudiante luis1 = listado.get(1);
        luis.printEstudiante();

    }
}
