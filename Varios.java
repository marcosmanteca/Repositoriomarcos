 //ESTO ES DEL EJERCICIO 7, PARA EL ALEATORIO.
import java.io.*;
import java.util.Random;

//EJERCICIO 1  SUMA Y MEDIA DE NOTA DE ALUMNOS Y DECIR SI ESTA APROBADO O SUSPENSO

public class Varios
{
    private int x;
    private int y;

    public Varios()
    {
        x = 7;
        y = 9;
        //otra forma
        //cambiar(a,b);
    }
    
    public Varios(int a, int b)
    {
        x = a;
        y = b;
    }
    
    public void cambiar(int a, int b)
    {
        x = a;
        y = b;
    }
    
    public int suma()
    {
        return x+y;
    }
    
    public double media()
    {   
        return (x+y)/2.0;
    }
    
 
    public String calificacion()
    {  
        double media = media(); //<---Lo ponemos asi para que no haya que hacer la media en cada if, si pondiamos media() en cada if
        if (media<5){
     return "Suspenso";   
    }
     if (media>=5 && media<7){
     return "Aprobado";   
    }
     if (media>=7 && media<=8){
     return"Notable";
    }
     else{ return "Sobresaliente";}
    }
     
    
    
    //EJERCICIO 2
    //Metodo para devolver el valor maximo de a y b
    public int maximo (int a, int b)
    {
     if(a>b){
     return a;
     }
     else {return b;}
    }
    //Metodo para devolver el valor maximo de a y b c
     public int maximo (int a, int b, int c)
    {
     if(a>=b && a>=c)
        return a;
     
     else if (b>c)
              return b;
          else
              return c;
    }

    //OTRO METODO MAS CORTO para devolver el valor maximo de a y b c
    public int maximo2 (int a, int b, int c)
    {
    int aux=maximo(a,b);
    return maximo(aux,c);
    }
    //OTRO MAS CORTO AUN.
    public int maximo3 (int a, int b, int c)
    {
    return maximo(maximo(a,b),c);
    }
    
    
    
    
    //EJERCICIO 3. CALCULAR EN UNA NOMINA LO QUE SE VA A COBRAR SEGUN SUS HORAS
    //UNA FORMA
    /*
    public double nomina(int horas)
    {
        double total = 0;
        double valor_horas1 = 6.5;
        double valor_horas2 = 7.25;
        double valor_horas3 = 9;
        double valor_horas4 = 25;
        
        if (horas<=40){
           total = horas * valor_horas1;
        }
        else{
            if (horas <= 50 ){
                total = 40*valor_horas1 + (horas-40)*valor_horas2;
            }
            else{
                if (horas <= 70){
                    total = 40*valor_horas1 + 10*valor_horas2 + (horas-50)*valor_horas3;                    
                    }
                else{
                    total = 40*valor_horas1 + 10*valor_horas2 + 20*valor_horas3 + (horas-70)*valor_horas4;
                }
            }
        }
        return total;
    }
    */
    
   //OTRA FORMA
   public double nomina(int horas){
        double total=0;
        
        if(horas>70){
            total+=(horas-70)*25;
            horas=70;
        }
        
        if(horas>50){
            total+=(horas-50)*9;
            horas=50;
        }
        
        if(horas>40){
            total+=(horas-40)*7.5;
            horas=40;
        }   
        
        if(horas>0){
            total+=horas*6.5;
            horas=0;
        }    
        
        return total;
    }
    
    //EJERCICIO 4
    public int suma_enteros1(int x){
    int suma=0;
    for(int i=1;i<=x;i++)
        suma+=i;
    return suma;
    }
    
    //EJERCICIO 4 SUMAR SOLO LOS PARES
    public int suma_enteros(int x){
    int suma=0;
    for(int i=1;i<=x;i++)
        if(i%2==0)
            suma+=i;
    return suma;
    }
    
    //EJERCICIO 4 SUMAR SOLO LOS PARES OTRA FORMA
    
   public int suma_de_numeros_pares2(int x){
        int suma=0;
        for(int i=2;i<=x;i+=2)
            suma+=i;
        return suma;
    }
   
    //EJERCICIO 5 Un método llamado fibonacci que devuelve un long
    
   public long fibonacci(int x)
   { 
       if (x<=1)
           return x;
       else {
             long aux2=0;
             long aux1=1;
             for (int i=2;i<=x;i++){
                 long aux=aux2+aux1;
                 aux=aux1;
                 aux1=aux;
             }
             return aux1;
       
       
        }
    }
   
    
    // EJERCICIO APARTE. INTERCAMBIAR ESOS VALORES, CON EL AUX GUARDAMOS EL VALOR DE X PARA LUEGO UTILIZARLO, YA QUE SINO SE MODIFICARIA.
   public void intercambiar()
   {
       int x=3;
       int y=4;
       System.out.println("Antes: x="+x+",y="+y);
    
       int aux=x;
       x=y;
       y=aux;
    
       System.out.println("Despues: x="+x+",y="+y);
    
    }

   //EJERCICIO 6. saber si un numero es divisible, dando el resto 0
   
