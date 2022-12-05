import java.util.*;
public class matrix {
    public static void main(String[] args){
        int row,col;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        col=sc.nextInt();
        int a[][]=new int [row][col];
        Scanner scc= new Scanner(System.in);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            a[i][j]=scc.nextInt();
            }
        }
        //Diagonal Elements of Matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    System.out.print(a[i][j]);
                }
            }
        }
        //Upper Triangular
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i<j){
                    System.out.print(a[i][j]);
                }
            }
        }
        //Lower Triangular
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i>j){
                    System.out.print(a[i][j]);
                }
            }
        }
    }
}
