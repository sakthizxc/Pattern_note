package Pattern_note;

public class Pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern3 obj=new Pattern3();
obj.mul_num();
	}

	private void mul_num() {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j*i+" ");
			}
			System.out.println();
		}
	}

}
