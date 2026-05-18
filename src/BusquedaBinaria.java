import models.Persona;

public class BusquedaBinaria {
    public static void sortByName(Persona[] personas){
        for(int i = 0; i<personas.length-1;i++){
            boolean swap = false;
            for(int j = 0 ; j < personas.length-1-i;j++){
                if(personas[j].getEdad()){
                    Product aux = products[j];
                    products[j] = products[j+1];
                    products[j+1] = aux;
                }
            }
            if(!swap)
                break;
        }
    } 
    public int findByAge(Persona[] personas, int edad){
        int bajo = 0;
        int n = personas.length;
        int alto = n-1;
        while(bajo<=alto){
            int medio= (bajo+alto)/2;
            if(personas[medio].getEdad().equals(edad))
                return medio;
            
            int comparacion = personas[medio].getEdad.compareTo(edad);
            if(comparacion<0)
                bajo = medio+1;
            else 
                alto = medio-1;
            
        }
        return -1;

    }
    
}
