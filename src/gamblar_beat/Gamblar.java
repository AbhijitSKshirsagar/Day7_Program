package gamblar_beat;

public class Gamblar {
       	static int AMOUNT_STAKE=100;
		static int BET=1;
		static int WON=1;
		static int LOST=0;
		
		public static void main(String[] args) 
	         {
			 System.out.println("Starting amount of stake is "+AMOUNT_STAKE);
			 System.out.println("Amount to bet after every play "+BET);
			 
			 int play = (int) Math.floor(Math.random() * 10) % 2;		 
			 System.out.println("Gamblers play:"+play);
			 int cashInHand = AMOUNT_STAKE;
			 switch(play) 
	         {
			 	case 0:
			 		cashInHand = cashInHand - BET;
			 		 System.out.println("Total current cash gambler has "+cashInHand);
			 		 break;
			 	case 1:
			 		cashInHand = cashInHand + BET;
			 		 System.out.println("Total current cash gambler has "+cashInHand);
			 		 break;
				default:
			 		 System.out.println("default");
			 }
			 if(play == 1) 
	                 {
				 System.out.println("Player won the first play");
			 }
			 else 
	                 {
				 System.out.println("Player lost the first play");
			 }

		}

	}
		
			
  
				

	


