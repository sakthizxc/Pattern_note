package Pattern_note;

public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern1 obj=new Pattern1();
obj.print1_5();
	}

	private void print1_5() {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
