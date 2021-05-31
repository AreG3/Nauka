public class Live {

    public static void main(String[] args) {

       String s = "text";
       int i = 100;

       Person person = new Person("Arkadiusz", "Szymanek", 22);

        System.out.println(person);

        System.out.println("Oto wiek: " + person.getAge());

        System.out.println("Oto imie: " + person.getName());

        System.out.println("Oto nazwisko: " + person.getLastName());

    }

}
