public class Cube {
    char[][] U = new char[3][3]; 
    char[][] D = new char[3][3]; 
    char[][] F = new char[3][3]; 
    char[][] B = new char[3][3]; 
    char[][] L = new char[3][3]; 
    char[][] R = new char[3][3]; 

    public Cube() {
        fill(U, 'W');
        fill(D, 'Y');
        fill(F, 'R');
        fill(B, 'O');
        fill(L, 'B');
        fill(R, 'G');
    }

    private void fill(char[][] face, char c) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                face[i][j] = c;
    }

    public void rotateR() {
        
        char temp = U[0][2];
        for (int i = 0; i < 3; i++) {
            U[0][2 - i] = L[i][2];
            L[i][2] = D[2][i];
            D[2][i] = R[i][0];
            R[i][0] = temp;
            temp = U[i][2];
        }
        U[0][2] = temp;
    }

    public void printCube() {
        printFace("White", U);
        printFace("Red", F);
        printFace("Blue", L);
        printFace("Orange", B);
        printFace("Green", R);
        printFace("Yellow", D);
    }

    private void printFace(String name, char[][] face) {
        System.out.println("[" + name + " Face]");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(face[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isSolved() {
        return check(U) && check(D) && check(F) && check(B) && check(L) && check(R);
    }

    private boolean check(char[][] face) {
        char color = face[0][0];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (face[i][j] != color)
                    return false;
        return true;
    }
}