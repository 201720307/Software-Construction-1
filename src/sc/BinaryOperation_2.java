package sc;

import java.util.Random;

public class BinaryOperation_2 {
	public static void main(String[] args) {
		short m=0,n=0,ov=0,q=0;
		char o='+';
		calculate(m,n,ov,q,o);
	}
	public static void calculate(short m,short n,short ov,short q,char o){
		
		Random random=new Random();
		for(int i=0;i<200;i++){
			ov=(short)random.nextInt(2);
			m=(short)random.nextInt(101);
			n=(short)random.nextInt(101);
			if(ov==1){
				o='+';{
					if(m+n>100)
						continue;
				}
			}
			else{
				o='-';{
					if(m-n<0)
						continue;
				}
			}
			q++;
			if(q>50)
				continue;
			System.out.print(""+q+":"+m+o+n+"=");
			answer(m,n,ov);
		}
	}
	public static void answer(short m,short n,short ov) {
		
		int x;
		if(ov==1){
			x=m+n;
		}
		else{
			x=m-n;
		}
		System.out.println(x);
	}
}
