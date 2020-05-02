package GeeksForGeeks;

import java.util.Scanner;

public class twelvehrtoTwentyFourhr {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String tm = s.substring(0, 2);
        int temp1 = Integer.parseInt(tm);
        String shift = s.substring(8, s.length());
        String out1 = "";
        if(shift.contentEquals("PM") && temp1 < 12) {
        	temp1 = temp1+12;
        	 out1 = temp1+s.substring(2, 8);
        }
        else{
        	if(temp1 == 12 && shift.contentEquals("AM")) {
        		out1 = "00"+s.substring(2, 8);
        	}
        	else {
        	out1 = s.substring(0, 8);
        }
        }
       
       System.out.println(out1);
	}

}
