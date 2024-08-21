import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
    int a[][] = new int[3][3], b[][] = new int[3][3], c[][] = new int[3][3], i, j;

    Scanner sc = new Scanner(System.in);

        System.out.println("enter first matrix");

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("enter value in position:["+i+"] ["+j+"]");
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter second matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("enter value in position:["+i+"] ["+j+"]");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("first matrix is didplay");

        for(i=0;i<3;i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] +"  ");
            }
            System.out.println();
        }
        System.out.println("second matrix is didplay");

        for(i=0;i<3;i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(b[i][j] +"  ");
            }
            System.out.println();
        }

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]*b[i][j];
            }
        }

        System.out.println("multiply matrix is didplay");

        for(i=0;i<3;i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(c[i][j] +"  ");
            }
            System.out.println();
        }


}

}
