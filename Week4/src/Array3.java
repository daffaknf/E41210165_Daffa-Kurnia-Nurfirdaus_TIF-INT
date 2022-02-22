
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Array3 {
    public static void main(String[] args) {
        Scanner masuk= new Scanner(System.in);
        System.out.print("jumlah mahasiswa : ");
        int n=masuk.nextInt();
        String mahasiswa [][] = new String[n][3];
        for (int i=0; i<n; i++){
            System.out.println("");
            System.out.println("data mahasiswa ke-"+ (i+1));
        for (int j=0; j<3; j++){
            if (j==0)System.out.print("NIM : ");
            else if (j==1) System.out.print("NAMA : ");
            else System.out.print("jurusan : ");
            System.out.print("");
            mahasiswa [i][j] = masuk.next();}
        } System.out.println("Data Mahasiswa yang di masukkan");
          System.out.println("--------------------------------");
          System.out.println("NIM \t\t\t NAMA \t\t Jurusan \t");
          for (int i=0; i<n; i++) {for (int j=0; j<3; j++){
              System.out.print(mahasiswa[i][j]+"\t\t");}
          } System.out.println();
    }
    
}
