package _06_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	 void quack() {
		 System.out.println("duck quack");
	 }
	 
	 void waddle() {
		 System.out.println("duck waddle");
		 
	 }
	 
	 Duck(String favoriteFood, int numberOfFriends) {
	      	this.favoriteFood = favoriteFood;
	      	this.numberOfFriends = numberOfFriends;
	}
}

	




