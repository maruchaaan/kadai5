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
				StringBuilder sb = new StringBuilder();
							
				//100の位
				int number100 = n/100;
				if(number100 == 1){ sb.append("one hundred ");}
				if(number100 == 2){ sb.append("two hundred ");}
				if(number100 == 3){ sb.append("three hundred ");}
				if(number100 == 4){ sb.append("four hundred ");}
				if(number100 == 5){ sb.append("five hundred ");}
				if(number100 == 6){ sb.append("six hundred ");}
				if(number100 == 7){ sb.append("seven hundred ");}
				if(number100 == 8){ sb.append("eight hundred ");}
				if(number100 == 9){ sb.append("nine hundred ");	}		
			
				int number10 = ((n/10)%10);//10の位の値
				
				if(number10 == 1) { //11~19
				 if(n%100==10) { sb.append("ten");}
				 if(n%100==11) { sb.append("eleven");} 
				 if(n%100==12) { sb.append("twelve");} 
				 if(n%100==13) { sb.append("thirteen");} 
				 if(n%100==14) { sb.append("fourteen");} 
				 if(n%100==15) { sb.append("fifteen");} 
				 if(n%100==16) { sb.append("sixteen");} 
				 if(n%100==17) { sb.append("seventeen");} 
				 if(n%100==18) { sb.append("eighteen");} 
				 if(n%100==19) { sb.append("nineteen");}
				 return new String(sb);
				}
				
				//10の位	
				if(number10 == 2){ sb.append("twenty ");}
				if(number10 == 3){ sb.append("thirty ");}
				if(number10 == 4){ sb.append("fourty ");}
				if(number10 == 5){ sb.append("fifty ");}
				if(number10 == 6){ sb.append("sixty ");}
				if(number10 == 7){ sb.append("seventy ");}
				if(number10 == 8){ sb.append("eighty ");}
				if(number10 == 9){ sb.append("ninety ");}
			
				//1~9
				int number1 = (n%10);
				
				
				if(number1==1) { sb.append("one");} 
				if(number1==2) { sb.append("two");}
				if(number1==3) { sb.append("three");}
				if(number1==4) { sb.append("four");}
				if(number1==5) { sb.append("five");}
				if(number1==6) { sb.append("six");}
				if(number1==7) { sb.append("seven");}
				if(number1==8) { sb.append("eight");}
				if(number1==9) { sb.append("nine");}
				
				
				return new String(sb);
			}
			
		}
