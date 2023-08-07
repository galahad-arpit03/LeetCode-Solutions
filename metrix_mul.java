import java.util.*;

public class metrix_mul {

        public static void main(String[] args) {
                int A[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 3, 4, 5 } };
                int B[][] = { { 3, 4, 5 }, { 1, 2, 3 }, { 3, 4, 5 } };
                int C[][] = new int[3][3];

                for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < B[0].length; j++) {
                                for (int k = 0; k < C[0].length; k++) {
                                        C[i][j] += A[i][k] * B[k][j];
                                }
                        }
                }
                for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < B[0].length; j++) {
                                System.out.print(C[i][j] + " ");
                        }
                        System.out.println();
                }

        }
}
