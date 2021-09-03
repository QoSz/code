package switchapp;

public class Switchapp {

    public static void main(String[] args) {
	    int age;
	    age = 19;

        switch (age) {
            case 17 -> System.out.println("You are not allowed to drink!");
            case 18 -> System.out.println("You are allowed to drink!");
            case 19 -> System.out.println("You are allowed to drink and smoke but it is bad for your health!");
            default -> System.out.println("Your age is not know so you are not allowed to drink or smoke");
        }
    }
}
