package switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        System.out.println("Digite o dia da semana (1 - 7)");
        
        Scanner scan = new Scanner(System.in);
               
        int diaSemana = scan.nextInt();
        /*
        if (diaSemana == 1){
            System.out.println("Domingo");
        } else if (diaSemana == 2){
            System.out.println("Segunda");
        } else if (diaSemana == 3){
            System.out.println("Terça");
        } else if (diaSemana == 4){
            System.out.println("Quarta");
        } else if (diaSemana == 5){
            System.out.println("Quinta");
        } else if (diaSemana == 6){
            System.out.println("Sexta");
        } else if (diaSemana == 7){
            System.out.println("Sabado");
        } else {
            System.out.println("Eu falei de (1 - 7) animal");
        }       
        */
        
        /*
        switch (diaSemana){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terca"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sabado"); break;
            default: System.out.println("Eu falei de (1 - 7) animal");
        */
        
        switch (diaSemana){
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: System.out.println("Is dia util"); break;
            case 1:
            case 7: System.out.println("Is fim de semana"); break;
            default: System.out.println("Eu falei de (1 - 7) animal");
        
        }
        
    }
    
}
