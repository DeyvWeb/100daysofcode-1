import java.util.Scanner;

public class App {
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
        
        System.out.println("Original Elements are : /n");
        for(int i = 0; i <n; i++)
        {
            System.out.print(elt[i] + "   ");
        }

        System.out.println("Reversed Elements are: ");
        for(int i = n-1; i >=0; i--)
        {
            System.out.print(elt[i] + " ");
        }
        
    }
}
