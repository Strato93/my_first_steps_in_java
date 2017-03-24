import java.util.Scanner;
import java.awt.*;
import java.io.File;

import samples.Animal;
import samples.Vehicle;

public class MyClass {
		public static void main(String[] args){
			/*
			String name = "David";
			int age = 42;
			double score = 15.9;
			char group = 'Z';
			boolean online = true;
			System.out.println(score);
			System.out.println("Hello World!!4!");
			*/
			/*
			Scanner myVar = new Scanner(System.in);
			System.out.println(myVar.nextLine());
			*/
			/*
			Animal dog = new Animal();
			dog.bark();
			*/
			/*
			Vehicle v1 = new Vehicle();
			Vehicle v2 = new Vehicle();
			v1.color="red";
			v2.horn();
			*/
			/*
			Vehicle v1 = new Vehicle();
			Vehicle v2 = new Vehicle("Green");
			//v1.setColor("Red");
			System.out.println(v1.getColor()+" "+v2.getColor());
			*/
			File ff1 = new File("C:\\helloka.txt");
			if (!ff1.exists()) System.out.println("hahaha");
			Animal a1 = new Animal("Robby");
			Animal a2 = new Animal("Robby");
			System.out.println(a1.equals(a2));
		}
}
