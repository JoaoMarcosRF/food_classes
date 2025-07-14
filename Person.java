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
    
    public String eat(){
        
        double weightGain = 0;

        System.out.print("Insira a quantidade de alimentos que voce vai comer: ");
        int howManyTimesEat = input.nextInt();
        input.nextLine(); //clean buffer
        
        System.out.print("---------------------------------------------\n");

        for(int index = 1; index <= howManyTimesEat; index++){

            System.out.printf("Insira o nome do %d° alimento: ", index);
            String foodName = input.nextLine();

            System.out.printf("Insira o peso do %d° alimento: ", index);
            double foodWeight = input.nextDouble();

            input.nextLine();//clean buffer

            System.out.print("---------------------------------------------\n");

            Food newFood = new Food(foodName, foodWeight);
        
            weightGain += newFood.foodWeight;
        }

        return String.format("A pessoa %s terminou o jantar com %.02f kg, ou seja, teve um ganho de %.02f", name, (weight + weightGain), weightGain);
    }

    void closeInput(){
        input.close();
    }
}