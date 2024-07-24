package paint.commands;

import java.awt.*;

public class LineCommand implements Command{
    int k;
    int l;
    int m;
    int n;

    Graphics g;


    public  LineCommand(Graphics g, int k, int l, int m, int n){
        this.g = g;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    @Override
    public void execute() {
        g.drawLine(k, l, m, n);
    }
}
