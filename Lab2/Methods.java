import java.util.Scanner;
import java.lang.Math;

public class Methods{
    public static void mulTest(){
        int count=0;
        int numb1,numb2,total;
        int max=9;
        int min=1;
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<5;i++){
            numb1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            numb2 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            total = numb1*numb2;
            System.out.format("How much is %d times %d?",numb1,numb2);
            int answer = sc.nextInt();
            if (answer == total){
                count++;
            }
        }
        System.out.format("%d answers out of 5 are correct\n\n",count);

    }

    public int divide(int m, int n){
        int count=0;
        while (m>=n){
            m-=n;
            count++;
        }
        return count;
    }

    public int modulus(int m, int n){
        int count=0;
        int dup = m;
        while (m>=n){
            m-=n;
            count++;
        }
        return (dup-count*n);
    }

    public int countDigits(int n){
        int count=0;
        int initial = n;
        if (n<=0){
            System.out.println("Error, please try again with a correct integer");
            return 0;
        }
        else{
            while (n>=1){
                n/=10;
                count++;
            }
        }
        System.out.format("n:%d - count=%d\n\n",initial,count);
        return count;
    }

    public int position(int n, int digit){
        int position=1; //from RHS
        while (n>0){
            if (n%10 !=digit){
                position++;
            }
            else{
                return position;
            }
            n/=10;
        }
        return -1;
    }

    public long extractOddDigits(long n){
        long temp;
        long result=0;
        long place=1;
        while (n>0){
            temp = n%10;
            if (temp%2 !=0){
                result+=temp*place;
                place*=10;
            }
            
            n/=10;
        }
        if (result!=0){
            return result;
        }
        return -1;
    }
}