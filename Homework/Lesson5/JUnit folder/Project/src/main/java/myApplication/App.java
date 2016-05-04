package myApplication;

public class App 
{

		public void ReadBook(){
			System.out.println("the book has been read");
		}

		public void WriteBook(){
			System.out.println("the book was written");
		}

		public long BuyBook(long sum){
			long price = 9;
			if (sum-price>0){
				System.out.println("you bought a book");
				return sum-price;
			}
			else
			{
				System.out.println("not enough money");
				return sum;
			}
			
		}
		
		public long SellBook(long sum,long price){
			sum+=price;
			return sum;
		}
		
		public void DonateBook(){
			System.out.println("book is the best gift");
		}
		
		public int RemoveBook(int n){
			System.out.println("book removed");
			return n-1;
		}
		
		public int AddBook(int n){
			System.out.println("book added");
			return n+1;
		}
		
		public int CopyBook(int n){
			System.out.println("book copied");
			return n+1;
		}
		
		public static void WatchPictures(){
			System.out.println("pictures seen");
		}

		public void RememberBook(){
			System.out.println("remember book");
		}
		
		public int EatBook(int n){
			System.out.println("the book is not edible and no longer readable");
			return n-1;
		}

}
