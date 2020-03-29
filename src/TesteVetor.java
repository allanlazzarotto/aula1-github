
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RJLINK
 */
public class TesteVetor {
    
    public static void main (String[]args){
    
Scanner sc = new Scanner(System.in);
    
int n= sc.nextInt();
double[] vet= new double[n];

for (int i=0;i<n;i++){
    vet[i]=sc.nextDouble();
}

for (int i=0;i<n;i++){
    System.out.println(vet[i]);

    }
    
}
}
