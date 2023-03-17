package Pattern_note;

public class Pattern12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern12 obj=new Pattern12();
obj.rev_5();
	}

	private void rev_5() {
		// TODO Auto-generated method stub
		//int n=5;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			//n--;
			System.out.println();
		}
	}

}
