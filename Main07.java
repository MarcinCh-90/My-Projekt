package pl.coderslab.dtablice;

public class Main07 {

	public static void main(String[] args) {
		double[] tempCelc = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
		float averageTemp = 0;
		for (int i = 0; i < tempCelc.length; i++) {
			averageTemp += tempCelc[i]*1.8+32;
		}
		averageTemp /= tempCelc.length;
			System.out.println(averageTemp);// Test passed lecz wynik nie jest do 2 miejsc po przecinku
			System.out.println(String.format("%.2f",averageTemp)); //Tutaj sama linijka bez tej powyżej test fail, bo zamiast kropki daje przecinek
		   // ale jest wynik do 2 miejsc po przecinku!
		}
	}


