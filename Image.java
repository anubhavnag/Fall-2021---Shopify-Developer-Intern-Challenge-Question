/*So we would import a file of images sorted in a array ,the user just have to tell the serial no of the image and we would be able
to find the image on the basis of that. */


public class Image {
	
	
	
	public static void search(int a,int arr1[])
	{  int arr[]=arr1;
	
	  for(int i=0;i<arr.length;i++)
	  {  if(a==arr[i])
	     {   
		     System.out.println("Image found");
		     
		     break;
	     }
	  else
	  {
		  continue;
	  }
		  
	  }
	
		
	}
	
	
	

	
}
