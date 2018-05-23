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
				//0
				if(n == 0) { sb.append("zero");};
				
				//1000の位
				int number1000 = n/1000;
				if(number1000!=0) {
				  sb.append(numberEng(number1000)+" thousand ");
				}
				
				//100の位
				int number100 = ((n%1000)/100);
				if(number100!=0) {
				  sb.append(numberEng(number100)+" hundred ");
				}		
			
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
				if(number1!=0) {
				 sb.append(numberEng(number1));
				}
				
				return new String(sb);
			}
			
			public static String numberEng(int p) {
				String n = null;
				if(p == 1){ n="one"; }
				if(p == 2){ n="two"; }
				if(p == 3){ n="three"; }
				if(p == 4){ n="four"; }
				if(p == 5){ n="five"; }
				if(p == 6){ n="six"; }
				if(p == 7){ n="seven"; }
				if(p == 8){ n="eight"; }
				if(p == 9){ n="nine"; }	
				if(p == 10) { n="ten"; }
				return n;
			}
		}
