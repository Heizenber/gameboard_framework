package gsf.board;

import java.util.ArrayList;
import java.util.List;
import gsf.unit.Unit;

public class Board {
    private int width, height;
    private List<ArrayList<ArrayList<Tile>>> tiles;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        initialize();
    }

    private void initialize() {
        tiles = new ArrayList<ArrayList<ArrayList<Tile>>>(width);
        for (int i = 0; i < width; i++) {
            tiles.add(i, new ArrayList<ArrayList<Tile>>(height));
            for (int j = 0; j < height; j++) {
                ((ArrayList) tiles.get(i)).add(j, new Tile());
            }
        }
    }

    public Tile getTile(int x, int y) {
        return (Tile) ((ArrayList) tiles.get(x - 1)).get(y - 1);
    }

    public void addUnit(Unit unit, int x, int y) {
        Tile tile = getTile(x, y);
        tile.addUnit(unit);
    }


    public void removeUnit(Unit unit, int x, int y) {
        Tile tile = getTile(x, y);
        tile.removeUnit(unit);
    }

    public void removeUnits(int x, int y) {
        Tile tile = getTile(x, y);
        tile.removeUnits();
    }

    public List getUnits(int x, int y) {
        Tile tile = getTile(x, y);
        return tile.getUnits();
    }

}
