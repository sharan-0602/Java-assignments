package week1.day3.dailyassignments;

public class FindInterSection {

	public static void main(String[] args) {
int a[] = new int[6];
int[] b = {1,2,8,4,9,7};

a[0] = 3;
a[1] = 2;
a[2] = 11;
a[3] = 4;
a[4] = 6;
a[5] = 7;

for (int i = 0; i < a.length; i++) 
{

	//System.out.println(a[i]);
	
for (int j = 0; j < b.length; j++)
{

	if(a[i]==b[j])
	{
		System.out.println(a[i]);

	}
	
}
}




	}

}
