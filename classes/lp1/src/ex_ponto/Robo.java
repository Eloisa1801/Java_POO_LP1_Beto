package ex_ponto;

public class Robo {
    XeY_ponto position;
    char direction;

    public Robo(double x, double y) {
        this.position = new XeY_ponto(x,y);
        this.direction = 'N';
    }

    public void move(char dir, int qtoMove) {}

    public void top(int pos){}

    public void down(int pos){}

    public void left(int pos){}

    public void right(int pos){}


    

}
