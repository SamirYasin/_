package oopPractice;

import java.util.ArrayList;

public class Sword {
    // 1. Constructor
    // Default Constructor
    public Sword(String material){
        this.material = material;

    }

    // Modified Constructor
    public Sword(double weight, double length, String name, String material){
        this.weight = weight; // assign the value of a variable in the instance variable
        this.length = length;
        this.name = name;
        this.material = material;


    }

    // 2. Instance Variables

    //Static ones -> belongs to the class, what does every sword have? a handle, blade
    public static final Boolean hasHandle = true;
    public static Boolean isSharp;

    //Non-Static -> belongs to the object, What is changing sword by sword?
    public double weight;
    public double length;
    public String name;
    public String material;

    //3 Methods -> What does a sword do?

    //static - what does every sword do?
    public static void slash(){
        System.out.println("Sword is slashing");
    }

    //non-static - what does every sword do differently?
        // weight * length = 2 pounds * 10 length = 20 points
        // weight * length = 15 pounds * 10 length = 150 points
    public void harms(){
        System.out.println("Sword damages = " + (weight * length) + " points");
    }

    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    // running only ONCE before EVERYTHING
    static{
        System.out.println("Starting the sword making the furnace");
        ArrayList swords = new ArrayList<>();
    }
    // this is a non-static code block, can put anywhere and only needs {}
    {
        System.out.println("this is non-static code block");
    }
}
