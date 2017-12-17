package uni.tiles;

public class OddTile extends Tile {

    public OddTile(int value){
        super(value);
    }

    @Override
    public void setValue(int value) {
        if (value%2!=1)
            throw new IllegalArgumentException("Value should be odd");
        super.setValue(value);
    }
}
