package coderslab.dzien1.atrybuty;


public class Main03 {
    public static void main(String[] args) {


        Person person = new Person();

      /*  public String name = " Marcin ";
        public String surname = " Chodecki ";
        public int age = 31;*/

        Person name = new Person();
        person.name = "Marcin";
        person.surname = "Chodecki";
        person.age =  31 ;
        person.gender= 'm';

        System.out.println(person.name);
    }
}
