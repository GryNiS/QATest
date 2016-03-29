package Intermediate;

public class Ch6 {
	
	public static void main(String[] args) {
	      String text = "Жили были не тужили и тут на тебе то что никогда небыло";
	      String words[] = text.split("[^а-яА-Я]");
	      int i; 
	      int size = words.length;
	      int iMax = -1; 
	      int iMaxLength = -1;
	      for (i = 0; i < size; ++i)
	         if (!"".equals(words[i]) && words[i].length() > iMaxLength) {
	            iMax = i;
	            iMaxLength = words[i].length();
	         }
	      if (iMax == -1)
	         System.err.println("Как так то? Слов НЕТ!");
	      else
	         System.out.println(words[iMax]);
	   }
}
