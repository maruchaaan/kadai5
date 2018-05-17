	package kadai5;
	import java.util.Scanner;
	
	public class intToEng {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			//英語変換
			System.out.println(translateEng(input));
		}
		
		static String translateEng(int n) {
			//11~19
			if(n==10) { return "ten";
			}else if(n==11) { return "eleven";
			}else if(n==12) { return "twelve";
			}else if(n==13) { return "thirteen";
			}else if(n==14) { return "fourteen";
			}else if(n==15) { return "fifteen";
			}else if(n==16) { return "sixteen";
			}else if(n==17) { return "seventeen";
			}else if(n==18) { return "eighteen";
			}else if(n==19) { return "nineteen";
			}
			
			int number10=(n/10);
			int number1 = (n%10);
			
			String Enumber1;
			if(number1==1) { Enumber1="one";
			}else if(number1==2) { Enumber1="two";
			}else if(number1==3) { Enumber1="three";
			}else if(number1==4) { Enumber1="four";
			}else if(number1==5) { Enumber1="five";
			}else if(number1==6) { Enumber1="six";
			}else if(number1==7) { Enumber1="seven";
			}else if(number1==8) { Enumber1="eight";
			}else if(number1==9) { Enumber1="nine";
			}
			
			return number;
		}
	
		
	}
