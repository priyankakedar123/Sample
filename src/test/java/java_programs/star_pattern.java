package java_programs;

public class star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int space =n-1;space>=i;space++ )
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
