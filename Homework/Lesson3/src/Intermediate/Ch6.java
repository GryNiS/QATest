package Intermediate;

public class Ch6 {
	
	public static void main(String[] args) {
	      String text = "���� ���� �� ������ � ��� �� ���� �� ��� ������� ������";
	      String words[] = text.split("[^�-��-�]");
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
	         System.err.println("��� ��� ��? ���� ���!");
	      else
	         System.out.println(words[iMax]);
	   }
}
