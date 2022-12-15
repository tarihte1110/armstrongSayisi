import java.util.Scanner;
public class armstrongSayisi {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        int number= input.nextInt();
        int basNumber=0,tempNumber=number;
        int basValue;
        int result=0;
        int basPow;

        while(tempNumber!=0){
            tempNumber/=10;
            basNumber++;
        }
        tempNumber=number;

        while(tempNumber!=0){
            basValue=tempNumber%10;
            basPow=1;
            for(int i=1;i<=basNumber;i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;
        }
        System.out.println("SONUÇ:"+result);

        if(number==result){
            System.out.println(number+" bir armstrong sayıdır.");
        }
        else{
            System.out.println(number+" bir armstrong sayı değildir.");
        }
    }
}
