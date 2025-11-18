/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W05;

/**
 *
 * @author leeji
 */
import java.util.Scanner;

public class W05E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the value N for the length:");
        int length = Input.nextInt();
        for (int i=length ; i > 0 ; i --){
            for (int j = length ; j> 0 ; j --){
                System.out.print("P");
            }
                
            System.out.println();
        }
    }
    
}
