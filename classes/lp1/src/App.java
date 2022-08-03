import ex_ponto.XeY_ponto;

public class App {
    public static void main(String[] args) throws Exception{
        XeY_ponto p1 = new XeY_ponto(3,5);
        XeY_ponto p2 = new XeY_ponto(6,1);


        double result = p1.distance(p1, p2);
    }

   
}
