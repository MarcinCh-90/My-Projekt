package coderslab.dzien1;

public class Main01 {
    public static void main(String[] args) {
        Cat filemon= new Cat();
        Dog dog = new Dog();
        if (filemon.equals(dog)){
            System.out.println("Są równe");
        }else {
            System.out.println("Nie są równe");
        }

    }
}
