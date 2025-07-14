package DesafioModulo;

import java.util.Scanner;

class Food{

    Scanner input = new Scanner(System.in);
    
    String foodName;
    double foodWeight;    
    
    void setFoodInfos(){

        System.out.print("Insira o nome da comida: ");
        this.foodName = input.nextLine();

        System.out.print("Insira o peso da comida: ");
        this.foodWeight = input.nextDouble();

        input.nextLine(); //clean buffer
    }
    
    void closeInput(){
        input.close();
    }
}

