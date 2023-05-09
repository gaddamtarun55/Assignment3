import java.util.Scanner;
public class printPrimes {
	public static int isPrime(int n)
	{

    int flag=1;
     for(int i=2;i<=n/2;i++) {
    	 if(n%i==0) {
    		 flag=0;
    		 break;
    		 
    	 }
    	 
     }
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(isPrime(i)==1)
			System.out.println(i+" ");
		}
		

	}
}


