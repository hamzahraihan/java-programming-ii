
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        // implement the creation of a magic square with the Siamese method algorithm here
        int[][] grid = new int[size][size];
        int number = 1;
        int row = 0;
        int col = size / 2;

        while (number <= size * size) {
            if (grid[row][col] == 0) {
                grid[row][col] = number;

            }
            int nextRow = (row - 1 + size) % size; // move up (wrap around)
            int nextCol = (col + 1) % size;        // move right (wrap around)

            if (grid[nextRow][nextCol] != 0) {
                // Cell is occupied, move down instead
                row = (row + 1) % size;
            } else {
                // move up-right
                row = nextRow;
                col = nextCol;
            }
            number++;
        }

        // Transfer the values to the MagicSquare object
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                square.placeValue(c, r, grid[r][c]);
            }
        }

        return square;
    }

}
