package pl.coderslab.ckontrolaprzeplywu;

public class Main10 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String puste = " ";//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza
            //tworzymy pętlę generującą nam gwiazdki w wierszu
            for (int j = 1; j <= n; j++) {
                String gwiazda = " * ";
                if (j <= i) {
                    System.out.print(gwiazda);
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println(puste);
        }
        int g = 5;
        for (int h = 5; h > 0; h--) {
            String nic = "";
            for (int c = 1; c <= g; c++) {
                String gwiazdy = " * ";
                if (h >= c) {
                    System.out.print(gwiazdy);
                } else {
                    System.out.print(c + " ");
                }
            }
            System.out.println(nic);
        }
    }
}

