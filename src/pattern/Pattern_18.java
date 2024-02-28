package pattern;

public class Pattern_18 {
    public  static void main(String[]args){


        int n = 7;
        int nst = n;
        int nsp = 0;
        int isp = n / 2;
        for (int i = 1; i <= n; i++)
          {
    
            for (int j = 1; j <= nsp; j++)
              {
                System.out.print ("\t");
              }
            for (int k = 1; k <= nst; k++)
              {
                if (i > 1 && i <= n / 2 && k > 1 && k > 1 && k < nst)
                  {
                    System.out.print ("\t");
                  }
                else
                  {
                    System.out.print ("*\t");
    
                  }
              }
            System.out.println ();
            if (i < n / 2 + 1)
              {
                nsp++;
                nst -= 2;
              }
            else
              {
                nsp--;
                nst += 2;
              }
    
          }
        
    }
    
}
