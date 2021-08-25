package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 24;
        d1.mes = 8;
        d1.ano = 2021;

        Data d2 = new Data();
        d2.dia = 2;
        d2.mes = 9;
        d2.ano = 1999;

        System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
        System.out.printf("\n%d/%d/%d", d2.dia, d2.mes, d2.ano);

    }
}
