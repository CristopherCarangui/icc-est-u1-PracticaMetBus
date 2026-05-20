import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        BusquedaBinaria bBinaria = new BusquedaBinaria();
        Persona[] people = ListPersonas();
        BusquedaBinaria.sortByAge(people);
        
        BusquedaBinaria.printarregloByAge(people);
        System.out.println("Arreglo ordenado por edad");
        bBinaria.findByAge(people, 18);
        
    }

    public static Persona[] ListPersonas(){
        Persona[] personas = new Persona[9];
        personas[0]= new Persona("Pablo",4);
        personas[1]= new Persona("Marcelo",5);
        personas[2]= new Persona("Pedro",18);
        personas[3]= new Persona("Joaquin",60);
        personas[4]= new Persona("Marco",25);
        personas[5]= new Persona("Francisco",12);
        personas[6]= new Persona("Mario",8);
        personas[7]= new Persona("Esteban",8);
        personas[8]= new Persona("Carlos",40);

        return personas;
    }
}
