package hk.edu.polyu.comp3211.g27.model.square;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import hk.edu.polyu.comp3211.g27.model.Game;
import hk.edu.polyu.comp3211.g27.model.Player;

public class FreeParkingSquare extends Square{

    @JsonCreator
    public FreeParkingSquare(@JsonProperty("index") int index,
                          @JsonProperty("label") String label) {
        super(index, label);
    }

    /**
     * Free parking square has no effect on game.
     *
     * @param game The game which to take effect
     */
    @Override
    public void onEnter(Game game) {}
}
