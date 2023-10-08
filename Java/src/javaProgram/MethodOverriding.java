package javaProgram;
class Wildanimal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Lion extends Wildanimal {
	  public void animalSound() {
	    System.out.println("Lion Roaring");
	  }
	}

	class Tiger extends Wildanimal {
	  public void animalSound() {
	    System.out.println("Tiger Growling");
	  }
	}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wildanimal myAnimal = new Wildanimal();
	    Wildanimal myLion = new Lion();
	    Wildanimal myTiger = new Tiger();
	        
	    myAnimal.animalSound();
	    myLion.animalSound();
	    myTiger.animalSound();

	}

}
