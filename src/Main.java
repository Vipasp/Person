public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();      // вызов первого конструктора без параметров
        person1.move();


        Person person2 = new Person("Игорь",30); // вызов второго конструктора с двумя параметрами
        person2.talk();
    }
}
class Person{

    String fullName;    // имя
    int age;        // возраст
    Person()
    {
        fullName = "Неивестный"; //если без параметров
        age = 20;
    }

    Person(String n, int a)
    {
        fullName = n;
        age = a;
    }

    void move(){
        System.out.println(fullName + " говорит: мне " + age + " лет");
    }
    void talk(){
        System.out.println(fullName + " говорит: мне " + age + " лет");
    }
}

