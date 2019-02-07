
package merge.sorting;
import java.util.Scanner;
/**
 *
 * @author Roger Wei
 */
public class MergeSorting {
    
    private final Scanner sc = new Scanner(System.in);
    
    private int n = 0;
        
    private int[] input(){
        System.out.print("n=");
       n = sc.nextInt();
     int[] a = new int[n];
       System.out.println("input sequence:");
       for (int i=0;i<n;i++){
          a[i]=sc.nextInt();
         }
       return a;
    }
    
    private void display(int[] a){
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
                
    }
    
    private int[] merging(int b,int e,int[] a){
        if (b>=e) return a;
        int i=b;
        int j=(e+b)/2+1;
        int[] m = new int[e-b+1];
        for (int k=0;k<e-b+1;k++){
            if (i>(e+b)/2) {
                m[k]=a[j];
                j++;
            }else{
                if (j>e) {
                    m[k]=a[i];
                    i++;
                }else{
                    int Mx=Math.max(a[i], a[j]);
                    m[k]=Mx;
                    if (a[i]==Mx) {
                        i++;
                    } else{
                        j++;} 
                }
            }
        }
        for (i=0;i<(e-b+1);i++){
            a[b+i]=m[i];
        }
        return a;
    }
    
    private int[] MergeSort(int b,int e,int[] a){
        if (b<e) {
            a=MergeSort(b,(e+b)/2,a);
            a=MergeSort((e+b)/2+1,e,a);
        }
        return merging(b,e,a);
    }
    
    public static void main(String[] args) {
      MergeSorting M = new MergeSorting();
      int[] a = M.input();
      M.display(M.MergeSort(0,M.n-1,a));
    }
    
}
