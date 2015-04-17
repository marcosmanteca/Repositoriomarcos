import java.io.*;

public class Matrices
{
    private int v[];

    public Matrices()
    {
        v = new int[4];
    }

    public Matrices(int cuantos)
    {
        if (cuantos<1)
            cuantos=1;
        v = new int[cuantos];
    }

    
    public void leer_matriz(){
        System.out.println("Leer Matriz:");
        for (int i=0;i<v.length;i++){
            System.out.print("v["+i+"]= ");
            v[i] = leer_teclado();
        }
    }

    
    public void visualizar_matriz(){
        System.out.println("Visualizar Matriz:");
        for (int i=0;i<v.length;i++){
            System.out.println("v["+i+"]= "+v[i]);
        }
    }

    
    /*public int mayor(){
       int max=v[0];
       for (int i=1;i<v.length;i++){
            if (v[i]>max)
                max=v[i];
       }
       return max;
    }

    public int menor(){
       int min=v[0];
       for (int i=1;i<v.length;i++){
            if (v[i]<min)
                min=v[i];
       }
       return min;
    }*/

    public int mayor(){
       return v[posicion_mayor()];
    }

    
    public int menor(){
       return v[posicion_menor()];
    }

    
    public int suma(){
       int suma=v[0];
       for (int i=1;i<v.length;i++)
           suma+=v[i];
       return suma;
    }

    
    public int posicion_mayor(){
        int p=0;
        for (int i=1;i<v.length;i++)
            if(v[i]>v[p])
                p=i;
        return p;
    }

    
    public int posicion_mayor(int inicio, int fin){
        int p=inicio;
        for (int i=inicio+1;i<=fin;i++)
            if(v[i]>v[p])
                p=i;
        return p;
    }

    
    public int posicion_menor(){
        int p=0;
        for (int i=1;i<v.length;i++)
            if(v[i]<v[p])
                p=i;
        return p;
    }

    
    public int posicion_menor(int inicio, int fin){
        int p=inicio;
        for (int i=inicio+1;i<=fin;i++)
            if(v[i]<v[p])
                p=i;
        return p;
    }

    
    public void intercambiar(int p1, int p2){
        int aux=v[p1];
        v[p1]=v[p2];
        v[p2]=aux;
    }

    
    public void ordenar_ascendente(){
       for (int i=0;i<v.length-1;i++){
           int pos_menor=posicion_menor(i,v.length-1);
           if (i!=pos_menor)
               intercambiar(i,pos_menor);
       }
    }
    
    
    public void ordenar_descendente(){
       for (int i=0;i<v.length-1;i++){
           int pos_mayor=posicion_mayor(i,v.length-1);
           if (i!=pos_mayor)
               intercambiar(i,pos_mayor);
       }
    }
    
    
    public void ordenar(){
       int i = 0;
       int j = v.length-1;
       while(i<j){
           int pos_menor=posicion_menor(i,j);
           if (i!=pos_menor)
               intercambiar(i,pos_menor);
       
           int pos_mayor=posicion_mayor(i+1,j);
           if (j!=pos_mayor)
               intercambiar(pos_mayor,j); 
           
           i++;
           j--;
       }
       
    }
    
    
    public void copiar (int vector[]){
    v = new int[vector.length];    
    for (int i=0;i<v.length-1;i++){
        v[i]=vector[i];
    }
    }
    
    
    public int leer_teclado(){
        int numero = 0;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            String numero_letra = entrada.readLine();
            numero = Integer.parseInt(numero_letra);
        }catch (IOException e) {}

        return numero;
    }
}