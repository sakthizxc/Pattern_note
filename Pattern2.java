package Pattern_note;

public class Pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern2 obj=new Pattern2();
obj.print_5();
	}

	private void print_5() {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}


}
