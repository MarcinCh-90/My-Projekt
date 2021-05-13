package coderslab.Pracadomowa;

public class BankAccount {
          private int number;
          private double cash;

    public BankAccount (int number) {
              this.number = number;
              this.cash = 0;
    }


    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }
        public void depositCash(double amount) {
            if (amount >0) {
                this.cash += amount;
            } else {
                System.out.println(" Błąd watość nie jest większa od 0. Brak możliwości zwiększenia wartości cash");
            }
        }

        public double withdrawCash(double amount) {
            if (amount >= 0) {
                this.cash -= amount;
                return amount;
            } else {
                this.cash = amount;
                this.cash = 0;
                return amount;
            }
        }


    public void printInfo() {
       String bankAccountInfo = "Numer konta " + this.number + " " + "Stan konta: "+ this.cash;
       System.out.println(bankAccountInfo);
    }

    public static void main(String[] args) {
        BankAccount klient = new BankAccount(1);
       // klient.printInfo(); // wydruk informacji stanu konta

            klient.depositCash(300);
            klient.withdrawCash(500);
            klient.printInfo(); // stan konta po wypłaceniu
    }


}
