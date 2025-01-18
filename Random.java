import java.util.Scanner;
public class Random{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i=0;
		while(i<5){
			arr[i++]=sc.nextInt();
		}
		int max=arr[0];
		int j=0;
		while(j<5){
			if(arr[j]>max)
				max=arr[j];
			j++;
		}
		int min=arr[0];
		int k=0;
		 while(k<5){
                        if(arr[k]<min)
                                min=arr[k];
			k++;
                }
		System.out.println("maximum="+max);
		System.out.println("minimum="+min);

	}
}

