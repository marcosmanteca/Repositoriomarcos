import java.io.*;

public class Tabla
{
    private int t[][];
    private int filas,columnas;

    public Tabla()
    {
        filas=3;
        columnas=4;
        t = new int [filas][columnas];
    }

    public void visualizar(){
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++)
                visualizar_valor(" "+t[i][j]);
            saltar_linea();
        }
    }

    public void visualizar_valor(String s){
        int l=s.length();
        for (int i=0;i<5-l;i++)
            System.out.print(" ");
        System.out.print(s);
    }

    public void saltar_linea(){
        System.out.println();
    }

    public void leer_tabla(){
        System.out.println("Leer Tabla:");
        for (int i=0;i<filas;i++)
            for (int j=0;j<columnas;j++){
                System.out.print("T["+i+","+j+"]= ");
                t[i][j]=leer_teclado();
            }
    }

    public int suma(){
        int aux=0;
        for (int i=0;i<filas;i++)
            for (int j=0;j<columnas;j++)
                aux+=t[i][j];
        return aux;
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