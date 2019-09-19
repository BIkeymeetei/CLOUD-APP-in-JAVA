
public class SWAP {
static void swap1(int a,int b)
{
	int c;
	c=a;a=b;b=c;
	System.out.println("using the third variable "+a+" "+b);
}
static void swap2(int a, int b)
{
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.print("using the third variable "+a+" "+b);
}
	public static void main(String[] args) {
int a,b;
a=20;
b=30;
swap1(a,b);
swap2(a,b);
	}
}