package streamsapi;

public class Main {
    public static void main(String[] args) {

        Greeting greeting= new EnglishGreeting();
        greeting.greet();

        Greeting greeting1 = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Anything");
            }
        };

        greeting1.greet();

        Greeting greeting2 = () -> {
            System.out.println("shortcase");
        };

        greeting2.greet();


    }
}
