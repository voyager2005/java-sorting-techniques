import java.util.Scanner; 
public class selectionSort
{
    public static void main(String args[])
    {
        //declaration 
        Scanner sc = new Scanner(System.in);
        int n, smallest, indexOfSmallest, temp; 
        int[] a;
        
        //reading the number of array elements
        System.out.println("Enter the number of array elements: ");
        n = sc.nextInt();
        
        //creating an array of size n
        a = new int[n];
        
        //reading the array elements 
        System.out.println("Enter " + n + " array elements");
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        
        //selection sort techinique
        for(int i = 0 ; i < n-1 ; i++)
        {
            //initialization 
            smallest = a[i] ; 
            indexOfSmallest = i ; 
            
            for(int j = i+1 ; j < n ; j++)
            {
                if(a[j] < smallest)
                {
                    smallest = a[j]; 
                    indexOfSmallest = j ; 
                }
            }
            
            //swpping the array
            temp = a[i];
            a[i] = a[indexOfSmallest];
            a[indexOfSmallest] = temp;
        }
        
        //display statement 
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.println(a[i] + " "); 
        }
    }
}
