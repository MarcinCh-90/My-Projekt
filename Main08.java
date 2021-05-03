package pl.coderslab.ckontrolaprzeplywu;

public class Main08 {

    public static void main(String[] args) {
        //definicja zmiennej z ilością rzędów i gwiazdek w wierszu
        int n = 5;
        for(int i = 1; i <= n; i++) {
            String puste = " ";//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza
            //tworzymy pętlę generującą nam gwiazdki w wierszu
            for(int j = 1; j <= n; j++) {
                String gwiazda = " * ";
                if (j<=i) {
                    System.out.print(gwiazda);
                }
                else {
                    System.out.print(j + " ");
                }
            }
            System.out.println(puste);
        }
    }
}


