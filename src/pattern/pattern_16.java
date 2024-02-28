package pattern;
public class pattern_16

//                 *
//                 *       *
// *       *       *       *       *
//                 *       *
//                 *

{
  public static void main (String[]args)
  {
	int n = 5;
    int nst = 1;
    int nsp = n/2;

    for(int i = 1; i<=n; i++){
    
        for(int j = 1; j<=nsp; j++){
            if (i==n/2) {
                System.out.print("*\t");

            } else {
                System.out.print("\t");

            }
        }
        for(int k =1; k<=nst; k++){
            System.out.print("*\t");
        }
if (i<=n/2) {
    nst++;
}else{
    nst--;
}
        System.out.println();
    }


	
  }
}