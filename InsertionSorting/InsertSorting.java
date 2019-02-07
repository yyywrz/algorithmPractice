package insertsorting;
import java.util.Scanner;
/**
 *
 * @author Roger Wei
 */
public class InsertSorting {
    
    private final Scanner sc = new Scanner(System.in);
    
    private int n = 0;
    
    private int[] ISort(){
        System.out.print("input size n=");
        n = sc.nextInt();
        System.out.println("input sequence:");
        int[] a = new int[n];
        a[0]=sc.nextInt();
        for (int i=1;i<n;i++){
            int temp =sc.nextInt();
            a[i] = temp;
            for(int j=i-1;j>-1;j--){
            if (temp>a[j]) {
                a[j+1] = a[j];
                a[j] = temp;
            }else{
                break;
            }
        }
        }
     return a;
    }
    
    private void display(int[] a){
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
                
    }    
    
    public static void main(String[] args) {
        InsertSorting A = new InsertSorting();
        A.display(A.ISort());
    }
    
}
