package Pattern_note;

public class Pattern11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern11 obj=new Pattern11();
obj.print();
	}

	private void print() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k<=5;k++)
			{
				System.out.print(k+" ");
			}
			n--;
			System.out.println();
		}
	}

}
