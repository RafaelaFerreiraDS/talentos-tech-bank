package AtividadesSemana2.dia12.exercicio02;

public class Main {

    public static void main(String[] args) {

        System.out.println("------ Acre em pes quadrados ------");
        System.out.println(ConversaoDeUnidadesDeArea.umAcreEmPesQuadrados(2));
        System.out.println(ConversaoDeUnidadesDeArea.umAcreEmPesQuadrados(0.5));

        System.out.println("------ Milha quadrada em acres ------");
        System.out.println(ConversaoDeUnidadesDeArea.umaMilhaQuadradaEmAcres(2));
        System.out.println(ConversaoDeUnidadesDeArea.umaMilhaQuadradaEmAcres(0.5));

        System.out.println("------ Metro quadrado em pes ------");
        System.out.println(ConversaoDeUnidadesDeArea.umMetroQuadradoEmPesQuadrados(2));
        System.out.println(ConversaoDeUnidadesDeArea.umMetroQuadradoEmPesQuadrados(0.5));

        System.out.println("------ Pe em centimetros ------");
        System.out.println(ConversaoDeUnidadesDeArea.umPeQuadradoEmCentimetrosQuadrados(2));
        System.out.println(ConversaoDeUnidadesDeArea.umPeQuadradoEmCentimetrosQuadrados(0.5));


    }
}
