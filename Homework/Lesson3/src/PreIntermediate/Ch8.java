package PreIntermediate;
import java.math.BigInteger;

public class Ch8 {
 
 static BigInteger sum =  BigInteger.ZERO;
 static BigInteger n = BigInteger.ZERO;
 static int el = 100;
 static int ie = 0;
 
 public static void main(String[] args) {
     fubba(BigInteger.ZERO,BigInteger.ONE);
 }
 
 private static void fubba (BigInteger previous, BigInteger last){
  n = previous.add(last);
   while (ie < el) {
    if (!n.mod(BigInteger.valueOf(2l)).equals(BigInteger.ZERO)) {
    sum=sum.add(n);  
    ie++;
    }
    fubba(last, n);
   }
 }
}