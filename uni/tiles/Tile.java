package uni.tiles;

public class Tile {

    private int value;

    public Tile(int value){
        setValue(value);
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
