/*Que - Ankita is studying N subjects in current semester. All subjects have different number of Class Test(CT).
She wants to know the total of first and last CT in each subject. Save the result of N subjects in an array of N space.
Write a java program to help her using jagged array concept.

Sample Input 1:
3   //N subjects
4   //CT count in subject 1
3   //CT count in subject 2
4   //CT count in subject 3
1   //values of CT in subject 1
2
3
4
1   //values of CT in subject 2
2
3
1   //values of CT in subject 3
2
3
4
Sample Output 1:
5
4
5
*/





package jagged.array.test;
import java.util.Scanner;
public class JaggedArrayTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int [n][];
        int j;
        for(int i=0;i<n;i++)
        {
          int q = sc.nextInt();
          a[i] = new int[q];
        }
        for(int i=0;i<n;i++)
        {
          for(j=0;j<a[i].length;j++)
          {
            a[i][j] = sc.nextInt();
          }
        }
        int[] a1;
        a1 = new int[n];
        for(int i=0;i<n;i++)
        {
          a1[i]=a[i][0]+a[i][a[i].length-1];
        }
        for(int i=0;i<a.length;i++)	//a is input array
		{
		    System.out.print(a1[i]+" ");	//a1 is output array
		}
		System.out.println();
	}
}
