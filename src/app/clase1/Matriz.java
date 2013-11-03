package app.clase1;

public class Matriz {
	
public static void main(String[] args) {
	
int[][] matriz = new int[5][];

//Rellenar la matriz
for(int i=0; i<matriz.length;i++) {
matriz[i] = new int[6];
for(int j=0;j<matriz[i].length;j++)
matriz[i][j] = i + j;
}

//Mostrar la matriz
for(int i=0;i<matriz.length;i++) {
for(int j=0; j<matriz[i].length;j++)
System.out.print(matriz[i][j] + " ");
System.out.println();
}
}
}