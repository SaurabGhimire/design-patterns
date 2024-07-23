package paint.commands;


import java.awt.*;

public class CircleCommand implements Command{
    int k;
    int l;
    int m;
    int n;

    Graphics g;


    public  CircleCommand(Graphics g, int k, int l, int m, int n){
        this.g = g;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    @Override
    public void execute() {
        g.fillOval(k, l, m, n);
    }

}
