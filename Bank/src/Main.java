import com.bank.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
        Transaction e1=new Transaction(8066,"Parul",500);
        Transaction e2=new Transaction(9968,"Shivi",6000);
		ArrayList<Transaction> Table= new ArrayList<Transaction>();
		Table.add(e1);
		Table.add(e2);
		System.out.println(e1.getBalance());
		e1.withdrawal(200);
		System.out.println(e1.getBalance());
		e2.deposit(400);
		System.out.println(e2.getBalance());
		}
}
