package AtividadesSemana2.dia10;

public class Main {

    public static void main(String[] args) {
        System.out.println("---- inicio teste -----");

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Lambda");
            }
        };

        Runnable r2 = () -> System.out.println("Lambda2");

        r2.run();
        r1.run();
    }
}
