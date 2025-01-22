class secondmax{
   	public static void main(String[] args) {
		int arr[]={5,5,10,6,8,8,9};
		int largest=arr[0];
		int secondlargest=arr[0];
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>largest){
		        
		        secondlargest=largest;
		  largest=arr[i];
		  }if(arr[i]>secondlargest && largest!=arr[i]){
		      secondlargest=arr[i];
		  }
		}
		System.out.println(secondlargest);
	}
}
