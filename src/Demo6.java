import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        //求最小公倍数
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("最小公倍数"+Gonebishu(a,b));
        System.out.println("最大公约数"+Gongyueshu(a,b));

    }

    public static int Gonebishu(int a,int b){
        int max;
        if (a>b)
            max=a;
        else
            max=b;
        for (int x=max;;x++)
        {
            if (x%a==0&&x%b==0)
                return x;
        }
    }

    public static int Gongyueshu(int a,int b){
        int k=0;
        int min;
        if(a>b)
            min=b;
        else
            min=a;
        for (int x=min;x>0;x--)
        {
            if (a%x==0&&b%x==0)

                return x;
        }
            return 0;
    }
}


