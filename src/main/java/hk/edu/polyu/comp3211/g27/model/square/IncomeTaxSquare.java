package hk.edu.polyu.comp3211.g27.model.square;

import hk.edu.polyu.comp3211.g27.model.Game;
import hk.edu.polyu.comp3211.g27.model.Player;

public class IncomeTaxSquare extends Square{
    private final static double RATE = 0.1;

    public IncomeTaxSquare(int index, String label) {
        super(index, label);
    }

    public static double getRATE() {
        return RATE;
    }

    /**
     * The player landing on Income Tax Square will be charged 10% of total money
     *
     * @param game The game on which to take effect
     */
    @Override
    public void effect(Game game) {

    }
}
