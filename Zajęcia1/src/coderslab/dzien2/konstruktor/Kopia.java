package coderslab.dzien2.konstruktor;

import java.util.Arrays;

public class Kopia {

    public class Calculator {
        private String[] operations;

        public Calculator() {
            this.operations = new String[0];
        }


        private void addToOperations(String operation) {
            // najpierw dodajemy w tablicy krotkę żeby wpisać do niej operację
            // robimy kopie tablicy o rozmiarze o jeden większym niż aktualna
            this.operations = Arrays.copyOf(this.operations, this.operations.length + 1);
            // w ostatnią komórkę tablicy wstawiamy operację
            this.operations[this.operations.length - 1] = operation;
        }

        public double add(double num1, double num2) {
            double result = num1 + num2;
            String operation = "added " + num1 + " to " + num2 + " got " + result;

            addToOperations(operation);
            return result;
        }
    }
}
