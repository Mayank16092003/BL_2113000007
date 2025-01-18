epublic class Even{
	public static void main(String [] args){
		System.out.print("even numbers are ");
		for(int i=1;i<=10;i++){
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println(" ");
		System.out.print("odd numbers are ");
		for(int i=1;i<=10;i++){
                        if(i%2!=0)
                                System.out.print(i+" ");
                }
	}
}
