/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
/**
 *
 * @author OHMASTER
 */
public class Herencia {

    public static void main(String[] args) {
        Dog[] dogs = insertDog();
        printDogsOnConsole(dogs);
        feed(dogs);
        System.out.println("After eating------------");
        printDogsOnConsole(dogs);
    }

    private static void feed(Dog[] dogs) {
        for (Dog dog : dogs) {
            double weightBeforefeeding = dog.getWeight();
            dog.setWeight(weightBeforefeeding + 0.5);
        }
    }

    private static void printDogsOnConsole(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printToConsole();
        }
    }

    private static Dog2[] insertDog() {
        Dog2[] dogs = new Dog2[4];
        String[] names = null;
       
 ///Asigna los nombres 
        for(int i=0; i < dogs.length ; i++){
            System.out.println("Ingrese el nombre del perro " + (i+1));
            String nombre = teclado.nextLine();
            names[i]=nombre;
        }
        String[] colours = null;
        //Asigna el Color
        for(int i=0; i < dogs.length ; i++){
            System.out.println("Ingrese el color del perro " + (i+1));
            String color= teclado.nextLine();
            colours[i]=color;
        }
        Double[] weight = null;
        //Asinga el peso
        for(int i=0; i < dogs.length ; i++){
            System.out.println("Ingrese el peso del perro " + (i+1));
            Double peso= teclado.nextDouble();
            weight[i]=peso;
        }
        Double[] portion = null;
        //Asignar la porción
        for(int i=0; i < dogs.length ; i++){
            System.out.println("Ingrese la porcion del perro " + (i+1));
            Double porcion= teclado.nextDouble();
            portion[i]=porcion;
        }

        /*String[] names = {"Coco", "Sultan", "Boby", "Drak"};
        String[] colours = {"brown", "black", "white", "blue"};
        double[] weight = {1.5, 75, 3.5, 45.1};
        double[] portion = {0.2, 1, 0.2, 0.8};*/

        for (int i = 0; i < dogs.length; i++) {
            Dog2 dog = new Dog2();
            dog.setName(names[i]);
            dog.setColour(colours[i]);
            dog.setWeight(weight[i]);
            dog.setPortion(portion[i]);
            dogs[i] = dog;
        }
        return dogs;
    }
}
