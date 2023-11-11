/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_mariapadilla;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author belen
 */
public class Examen1P1_MariaPadilla {
    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran=new Random();
        System.out.println(" M E N U ");
        System.out.println("1.  Fight or Flight ");
        System.out.println("2.  Tri Fuerza ");
        System.out.println("3.  Salir ");
        System.out.println(" Ingrese una opcion: ");
        int opcion =leer.nextInt();
        while (opcion>0 && opcion<3 ){
        switch (opcion ){
            case 1: System.out.println(" Fight or Flight ");
                char resp='s';
                int vidazombie=25;
                int distancia=15+ran.nextInt(16);
                int balas=25;
                int daño=ran.nextInt();
                int probabilidad=ran.nextInt();
                int avance=ran.nextInt();
                int proba=0;
                System.out.println(" Ingrese maestria ");
                System.out.println(" 1. Principiantes (0 % de hit extra + extra damage) ");
                System.out.println(" 2. Intermedio (5% de hit extra + extra damage)  ");
                System.out.println(" 3. Experto (15% de hit extra + extra damage) ");
                int maestria=leer.nextInt ();
                 distancia=15+ran.nextInt(16);
                    
                    switch ( maestria ){
                        case 1:
                            proba=0;
                       
                        break;
                        case 2:
                            proba=70;
                           
                            break;
                        case 3:
                            proba=80;
                            
                            break;
                        
                        
                    }
                    while(distancia>0 && vidazombie>0 && (resp=='s' || resp=='S')){
                        probabilidad=0 +ran.nextInt(101);
                        if ( probabilidad<=proba ){
                            balas=balas-1;
                            daño=0 + ran.nextInt(7);
                            vidazombie=vidazombie-daño;
                            System.out.println(" Hit ! El tiro ha reducido el HP del zombie un total de : "+vidazombie);

                        } else{
                            
                        avance=3+ran.nextInt(5);
                            if (distancia-avance<0){
                            distancia=0;
                            }
                            else{
                            distancia=distancia-avance;
                        }
                            System.out.println(" Ha fallado! la nueva distancia del zombie es:"+distancia);
               

                        }
                            
                     System.out.println(" El zombie se encuentra a "+ distancia+ " metros ");
                     System.out.println();
                     System.out.println(" El jugador cuenta con "+ balas+ " balas " );
                     System.out.println();
                     System.out.println();
                     System.out.println(" Listo para la siguiente ronda? [s/n]: ");
                     resp=leer.next().charAt(0);
                        
                    }  
                    
                    
            
             break;  
                
            case 2:
            
            trifuerza();
        
             break;    
        
        
        
        }
       
        System.out.println(" M E N U ");
        System.out.println("1.  Fight or Flight ");
        System.out.println("2.  Tri Fuerza ");
        System.out.println("3.  Salir ");
        System.out.println(" Ingrese una opcion: ");
        opcion =leer.nextInt();
        }
    }
    public static void trifuerza (){
            System.out.println(" Ingrese la base: ");
            int base=leer.nextInt();
            if ( base>20 && base%2==0){
             System.out.println();
             for (int i=0;i<=base;i++){
                for (int j=0;j<=(base-i);j++){
                    System.out.print(" ");
                       }
                       for ( int b=1;b<=((i*2)-1);b++){
                            System.out.print("*");
                         }
                           System.out.println(" ");
                         }       
     
    }
    System.out.println(" El numero debe de ser mayor de 20 y par ");
}
}
    

