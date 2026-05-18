import models.Persona;

public class BusquedaBinaria {
    public static void sortByName(Persona[] personas){
         for(int i = 1 ; i<personas.length; i++){
            Persona aux = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getEdad()>aux.getEdad()){
                personas[j+1] = personas[j];
                j--;

            }
            personas[j+1]=aux;
         }
    } 
    public int findByAge(Persona[] personas, int edad){
        int bajo = 0;
        int n = personas.length;
        int alto = n-1;
        while(bajo<=alto){
            int medio= (bajo+alto)/2;
            if(personas[medio].getEdad())
                return medio;
            
            int comparacion = personas[medio].getEdad);
            if(comparacion<0)
                bajo = medio+1;
            else 
                alto = medio-1;
            
        }
        return -1;

    }
    
}