   public boolean divisible(int x, int y)
   
  {    return (x%y==0);
  }
  
  //saber si un numero es primo este metodo no es eficiente
  
  public boolean primo(int a)
  {   
      boolean aux=true;
      for (int i=2;i<a;i++){
           if (divisible(a,i))
               aux=false;
      }
      return aux;
  
  }
  //este es mejor
  public boolean primo2(int a)
  {   
      boolean aux=true;
      int i=2;
      while(i<a && aux){
           if (divisible(a,i))
               aux=false;
           i++;
      }
      return aux;
  
  }
 
  //EJERCICIO 7, ADIVINA 
    
    public int leer_teclado(){
        int numero = 0;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            String numero_letra = entrada.readLine();
            numero = Integer.parseInt(numero_letra);
        }catch (IOException e) {}

        return numero;
    }

    public int dame_un_numero_comprendido_entre(int minimo, int maximo){
        int x;
        do{
            System.out.print( "Introduzca un número ("+minimo+"-"+maximo+"): " );
            x=leer_teclado();
        }while(x<minimo || x>maximo);
        return x;
    }

    public int obtener_aleatorio_entre(int minimo, int maximo){
        Random r = new Random();
        return r.nextInt(maximo-minimo+1)+minimo;
    }

    public void adivina(){
        int min = 1;
        int max = 100;
        int aux = obtener_aleatorio_entre(min,max);

        int num;
        do{
            num = dame_un_numero_comprendido_entre(min,max);

            if (num < aux)
                min = num;
            else // num > aux
                max = num;
        }while (num != aux);

        System.out.println( "Has acertado.");
    }
    //EJERCICIO 8
    public void leer_escribir(){
        int numero;
        do{
            System.out.print("Dame un número: ");
            numero = leer_teclado();
            escribir_pantalla(numero);
        }while(numero!=0);
        
    }    
    
    public void escribir_pantalla(int n){
        System.out.println(n);
    }

    public void leer_y_escribir_y_visualizar_el_maximo(){
        int numero;
        int mayor=0;
        do{
            System.out.print("Dame un número: ");
            numero = leer_teclado();
            escribir_pantalla(numero);
            if (numero>mayor)
                mayor=numero;
        }while(numero!=0);
        System.out.print("El mayor ha sido: ");
        escribir_pantalla(mayor);

    }

      public void leer_escribir_y_visualizar_el_mayor_el_menor_la_suma_y_la_media(){
        int numero;
        int mayor=0;
        int menor=0;
        int suma=0;
        int cuantos=0;
        do{
            System.out.print("Dame un número: ");
            numero = leer_teclado();
            escribir_pantalla(numero);
            if (numero>mayor)
                mayor=numero;
            if (numero<menor);
            suma+=numero;
            cuantos++;
        }while(numero!=0);
        System.out.print("El mayor ha sido: ");
        escribir_pantalla(mayor);
        System.out.print("El menor ha sido: ");
        escribir_pantalla(menor);
        System.out.print("La suma de todos es: ");
        escribir_pantalla(suma);
        System.out.print("La media de todos es: ");
        escribir_pantalla((double)suma/cuantos);
    }
      public void escribir_pantalla(double n){
        System.out.println(n);
    }      

    
    //EJERCICIO 8 /HECHO POR MI
    public void introducir_numero(){
       int numero;
       int introNumeros;
       String cadena="";
       do{
            System.out.print("Introducir un numero del 0-10: ");
            numero = leer_teclado();
        }while(numero<1 || numero>10);

       System.out.print("Introduzca "+(numero)+" numeros: ");
       for (int i=0;i<numero;i++){
         introNumeros=leer_teclado();
         cadena+=introNumeros +" ";
       }
       System.out.print("Los numeros introducidos son: "+cadena);
    }   
    
    //HECHO POR PROFESOR
    public void introducir_numero2(){
       int cuantos,aux;
       do{
            System.out.print("Introducir un numero del 0-10: ");
            cuantos = leer_teclado();
        }while(cuantos<1 || cuantos>10);

       for (int i=1;i<cuantos;i++){
         System.out.print("Introducir un numero: ");
         aux=leer_teclado();
         escribir_pantalla(aux);
       }
    }   
    
    //EJERCICIO 9.multiplos de un numero hasta 1000000.
    
    public void multiplos_hasta_1000000(){
      int numero;
       do{
          System.out.print("Introducir un numero entre 1 y 100: ");
          numero = leer_teclado();
       }while(numero<1 || numero>100);
        
        for (int i=1;i*numero<=1000000;i++){
         escribir_pantalla(i*numero);
       }
          
    }
    
    //Otra parte del 9, visualizar sus 100 primeros multiplos.
    
     public void numero_entre_1y100_multiplos_1y1millon_100multiplos(){
        int numero=0;
        do{
            System.out.print("Escribe un número entre 1 y 100: ");
            numero = leer_teclado();
        }
        while (numero<1 || numero>100);

        for (int i=numero;i<=numero*100;i+=numero){
            System.out.println(i);
        }
     } 
}  
