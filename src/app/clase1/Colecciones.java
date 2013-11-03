package app.clase1;

public class Colecciones {
public static void main(String[] args) {
//Creacione inicializacion
String[] saludos = new String[4];

//Inserci�n
saludos[0] = new String("Hola");
saludos[1] = new String("Adios");
saludos[2] = new String("Hello");
saludos[3] = new String("GoodBye");

//Extracci�n
String extraccion= saludos[2];
System.out.println(extraccion);

//Borrado
saludos[2] = null;
saludos[3] = null;

//Recorrido
for(int i=0;i<saludos.length;i++)
System.out.println(saludos[i]);

//Busqueda
for(int i=0;i<saludos.length;i++)
{
if(saludos[i] != null&& saludos[i].equals("Adios"))
{
System.out.println("Adios ha sido encontrado en la posici�n: " + i);
break;
}
}
}
}