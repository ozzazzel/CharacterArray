public class CharacterArray {
public static void main(String[] args) {
// TODO Auto-generated method stub
	
	  StringBuilder input = new StringBuilder("6901 Sudley Road Manassas VA ");
      for (int i = 0; i < input.length(); i++) {
          System.out.println(input.charAt(i));

          if(Character.isDigit(input.charAt(i))){
              input.replace(i,i+1,"*");
          }
          else if(Character.isUpperCase(input.charAt(i))) {
              input.replace(i, i+1,Character.toString(Character.toLowerCase(input.charAt(i))));
          }
          else if(Character.isLowerCase(input.charAt(i))) {
              input.replace(i, i+1,Character.toString(Character.toUpperCase(input.charAt(i))));
          }
          System.out.println(input);
      }
  }
}
