/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class ArrayDuaDimensi {
    public static void main(String[] args) {
        int angka [][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        for (int baris=0; baris<3; baris++){
        for (int kolom=0; kolom<5; kolom++){
            System.out.print(angka[baris][kolom]+" ");}
        System.out.println(" ");}
    }
    
}
