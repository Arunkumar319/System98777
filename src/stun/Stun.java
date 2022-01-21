/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stun;

import java.util.Scanner;

/**
 *
 * @author college
 */
public class Stun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stud[]sList=new Stud[3];
        Scanner input= new Scanner(System.in);
        
        for(int i=0;i<=sList.length-1; i++)
        {
            sList[i]= new Stud();
          
            System.out.println("Enter Stun name: ");
            sList[i].setName(input.nextLine());
            
        }
        for(int i=0;i<=sList.length-1;i++)
        {
            System.out.println("Stun Name "+sList[i].getName());
        }
        // TODO code application logic here
    }
    
}
