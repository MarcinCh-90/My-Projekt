package coderslab.dzien2.konstruktor;

import java.util.Arrays;

public class Calculator {
    private String[] operations;

    public Calculator() {
        this.operations = new String[0];
    }

    private  void addToOperations(String operation) {
        // najpierw odajemy w tablicy krotkę żeby wpisać do niej operację
        // robimy kopie tablicy o rozmiarze o jeden większym niż aktualna
        this.operations = Arrays.copyOf(this.operations, this.operations.length +1);
        // w ostatnia komórkę tablicy wstawimy operacje
        this.operations[this.operations.length-1] = operation;
    }

    public double add(double num1, double num2) {
        double result = num1 +num2;
        String operation = "added " + num1+ " to " + num2 + " got " + result;
        addToOperations(operation);
        return num1+num2;
    }

    public double multiply(double num1, double num2) {
        double result = num1*num2;
        String operation = "multipied " + num1+ " with " + num2 + result;
        addToOperations(operation);
        return num1*num2;
    }

    public double subtract(double num1, double num2){
        double result = num1-num2;
        String operation = "subtracted " + num1+ " from " + num2 + result;
        addToOperations(operation);
        return num1-num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {

            System.out.println("Pamiętaj że nie można dzielić przez 0");
            return 0;
        }
        double result = num1 / num2;
        String operation = "divided " + num1 + " by " + num2 + result;
        addToOperations(operation);
        return num1 / num2;

    }

    public void printOperations() {
       // for (int i=0, i<operations.length; i++){
    //System.out.println(this.operations[i]);
       // } z każdym elementem najlepiej pisac ta poniżej pętle :
        for (String s : this.operations){
            System.out.println(s);
        }
    }

    public void clearOperations() {
        this.operations = new String[0];
    }

    public static void main (String [] args) {
        Calculator a = new Calculator();
        a.add(2,2);
        a.multiply(2,3);
        a.divide(5,1);
        // wyświetlić wynik dolną instrukcja nie trzeba już system.out..
        a.printOperations();
    }
}
