package pt.ipbeja.estig.po2.boulderdash;

/**
 * @author Tomás Jorge
 * @number 20436
 * @version 12/05/2021
 * -------------------
 *
 */

public class Rockford {

    private static Rockford instace = null;
    private static int line, col;

    protected Rockford(int line, int col) {
        this.line = line;
        this.col = col;
    }

    public static Rockford getInstance() {
        if(instace == null) {
            instace = new Rockford(line, col);
        }
        return instace;
    }
}
