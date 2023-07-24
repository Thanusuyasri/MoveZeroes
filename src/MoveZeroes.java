import java.util.Scanner;

public class MoveZeroes {
    public static int[] move(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==0)
            {
                for(int j=i;j< arr.length-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=0;
                if(arr[i]==0  && i+1< arr.length)
                {
                    if(arr[i+1]!=0)
                    {
                        i-=1;
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i< size;i++)
        {
            arr[i]= scanner.nextInt();
        }
        arr=move(arr);
        for(int i=0;i< size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
