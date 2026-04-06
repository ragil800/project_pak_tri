package javaapplication1;

import java.util.Scanner;

public class input_outout {
    
    public static void main (String [] args){
            Scanner inputUser = new Scanner(System.in);
            Scanner masukan = new Scanner(System.in);
            System.out.println("inputkan nama anda");
            System.out.println("masukan umur anda");
            System.out.println("masukan uang anda");
            System.out.println("masukan karakter yang anda sukai");
            String nama = inputUser.nextLine();
            String simbol = inputUser.nextLine();
            int absen = inputUser.nextInt();
            double uang = inputUser.nextDouble();
            System.out.println("nama yang di inputkan: " + nama);
            System.out.println("absen yang di inputkan: " + absen);
            System.out.println("uang yang di inputkan: " + uang);
            System.out.println("karakter yang disukai: " + simbol);
    }
}
