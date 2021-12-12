import java.util.Scanner;
public class ArrayLottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] winLotteryNumber = new int[5];
         
         winLotteryNumber[0] = 30;
         winLotteryNumber[1] =15;
         winLotteryNumber[2] = 7;
         winLotteryNumber[3] = 20;
         winLotteryNumber[4] = 5;
         // reverse value of array class exercise
         
         
         Scanner keyboard = new Scanner(System.in);
        // for(int index=0;index<5;index++);
        // {
        	// System.out.println("Please give me a number");
        	// winLotteryNumber[index]=keyboard nextInt();
        // }
         int number = 0;
         int count = 0;
         int correctCount = 0; // how many number u have correct
         int count2 = 0; // use as index to search in my array
         for(count = 0; count < 5; count++)
         {
      	   System.out.println("Please give me a number");
      	   
      	   number = keyboard.nextInt();
      	  // int count2=0;
      	   // while(count2<5)
      	  // {
      		// if(number == winLotteryNumber[count2])
       	    //	correctCount++; 
       	     //  count2++; 
      	  // }
      	   for(count2=0; count2 < 5; count2++)
      	   {
      	    if(number == winLotteryNumber[count2])
      	    	correctCount++; // increase the count of correct numbers
      	    
      	      // count2++; // we need this so we do not have infinite loop
      	   }
      	  
         }
         
         if(correctCount == 5)// >=1 for only what if we want that person win lotery even he just have one correct value instead of all 5 ? how we check that
      	   System.out.println("I am rich, do not need to learn java no more");
         else
      	   System.out.println("Try again");
         
         keyboard.close();
         
	}

}
