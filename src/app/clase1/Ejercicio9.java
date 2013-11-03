package app.clase1;

import java.util.Scanner;
 
public class Ejercicio9 {
 
  Scanner Leer = new Scanner(System.in);

  private static Scanner leer2;
 
  void llenar (int M [] [], int f, int c)
  {
       
    for (int i = 1 ; i <= f ; i++)
    {
        for (int j = 1 ; j <= c ; j++)
        {
        System.out.print ("Inserte pos[" + i + "][" + j + "]: ");
        M [i] [j] = Leer.nextInt();
        }
    }
    }
 
 
    void mostrar (int M [] [], int f, int c)
    {
    for (int i = 1 ; i <= f ; i++)
    {
        System.out.println ();
        for (int j = 1 ; j <= c ; j++)
        {
        System.out.print ("[" + M [i] [j] + "]");
        }
    }
    }
 
 
    int menor (int M [] [], int f, int c)
    {
    int men = M [1] [1];
    for (int i = 1 ; i <= f ; i++)
    {
        for (int j = 1 ; j <= c ; j++)
        {
        if (M [i] [j] < men)
            men = M [i] [j];
        }
    }
    return (men);
    }
 
 
    int maximo (int M [] [], int f, int c)
    {
    int max = M [1] [1];
    for (int i = 1 ; i <= f ; i++)
    {
        for (int j = 1 ; j <= c ; j++)
        {
        if (M [i] [j] < max)
            max = M [i] [j];
        }
    }
    return (max);
    }
 
 
 
    void intercambiar (int A [] [], int fa, int ca, int B [] [], int fb, int cb)
    {
    int min_a = menor (A, fa, ca);
    int max_b = maximo (B, fb, cb);
 
    //para cambiar los minimos de A con los maximos de B
    for (int i = 1 ; i <= fa ; i++)
    {
        for (int j = 1 ; j <= ca ; j++)
        {
        if (A [i] [j] == min_a)
            A [i] [j] = max_b;
        }
    }
 
    //para intercambiar los maximos de B con los minimos de A
    for (int i = 1 ; i <= fb ; i++)
    {
        for (int j = 1 ; j <= cb ; j++)
        {
        if (B [i] [j] == max_b)
            B [i] [j] = min_a;
        }
    }
    }
 
 
    public static void main (String args [])
    {
    leer2 = new Scanner(System.in);
    Ejercicio9 h = new Ejercicio9 ();
    int A [] [] = new int [20] [20];
    int B [] [] = new int [20] [20];
    System.out.print ("Insert filas de A: ");
    int fa = leer2.nextInt();
    System.out.print ("Insert columnas de A: ");
    int ca = leer2.nextInt();
    System.out.print ("Insert filas de B: ");
    int fb = leer2.nextInt();
    System.out.print ("Insert columnas de B: ");
    int cb = leer2.nextInt();
 
    //lectura de matrices
    System.out.println ("INSERTANDO DATOS EN MATRIZ A: n");
    h.llenar (A, fa, ca);
    System.out.println ("INSERTANDO DATOS EN MATRIZ B: n");
    h.llenar (B, fb, cb);
    System.out.println ("MATRICES ORIGINALMENTE INSERTADAS: ");
    h.mostrar (A, fa, ca);
    System.out.println ();
    h.mostrar (B, fb, cb);
    System.out.println ();
 
    //intercambio de elementos
    h.intercambiar (A, fa, ca, B, fb, cb);
    System.out.println ("MATRICES DESPUES DEL INTERCAMBIO:");
    h.mostrar (A, fa, ca);
    System.out.println ();
    h.mostrar (B, fb, cb);
    }
   
}