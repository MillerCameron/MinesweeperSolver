public class gameBoard {
    private GameTile[][] tiles;
    private int rows, cols;

    public gameBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        tiles = new GameTile[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                tiles[i][j] = new GameTile(i, j, false);
    }

    public GameTile getTile(int row, int col) {
        return tiles[row][col];
    }
}