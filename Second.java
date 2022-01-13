import java.util.Scanner;

public class Second {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("Number of elements you want?");
        int n = sc.nextInt();
        int [] elt = new int[n];

        for(int i =0; i<n; i++)
        {
            System.out.println("Enter array element " + (i+1));
            elt[i] = sc.nextInt();
        }
        
        System.out.println("Original Elements are :");

        
        for(int i = 0; i <n; i++)
        {
            System.out.print(elt[i] + "   ");
           
            int max = elt[0];
            for(i=1; i< elt.length; i++)
            {
                if(max < elt[i])
                {
                    max = elt[i];                
                }
            }
            System.out.println("Maximum element is " + max);

        }
       
        
    }
}
