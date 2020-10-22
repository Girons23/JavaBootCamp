package sef.module8.activity;

public class TryCatchFinallyActivity {
public static void main(String[] args) {
	TryCatchFinallyActivity obj=new TryCatchFinallyActivity();
	obj.catchMeIfYouCan();
}

void catchMeIfYouCan()
{
	int [] arr={0,1,2,3,4,5,6,7,8,9};
	try {
	for(int i=0;i<=10;i++)
	{
		System.out.println(arr[i]);
	}
	}
	catch (ArrayIndexOutOfBoundsException e) {
		
		System.out.println("Exception has occured");
	}
	finally{
		
	
	System.out.println("This should get printed even if there is an exception");
	}
}

}