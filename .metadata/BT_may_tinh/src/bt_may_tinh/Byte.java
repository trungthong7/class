/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_may_tinh;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Byte {
    public static void main(String[] args){
        byte a, b;
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=s.nextByte();
        System.out.print("Nhap b: ");
        b=s.nextByte();    
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a*b");
    }
}
