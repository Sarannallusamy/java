class Operator{
	public static void main(String[] args){
		int x = 7;
		int y = 5;
		System.out.println(x>y);
		String user_name = "Saran";
		String pass_word = "18/07/1997";
		String quotes= "We are the so-called \"Vikings\" from the north.";
		System.out.println(user_name.concat(pass_word));
		System.out.println(quotes);
		int age = 26;
		int voting_age = 18;
		if (age>voting_age){
			System.out.println("it's enogh to vote");
		}else{
			System.out.println("it's not enogh to vote");	
		
		}
		
		int day = 8;
		switch (day){
			case 1:
			  System.out.println("monday");
			  break;
			case 2:
			  System.out.println("tuesday");
			  break;
			case 3:
			  System.out.println("wednesday");
			  break;
			case 4:
			  System.out.println("thursday");
			  break;
			case 5:
			  System.out.println("friday");
			  break;
			case 6:
			  System.out.println("saturday");
			  break;
			case 7:
			  System.out.println("sunday");
			  break;
			default:
			  System.out.println("Looking for next weekend");
		}
	}
}