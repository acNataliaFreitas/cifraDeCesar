package CifraDeCesar;

import java.util.Locale;
import java.util.Scanner;

public class cifra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()){
			String str = sc.nextLine();
			int troca =3;
			char[] s = str.toCharArray();
			
			
			//teste para letras minúsculas
			for (int x=0 ; x<s.length ; x++){
				if(s[x]>=94 && s[x]<=122){
					if((s[x]+troca) > 122)
						s[x]+=(-26+troca);
					else
						s[x]+=troca;
				} 
				
				
				//teste para letras maiúsculas
				else if(s[x]>=65 && s[x]<=90){
					if((s[x]+troca) > 90)
						s[x]+=(-26+troca);
					else
						s[x]+=troca;
				}
			}
			System.out.println(s);
		}
		sc.close();
	}
}
