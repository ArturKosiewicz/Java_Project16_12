package test;

public class Main {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.a = 3;
        System.out.println(exampleClass.a);

        ExampleClass.change(exampleClass);
        System.out.println(exampleClass.a);

        int a = 5;
        System.out.println(a);
        ExampleClass.change(a);
        System.out.println(a);

        Reaktor r = new Reaktor() {         // klasa anonimowa suka bliac!
            @Override
            public void zareaguj() {
                System.out.println("Reaguj!!!");
            }
        };

        Reaktor r2 = new Reaktor() {         // klasa anonimowa suka bliac!
            @Override
            public void zareaguj() {
                System.out.println("Reaguj 2 !!!");
            }
        };

        Reaktor r3 = new Reaktor() {         // klasa anonimowa suka bliac!
            @Override
            public void zareaguj() {
                System.out.println("Reaguj 2 !!!");
            }
        };

        ExampleClass.B b = new ExampleClass.B();    // klasy wewnetrzne - statyczne

        ExampleClass exc = new ExampleClass();      // klasy wewnetrzne  - nie statyczne
        ExampleClass.C c = exc.new C();

        TShirt tShirt = new TShirt();
        tShirt.brand = "Nike";
        tShirt.size = TShirt.Size.M;        // konstruktor enmu'a ???

        System.out.println(tShirt.size.height);

        tShirt.size.printInfo();

    }
}