package ADSLab;
import java.util.*;

class Question1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter testcases: ");
        int testcases = sc.nextInt();
        System.out.println("\n");
        while(testcases-- > 0)
        {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            System.out.println();            
            int arr[] = new int[n];
            System.out.print("Enter array values: ");
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println();
            //Arrays.sort(arr);
            MergeSort m = new MergeSort();
            m.sort(arr, 0, n-3);
            System.out.print("Required Solution: ");
            for(int i = 0; i < n - 2; i++)
                System.out.print(arr[i] + " ");
            System.out.println("\n\n");
        }
    }
}

class MergeSort
{
    void sort(int a[],int p,int r)
    {
        if(p<r)
        {
            int q=(p+r)/2;
            sort(a,p,q);
            sort(a,q+1,r);
            merge(a,p,q,r);
        }
    }
    
    void merge(int a[],int p,int q,int r)
    {
        int n1=q-p+1;
        int n2=r-q;
        int left[]=new int[n1+1];
        int right[]=new int[n2+1];
        int i;
        for(i=0;i<n1;i++)
            left[i]=a[p+i];
        left[i]=9999;
        for(i=0;i<n2;i++)
            right[i]=a[q+1+i];
        right[i]=9999;
        i=0;
        int j=0;
        for(int k=p;k<=r;k++)
        {
            if(left[i]<=right[j])
            {
                a[k]=left[i];
                i=i+1;
            }
            else
            {
                a[k]=right[j];
                j=j+1;
            }
        }
    }
}
