public class TextReverter implements Assignment2{

   private String s;
   
   public TextReverter(){};
   
   //Every second word is rotated, blanks and the dot get copied exactly
   public String translate(String s){
      
      this.s = s;
      String result = "";
      
      while (isMore()){
         result += getBlanks();
         result += getWord();
         result += getBlanks();
         result += getWordReverse();
      }
         
      return result += ".";
   }
   
   //is true if there are more words or blanks to give out
   private boolean isMore(){
      return s.charAt(0) != 46;
   }
   
   //returns a String with the following blanks and deletes them from the original String
   private String getBlanks(){
      
      if(!isMore())
         return "";
      
      String res = "";
      
      while(s.charAt(0) == 32){
         res += " ";
         s = s.substring(1);
      }
      return res;
   }
   
   //return the following word and deletes it from the original String
   private String getWord(){
      
      char first = s.charAt(0);
      
      if(first == 46)
         return "";
      
      String res = "";
      
      while(first != 32 && first != 46){
         res += first;
         s = s.substring(1);
         first = s.charAt(0);
      }
      
      return res;
   }
   
   //reutrn the following word in reverse and deletes it from the original String
   private String getWordReverse(){
      
      if(!isMore())
         return "";
         
      String word = getWord();
      String res = "";
      int length = word.length();
      
      while(length > 0){
         res += word.charAt(length - 1);
         length -= 1;
      }
      
      return res;
   } 
}