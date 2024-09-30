package TCS;

public class RemoveVowels {
public static void main(String[] args) {
	String s=" W e lco me";
	String res=s.replaceAll("[\\s]","");
//	String res=s.replaceAll("[aeiouAEIOU]","");
//	char[] a=s.toCharArray();
//	
//	String res="";
//	
//	for(int i=0;i<a.length;i++) {
//		if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u') {
//			continue;
//		}
//		else {
//			res+=a[i];
//		}
//	}
	System.out.println(res);
}
}
