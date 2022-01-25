
public class GetString {
	String name;
    GetString(String name){
	   this.name=name;
   }
   public String ReverseIt(){
	   
	   char[] reversed=new char[name.length()];
	   int charindex=0;
	   for(int i=name.length()-1;i>=0;i--) {
		   reversed[charindex]=name.charAt(i);
		   charindex++;
	   }
	   String reverse="";
	   for(int i=0;i<name.length();i++) {
		   reverse=reverse+reversed[i];
	   }
	   return reverse;
   }
}
