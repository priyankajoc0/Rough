import java.util.Arrays;

public class ShiftAllZeroToStart {

	public static void main(String[] args) 
	{
		int a[] = {1,5,0,4,9,0,0,3,7,0,80,6};
		//shift all 0 to left
		
		int pos = a.length - 1;

        for (int i = a.length - 1; i >= 0; i--) 
        {
            if (a[i] != 0) 
            {
                a[pos--] = a[i];
            }
        }

        for(int i =pos ; i>=0;i--) 
        {
            a[i] = 0;
        }
        
		System.out.println(Arrays.toString(a));
		
		
	}

}
