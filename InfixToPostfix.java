import java.util.*;


public class InfixToPostfix {

	public static void main(String[] args) {
		
		
		/* 
		 * 1
		 * input ------- A*(B+C)/D
		 * output ------ ABC+*D/
		 */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
		   Stack<Character> inf = new Stack<>();
		   Stack<Character> psf = new Stack<>();
		   for(int i =0; i<s.length(); i++) {
		   if((s.charAt(i) >=65 && s.charAt(i) <=90) ||(s.charAt(i) >=97 && s.charAt(i) <=122)){
			   psf.push(s.charAt(i));
		   }
		   if(s.charAt(i) == '(') {
			   inf.push(s.charAt(i));
		   }
		   if(s.charAt(i) == ')') {
			   while(inf.peek() !='(') {
			   psf.push(inf.pop());
			   
			   }
			   inf.pop();
		   }
		   if(s.charAt(i) == '+' ||s.charAt(i) == '-') {
			   
			   if(!inf.isEmpty() && inf.peek() != '+' && inf.peek() != '-' && inf.peek() != '*' && inf.peek() != '/' && inf.peek() != '^') {
				   inf.push(s.charAt(i));
			   }
			   else {
				   while(!inf.isEmpty() && (inf.peek() == '+' || inf.peek() == '-' || inf.peek() == '*' || inf.peek() == '/' || inf.peek() == '^')) {
					   char temp2 = inf.pop();
					   psf.push(temp2);
					   
					   }
				inf.push(s.charAt(i));
			   }
		   }
		   
		   if(s.charAt(i) == '*' ||s.charAt(i) == '/') {
			   if(!inf.isEmpty() && inf.peek() != '*' && inf.peek() != '/' &&  inf.peek() != '^') {
				   inf.push(s.charAt(i));
			   }
			   else {
					   while(!inf.isEmpty() && (inf.peek() == '*' || inf.peek() == '/' ||  inf.peek() == '^')) {
					   char temp2 = inf.pop();
					   psf.push(temp2);
					   
					   }
					   inf.push(s.charAt(i));
			   }
		   }
		   if(s.charAt(i) =='^') {
			   if(!inf.isEmpty() && inf.peek() !='^'){
				   inf.push(s.charAt(i));
			   }
			    else{
			    	while(!inf.isEmpty() && inf.peek() !='^') {
				   char temp1 = inf.pop();
				 psf.push(temp1);
			    	}
			    inf.push(s.charAt(i));
			   }
		   }
		}
		   while(!inf.isEmpty()) {
			   psf.push(inf.pop());
		   }
			   System.out.print(psf.toString().replace("[", "").replace("]", "").replace(",","").replace(" ", ""));

		}
		sc.close();
	}

}
