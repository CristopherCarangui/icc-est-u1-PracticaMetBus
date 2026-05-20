import models.Persona;

public class BusquedaBinaria {
    public static void sortByAge(Persona[] personas){
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
            printfindByAge(personas, bajo, alto);
            int medio= (bajo+alto)/2;
            System.out.print("bajo= " + bajo + "   ");
            System.out.print("alto= " + alto + "   ");
            System.out.print("Medio= " + medio + "   ");
            System.out.print("valorMedio= " + personas[medio].getEdad() + " ");
            if(personas[medio].getEdad() == edad){
                System.out.println("Encontrado");
                System.out.println("La persona con la edad " + personas[medio].getEdad() +  " es " +personas[medio].getNombre());
                return medio;
            }
            else if (personas[medio].getEdad()<edad){
                bajo = medio+1;
                System.out.println("--> Derecha");
            }
            else {
                alto = medio -1;
                System.out.println("-->Izquierda");

            }
            
        }
        return -1;

    }

    public static void printfindByAge(Persona[] personas,int inicio,int fin){
        for(int i =0; i< personas.length;i++){
            if(i>= inicio && i<=fin){
                System.out.print(personas[i].getEdad()+"|");
            }
        }
        System.out.println();
    }

    public static void printarregloByAge(Persona[] personas){
        for(Persona people : personas){
            System.out.println(people);
        }
        System.out.println();
    }
    
}
