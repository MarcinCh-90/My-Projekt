package coderslab.dzien2.metody;

public class Person {
    private String name = " Marcin ";
    private String surname = " Chodecki ";
    private int age = 31;
    private char gender = 'm';

    public void setName (String name) {
        this.name =name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public void setgender (char gender) {
        this.gender = gender;
    }
    public String getfullName(){
       // String fullName = this.name + " " + this.surname;
        return this.name + " " + this.surname;
    }
    public void increaseAge() {

        this.age += 1;
    }
}
