package Pattern_note;

public class Pattern10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern10 obj=new Pattern10();
obj.print_starNum();
	}

	private void print_starNum() {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
