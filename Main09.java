package pl.coderslab.ckontrolaprzeplywu;

public class Main09 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String puste = " ";//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza
            //tworzymy pętlę generującą nam gwiazdki w wierszu
            for (int j = 0; j < i; j++) {
                String gwiazda = " * ";
                if (j <= 6) {
                    System.out.print(gwiazda);
                   System.out.print(" ");
                }
            }
            System.out.println(puste);
        }
    }
}
