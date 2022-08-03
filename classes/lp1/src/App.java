import ex_ponto.XeY_ponto;

public class App {
    public static void main(String[] args) throws Exception{
        XeY_ponto p1 = new XeY_ponto(2,7);
        XeY_ponto p2 = new XeY_ponto(-2,3);


        double result = p1.distance(p1, p2);
    }

   
}
