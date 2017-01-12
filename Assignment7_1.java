package Assignment7_1;
import java.util.IllegalFormatException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Assignment7_1 {
	 public static void main(String args[])throws IOException{
		 int mainInt;
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 try{	
		 System.out.println("Enter the Integer number:-");
		 	mainInt=Integer.parseInt(br.readLine());

          

		         // use Integer.toString() with and without radix

		         String string3 = Integer.toString(mainInt);

		         String string4 = Integer.toString(mainInt, 16);

		         System.out.println("With toString method: string3(10 base system) = " + string3 +

		                             ", string4(16 base system) = " +string4);

		          

		         // String.valueOf() method

		         String string5 = String.valueOf(mainInt);

		         System.out.println("With valueOf method: string5 = " + string5);

		          

		         try{

		             // use format() method

		             String string6 = String.format("%d", mainInt);

		             System.out.println("With format method: string6 = " + string6);

		          

		         } catch(IllegalFormatException e1) {

		             System.err.println("IllegalFormatException: "+ e1.getMessage());

		         } catch(NullPointerException e2) {

		             System.err.println("NullPointerException: "+ e2.getMessage());

		         }

		          

		         // StringBuilder instance

		         StringBuilder sb = new StringBuilder();

		         sb.append(mainInt);

		         String string7 = sb.toString();

		          

		         System.out.println("With StringBuilder class: string7 = " + string7);
		 }
		 catch(Exception e)
		 {System.out.println("wrong Entry"+"\n"+"Try Again....");
		 }

		          

		     }

}
