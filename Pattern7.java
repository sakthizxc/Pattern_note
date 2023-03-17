package Pattern_note;

public class Pattern7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern7 obj=new Pattern7();
obj.rev();
	}
	private void rev() {
		// TODO Auto-generated method stub
		//int n=5;
		for(int i=1;i<=5;i++)
		{
		
			for(int j=5;j>=i;j--)
				{
				System.out.print(j+" ");
				
				}
		
			System.out.println();
			//n--;
				}
	}
	

}
