public class Test1 {
    public static void main(String[] args)  {
        /*int year=2020;
        int mouth=6;
        int sum=0;
        int day=17;
        switch (mouth-1){
            case 11:sum+=31;
            case 10:sum+=31;
            case 9:sum+=30;
            case 8:sum+=31;
            case 7:sum+=31;
            case 6:sum+=30;
            case 5:sum+=31;
            case 4:sum+=30;
            case 3:sum+=31;
            case 2:if((year%4==0)&&(year%100!=0)||year%400==0){
                         sum+=29;
                   }else{
                          sum+=28;
                    }
            case 1:sum+=31;
        }
        System.out.println(sum+day);*/
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
        for(int i=1;i<7;i++){
            for(int j=1;j<7-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
/*            for(int k=0;k<=i;k++){
                System.out.print("*");
            }*/
            System.out.println();
        }
        int i=2,sum=0;
        while (i<=100){
            if(isSu(i)){
                System.out.println(i);
                sum+=i;
            }
            i++;
        }
        System.out.println("100以内素数和为"+sum);

    }
    public  static boolean isSu(int a){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }else{
                continue;
            }
        }
        return true;
    }
}
