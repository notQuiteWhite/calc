package uni;

import uni.tiles.OddTile;
import uni.tiles.Tile;

public class Table {

    private static int[][] tilesTypes =    {{0, 0, 1, 0, 0},
                                            {0, 1, 1, 1, 0},
                                            {1, 1, 1, 1, 1},
                                            {0, 1, 1, 1, 0},
                                            {0, 0, 1, 0, 0}};

    private Tile[][] tiles = new Tile[5][5];
    private Tile[] halfs = new Tile[8];

    public Table(){
        for(int i=0;i<5;i++)
            for(int j = 0;j<5;j++)
                tiles[i][j] = tilesTypes[i][j] == 0 ? new Tile(1) : new OddTile(1);
        halfs[0] = tiles[0][1];
        halfs[1] = tiles[1][0];
        halfs[2] = tiles[0][3];
        halfs[3] = tiles[1][4];
        halfs[4] = tiles[3][0];
        halfs[5] = tiles[4][1];
        halfs[6] = tiles[3][4];
        halfs[7] = tiles[4][3];
    }

    public void fill(int sum){
        if(sum<5 && sum%2!=1)
            throw new IllegalArgumentException("Sum value should be odd integer higher than 4");
        int value = (sum-1)/2-1;
        for(Tile tile: halfs)
            tile.setValue(value);
        tiles[2][2].setValue(sum-4);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(Tile[] row : tiles){
            for(Tile tile: row) {
                str.append(tile).append(" ");
                if(tile.getValue()<10)
                    str.append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
