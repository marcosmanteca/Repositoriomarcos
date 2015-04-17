import java.io.*;

public class Matrices1
{
    
    public Matrices1()
    {
    }    
    
    public void leer_y_visualizar_matriz_de_4_enteros(){
      int v[]=new int[4];
      
      for (int i=0;i<4;i++){
           System.out.print("v["+i+"]= ");
           v[i]=leer_teclado();
    }
    
    System.out.println();
    System.out.println("Visualizar Matriz:");
    for (int i=0;i<4;i++){
        System.out.print("v["+i+"]= "+v[i]);
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
    