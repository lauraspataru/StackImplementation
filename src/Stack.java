import java.util.Collections;
import java.util.LinkedList;

public class Stack {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();
        String animal1 = "Dog Bella";
        String animal2 = "Dog Charlie";
        String animal3 = "Dog Daisy";
        String animal4 = "Cat Lilly";
        String animal5 = "Rabbit Jack";
        String animal6 = "Hamster Milo";

        Collections.addAll(animals, animal1, animal2, animal3, animal4, animal5, animal6);
        System.out.println("Current animals in our administration: " + animals);
        peakOfList(animals);

        String animal7 = "Kitty Ema";


        push(animals, animal7);
        peakOfList(animals);
        pop(animals);


        System.out.println("Does the list contain the element 'Dog Bella'? Answer: "+ animals.contains("Dog Bella"));
    }

    public static void push(LinkedList<String> animalParam, String addedAnimal) {
        if (addedAnimal != null) {
            Collections.addAll(animalParam, addedAnimal);
            System.out.println("The value '" + addedAnimal + "'had been added!");
            System.out.println("Updated collection: " + animalParam);
        } else {
            System.out.println("A value must be added to the animal list!");
        }
    }

    public static void pop(LinkedList<String> animalParam) {
        if (animalParam != null) {
            animalParam.removeLast();
            System.out.println("Updated list without the last entered animal: "+animalParam);
        }
        else{
            System.out.println("List is empty!");
        }
    }

    public static void peakOfList(LinkedList<String> animalParam) {
        if (!animalParam.isEmpty()) {
            System.out.println("Last animal from the list is: " + animalParam.getLast());
        } else {
            System.out.println("The list is empty; please add something before calling this function.");
        }
    }

}