import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[8];
        for(int i=0;i<8;i++){
            a[i]=sc.nextInt();
        }
        int odd=0,even=0;//奇数 偶数
        for(int i=0;i<8;i++){
            if(a[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        int count1=0,count2=0;
        int e[]=new int[even];//偶数
        int o[]=new int[odd];//奇数
        for(int i=0;i<8;i++){
            if(a[i]%2==0){
                e[count1++]=a[i];
            }else{
                o[count2++]=a[i];
            }
        }
       int b[]=print(e,o);
        for(int i=0;i<8;i++){
            System.out.println(b[i]+"");
        }
    }

    private static int[] print(int[] e, int[] o) {
        int count1=0;
        int   count2=0;
        int even=e.length;
        int odd=o.length;
        int b[]=new int[8];
        if(even>odd){
            for(int i=0;i<2*odd;i++){
                if(i%2==0){
                    b[i]=e[count1++];
                }else{
                    b[i]=o[count2++];
                }
            }
            for(int i=odd*2;i<b.length;i++){
                b[i]=e[count1++];
            }
        }else{
            for(int i=0;i<2*even;i++){
                if(i%2==0){
                    b[i]=e[count1++];
                }else{
                    b[i]=o[count2++];
                }
            }
            for(int i=even*2;i<b.length;i++){
                b[i]=o[count1++];
            }
        }
        return b;
    }
}
