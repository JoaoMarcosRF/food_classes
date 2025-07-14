package DesafioModulo;

import java.util.Scanner;

class Person{

    Scanner input = new Scanner(System.in);
    
    String name;
    double weight;

    public Person(){
        name = "deafult";
        weight = 0.0;
    }
    
    public Person(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    
    String eat(){
        
        int weightGain = 0;
        

        System.out.print("Insira a quantidade de alimentos que voce vai comer: ");
        int howManyTimesEat = input.nextInt();
        input.nextLine(); //limpeza de buffer
        
        for(int index = 1; index <= howManyTimesEat; index++){
            Food newFood = new Food();
            newFood.setFoodInfos();
            
            weightGain += newFood.foodWeight;
        }

        return String.format("A pessoa %s terminou o jantar com %.02fkg, ou seja, teve um ganho de %.02f", name, weight + weightGain, weightGain);
    }

    void closeInput(){
        input.close();
    }
}