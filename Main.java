public class Main {

    public static void main(String[] args) {

        Pet p1 = new Pet("Snezok",10,62,true,"Cat");

        System.out.println( p1.toString());

        Turtle t1 = new Turtle("Jorik",5,10,true,"Turtle","big");

        System.out.println( t1.toString());

        Parrot p2 =new Parrot("Kesha",7,8,true,"Parrot",true);

        System.out.println( p2.toString());

        Cat c1 = new Cat("Farik",6,4,true,"Cat",2);

        System.out.println( c1.toString());

        Dog d1 = new Dog("Bobik",3,9,true,"Dog","small");

        System.out.println( d1.toString());


        Pet.writeFile();

    }}