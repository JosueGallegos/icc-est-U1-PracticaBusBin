public class MetodoOrdenamiento {

    public int busquedaBinaria(Persona[] persona, int edadBuscada ){
        int inicio = 0;
        int fin = persona.length -1;
        //int pos;

        while (inicio <= fin) {
            int centro= (inicio + fin)/2;
            int Vcentro = persona[centro].getEdad();

            System.out.println("Arreglo: ");
            for (int i = inicio; i <= fin;i++) {
                System.out.println(persona[i].getEdad()+" ");

                
            }
            if(Vcentro == edadBuscada){
                System.out.println();
                return centro;
            }else if(Vcentro < edadBuscada){
                System.out.println();
                inicio = centro +1;

            }else{
                System.out.println();
                fin = centro +1;
            }

            

            

            
        }
        return -1;

    }
   


    
}
