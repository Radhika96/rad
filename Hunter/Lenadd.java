package hunter;

public class Lenadd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1234;int sum=0,i=1;
		String s=a+"";int r;
		int len=String.valueOf(a).length();
		while(a!=0)
		{
			r=a%10;
			a=a/10;
			sum+=r*i;
			i++;
			if(i>len)
				break;
		}
		System.out.println(sum);
	}

}
