import java.io.*;
import java.util.Scanner;

public class FileRW {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream("test.txt",true);
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);
        System.out.println("请输入自己需要存储的数据");
        String str=sc.nextLine();
        bw.write(str);
        bw.flush();
        bw.close();
        FileInputStream fis=new FileInputStream("test.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        int len =0;
        FileOutputStream fos1=new FileOutputStream("test1.txt",true);
        OutputStreamWriter osw1=new OutputStreamWriter(fos1);
        BufferedWriter bw1=new BufferedWriter(osw1);
        char [] ch=new char[100];
        //System.out.println(br.readLine());
        while((len=br.read(ch))!=-1){
                bw1.write(ch);
        }
        bw1.flush();



    }
}
