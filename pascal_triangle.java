import java.io.*;
public class pascal_triangle {
    // Print Pascal's Triangle in Java
        public int factorial(int i)
        {
            if (i == 0)
                return 1;
            return i * factorial(i - 1);
        }
        public static void main(String[] args)
        {
            int n = 4, i, j;
            pascal_triangle g = new pascal_triangle();
            for (i = 0; i <= n; i++) {
                for (j = 0; j <= n - i; j++) {

                    // for left spacing
                    System.out.print(" ");
                }
                for (j = 0; j <= i; j++) {

                    // nCr formula
                    System.out.print(
                            " "
                                    + g.factorial(i)
                                    / (g.factorial(i - j)
                                    * g.factorial(j)));
                }

                // for newline
                System.out.println();
            }
        }
    }



