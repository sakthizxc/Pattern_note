package Pattern_note;

public class Pattern8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern8 obj=new Pattern8();
obj.order();
	}

	private void order() {
		// TODO Auto-generated method stub
		for(int j=1;j<=5;j++)
		{
		for(int i=1;i<=j;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
	}

}
