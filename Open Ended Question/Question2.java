package ADSLab;
import java.util.*;

class Question2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter L value: ");
        int l = sc.nextInt();
        System.out.print("Enter R value: ");
        int r = sc.nextInt();
        System.out.println();
        HashSet<Integer> set = new HashSet<>(); 
        for(int i = l; i <= r; i++)
        {
            int num = i;
            
            while(num != 0)
            {
                int x = num % 10;
                
                if(set.contains(x))
                    break;
                else
                    set.add(x);
                
                num = num / 10; 
            }
            set.clear();
            if(num == 0)
                System.out.print(i + " ");
        }
    }
}