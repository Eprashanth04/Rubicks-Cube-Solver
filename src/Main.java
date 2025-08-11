
public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        Solver solver = new Solver(cube);

        System.out.println("Initial Cube:");
        cube.printCube();

        solver.solve();

        System.out.println("Final Cube:");
        cube.printCube();

        System.out.println("Moves Used: " + solver.getMoves());
        System.out.println("Is Solved? " + solver.isSolved());
    }
}