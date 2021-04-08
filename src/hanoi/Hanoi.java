
package hanoi;

import java.util.Scanner;

public class Hanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tower1 = 1, tower2 = 2, tower3 = 3, disk = 0;
        char op = 'S';
       

        do {  
            System.out.print("Con cuantos disk desea jugar: ");
            disk = sc.nextInt();
            
            play(disk, tower1, tower2, tower3);
            
            System.out.print("Desea seguir jugando? [S/N]: ");
            op = sc.next().charAt(0);
            
            System.out.println("\n");
            
        } while (op == 'S');
    }
    
    static void play(int disk, int tower1, int tower2, int tower3){
        if(disk == 1){
            System.out.println("Mover disco de la torre " + tower1 + " a la torre " + tower3 );
        }else{
            play(disk - 1, tower1, tower3, tower2);
            System.out.println("Mover disco de la torre " + tower1 + " a la torre " + tower3);
            play(disk - 1, tower2, tower1, tower3); //We change the order of the discs
        }
    }
    
}
