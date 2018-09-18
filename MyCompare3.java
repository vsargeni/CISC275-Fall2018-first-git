import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCompare3{
	
	public static void main(String[] args){
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>(){
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		});
		System.out.println(dogs);
		Collections.sort(dogs);
		System.out.println(dogs);
	}

}

class Animal implements Comparable<Animal>{
	String name;
	int legs;

	public Animal(){

	}

	public int getLegs(){
		return legs;
	}

	public String toString(){
		return name + " " + legs; 
	}


	public int compareTo(Animal ani){
		if (ani.getLegs()>this.getLegs()){
			return 1;
		}
		else if(ani.getLegs()<this.getLegs()){
			return -1;
		}
		else{
			return 0;
		}
		
	}
}

class Dog extends Animal{
	public Dog(String name, int legs){
		this.legs=legs;
		this.name=name;
	}
}