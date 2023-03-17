package Pattern_note;

public class Pattern5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern5 obj=new Pattern5();
obj.rev15_1();
	}

	private void rev15_1() {
		// TODO Auto-generated method stub
		int no=15;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(no+" ");
				no--;
			}
		
			System.out.println();
		}
	}

}
