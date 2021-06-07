package pt.ipbeja.estig.po2.boulderdash.model;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @author Tomás Jorge
 * @version 15/05/2021
 * @number 20436
 */

public abstract class AbstractPosition {

    private int line, col;

    public AbstractPosition(int line, int col) {
        this.line = line;
        this.col = col;
    }
}

