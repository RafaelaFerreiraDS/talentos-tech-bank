package AtividadesSemana2.dia11;

public class Main {
    public static void main(String[] args) {

        Agenda a1 = new Agenda();
        Agenda a2 = new Agenda();

        a1.armazenarContato("Rafa", 1.7f, 1994);

        a1.buscarPessoa(null );

        System.out.println(a1.toString());

        a1.armazenarContato("Helo", 1.7f, 1993);

        a1.buscarPessoa("Rafa" );

        System.out.println(a1.toString());


        a1.imprimirPessoa(0);


    }
}
