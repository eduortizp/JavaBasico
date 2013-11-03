package app.clase1;

import java.util.Arrays;

public class Array {
public static void main(String[] args){
int num[] = {50,20,45,82,25,63};
int l = num.length;
int i;
System.out.print("Obteniendo numero : ");
for(i = 0;i < l;i++ ){
System.out.print(" " + num[i]);
}

System.out.println("\n");
System.out.print("Ordenando numero : ");
Arrays.sort(num);

for(i = 0;i < l;i++){
System.out.print(" " + num[i]);
}
}
}
