import java.math.BigInteger;
import java.util.*;

class TestClass {
	public static 
	HashMap<Integer, BigInteger> map
	=new HashMap<Integer, BigInteger>();
	public static BigInteger mod=new BigInteger("1000000009");
	public static BigInteger ten=new BigInteger("10");
	public static BigInteger ninenine=new BigInteger("99");
	public static BigInteger T(int n)
	{
		BigInteger pair[]={ten, ninenine},res=null;
		if (n==1) return pair[0];
		if (n==2) return pair[1];
		for(int i=2; i<n; i++)
		{
			res=pair[1].multiply(ten).subtract(pair[0]);
			pair[0]=pair[1];
			pair[1]=res;
		}
		return pair[1].mod(mod);
	}
	
	public static BigInteger unlucky13(int num)
	{
		BigInteger Tn_1=null, Tn_2=null;
		if (num==1) return ten;
		if (num==2) return ninenine;
		if (map.containsKey(num-1))Tn_1=map.get(num-1);
		else map.put(num-1, T(num-1));Tn_1=map.get(num-1);
		if (map.containsKey(num-2))Tn_2=map.get(num-2);
		else map.put(num-2, T(num-2));Tn_2=map.get(num-2);
		return Tn_1.multiply(ten).subtract(Tn_2).mod(mod);
	}

    public static void main(String args[] ) throws Exception     {
        int n,tests;
        Scanner sc;
        sc=new Scanner(System.in);
        tests=sc.nextInt();
        for(int test=0; test<tests; test++)
        {
            n=sc.nextInt();
            System.out.println(unlucky13(n));
        }
        sc.close();
    }
}