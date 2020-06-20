public class day04 {
    public static void main(String[] args) {
        char[] ch=generate();
        System.out.println(ch);
        char[] input={'L','B','W','N','P'};
        int res[]=check(input,ch);
        System.out.println("位置对了"+res[0]+"字母相同"+res[1]);
    }

    private static int[] check(char[] input, char[] ch) {
        int result[]=new int[2];
        for(int i=0;i<input.length;i++){
            for(int j=0;j<ch.length;j++){
                if(input[i]==ch[j]){
                    result[1]++;
                    if(i==j){
                        result[0]++;
                    }
                    break;
                }
            }
        }
        return result;
    }


    private static char[] generate() {
        char ch[]=new char[5];
        char [] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M'
                ,'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        boolean []flags=new boolean[letters.length];
        int index=0;
        for(int i=0;i<ch.length;i++){
            do {
                 index=(int)(Math.random()*letters.length);

            }while(flags[index]);
            ch[i]=letters[index];
            flags[index]=true;
        }
        return ch;
    }
}
