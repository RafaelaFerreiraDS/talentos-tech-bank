package AtividadesSemana2.dia12.universidade.Composicao.exercicio02;

public class ConversaoDeUnidadesDeArea {

    public static final double UM_METRO_QUADRADO_EM_PES_QUADRADOS = 10.76;
    public static final double UM_PE_QUADRADO_EM_CENTIMETROS_QUADRADOS = 929;
    public static final double UMA_MILHA_QUADRADA_EM_ACRES = 640;
    public static final double UM_ACRE_EM_PES_QUADRADOS = 43560;

    public static double umMetroQuadradoEmPesQuadrados(double medida) {
        return medida * UM_METRO_QUADRADO_EM_PES_QUADRADOS;
    }

    public static double umPeQuadradoEmCentimetrosQuadrados(double medida) {
        return medida * UM_PE_QUADRADO_EM_CENTIMETROS_QUADRADOS;
    }

    public static double umaMilhaQuadradaEmAcres(double medida) {
        return medida * UMA_MILHA_QUADRADA_EM_ACRES;
    }

    public static double umAcreEmPesQuadrados(double medida) {
        return medida * UM_ACRE_EM_PES_QUADRADOS;
    }
}
