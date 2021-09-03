public class Main {
    public static void main(String[] args) {
        Food[] food = new Food[2];

        food[0] = new Apple();
        food[1] = new Orange();

        for (int i = 0; i < food.length; i++) {
            food[i].eat();
        }
    }
}
