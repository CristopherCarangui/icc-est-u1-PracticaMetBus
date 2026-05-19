import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = {
            new Persona("Pablo",4),
            new Persona("Maria",5),
            new Persona("Juan",18),
            new Persona("David",60),
            new Persona("Mateo",25),
            new Persona("Diego",12),
            new Persona("Ana",8),
            new Persona("Alicia",9),
            new Persona("Jaime",40)

        };
        BusquedaBinaria bBinaria = new BusquedaBinaria();
        BusquedaBinaria.sortByAge(personas);
        BusquedaBinaria.printarregloByAge(personas);
        bBinaria.findByAge(personas, 18);
    }
}
