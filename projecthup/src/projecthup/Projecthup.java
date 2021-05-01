/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthup;
import java.util.Scanner;
public class Projecthup{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rule = 0;
        int x,y,counter =1,gcd =0;
        while (counter <= 1)
        {
            System.out.println("Please Enter tow numbers:");
             x = input.nextInt();
             y = input.nextInt();
            System.out.println("Please Enter the gcd:");
            gcd = input.nextInt();
            rule = x / gcd;
            counter ++;
        }
        System.out.println(rule);
         if ((rule %2) == 0)
                System.out.println("p2 is winner");
                else
                    System.out.println("p1 is winner");
        }
    }
