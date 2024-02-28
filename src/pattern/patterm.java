package pattern;


/*1                                                                             1
1       2                                                               2       1
1       2       3                                               3       2       1
1       2       3       4                               4       3       2       1
1       2       3       4       5               5       4       3       2       1
1       2       3       4       5       6       5       4       3       2       1*/
import java.util.Scanner;
public class patterm
{
  public static void main (String[]args)
  {
	Scanner src = new Scanner (System.in);
	int n = 6;
	int nsp = 2 * n - 3;
	int nst = 1;
	int nst2 = 1;


	for (int i = 1; i <= n; i++)
	  {

		for (int j = 1; j <= nst; j++)
		  {
			System.out.print (j + "\t");
		  }
		for (int k = 1; k <= nsp; k++)
		  {
			System.out.print ("\t");
		  }
		for (int s = nst2; s >= 1; s--)
		  {
			if (s != n)
			  {
				System.out.print (s + "\t");
			  }
		  }
		nst++;
		nsp -= 2;
		nst2++;
		System.out.println ();
	  }
  }
}

