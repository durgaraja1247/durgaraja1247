package Assingmentjambav;

public class Arraypgm {
	void pgm()
	{
		int[] ar= {1,2,3,4,5,6};
		int k=5,count=0;
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if((ar[i]+ar[j])%k==0)
				{
					count++;
					System.out.println(ar[i]+" "+ar[j] );
				}
			}
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Arraypgm ap=new Arraypgm ();
		ap.pgm();

	}

}
