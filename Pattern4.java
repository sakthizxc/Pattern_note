package Pattern_note;

public class Pattern4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern4 obj=new Pattern4();
obj.print1_15();
	}

	private void print1_15() {
		// TODO Auto-generated method stub
		int no=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(no+" ");
				no++;
			}
		
			System.out.println();
		}
	}
}

