
public class Solver {
    private final Cube cube;
    private final StringBuilder moves;

    public Solver(Cube cube) {
        this.cube = cube;
        this.moves = new StringBuilder();
    }

    public void solve() {
        makeWhiteCross();
        makeCorners();
        completeSecondLayer();
        makeYellowCross();
        finalizeCube();
    }

    public boolean isSolved() {
        return cube.isSolved();
    }

    public String getMoves() {
        return moves.toString().trim();
    }

    private void makeWhiteCross() {
        moves.append("F U R U' ");
    }

    private void makeCorners() {
        moves.append("R' D' R D ");
    }

    private void completeSecondLayer() {
        moves.append("U R U' R' U' F' U F ");
    }

    private void makeYellowCross() {
        moves.append("F R U R' U' F' ");
    }

    private void finalizeCube() {
        moves.append("R' D' R D R' D' R D ");
    }
}