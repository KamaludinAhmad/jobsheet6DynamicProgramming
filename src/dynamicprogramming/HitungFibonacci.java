/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class HitungFibonacci {

    /**
     * @param args the command line arguments
     */
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main(String[] args){
        String identitas = "Kamaludin Ahmad S. / X RPL 5 / 16";
        
        tampilJudul(identitas);
        int n = tampilInput();
    }
    private static int tampilInput(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke-: ");
        int n = scanner.nextInt();
        return n;
    }
}

    

