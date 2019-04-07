package main;

import tariff.TariffExtras;
import tariff.TariffPackage;
import user.LegalPerson;
import user.PostpaidUser;
import user.PrepaidUser;

public class Main {

	public static void main(String[] args) {
		MobileOperator mobileOperator = new MobileOperator(5, 10, 1);
		PrepaidUser pre1 = new PrepaidUser(1, 1000);
		PrepaidUser pre2 = new PrepaidUser(2, 00);
		TariffPackage personal = new TariffPackage(1000, 100, 200, 500, false);
		TariffPackage business = new TariffPackage(2000, 500, 800, 1500, true);
		PostpaidUser post1 = new PostpaidUser(3, personal);
		PostpaidUser post2 = new PostpaidUser(4, business);
		PostpaidUser post3 = new PostpaidUser(5, business);
		PostpaidUser post4 = new PostpaidUser(6, business);
		PostpaidUser post5 = new PostpaidUser(7, business);
		PostpaidUser post6 = new PostpaidUser(8, business);
		LegalPerson legal1 = new LegalPerson(1, "Company 1");
		LegalPerson legal2 = new LegalPerson(2, "Company 2");
		TariffExtras t1 = new TariffExtras(100, TariffExtras.INTERNET);
		TariffExtras t2 = new TariffExtras(100, TariffExtras.MESSAGES);

		System.out.println("**********");
		
		System.out.println("post 1 t1 " + post1.addTariffAddition(t1));
		System.out.println("post 1 t1 " + post1.addTariffAddition(t1));
		System.out.println("post 1 t2 " + post1.addTariffAddition(t2));
		
		System.out.println("post 1 " + legal1.addUser(post1));
		System.out.println("post 2 " + legal1.addUser(post2));
		System.out.println("post 2 " + legal1.addUser(post2));
		System.out.println("post 3 " + legal1.addUser(post3));
		System.out.println("post 4 " + legal1.addUser(post4));
		
		System.out.println("post 5 " + legal2.addUser(post5));
		System.out.println("post 5 " + legal2.addUser(post5));
		System.out.println("post 6 " + legal2.addUser(post6));
		
		System.out.println("**********");
		
		System.out.println("pre 1 " + mobileOperator.addUser(pre1));
		System.out.println("pre 1 " + mobileOperator.addUser(pre1));
		System.out.println("pre 2 " + mobileOperator.addUser(pre2));
		System.out.println("post 1 " + mobileOperator.addUser(post1));
		System.out.println("post 2 " + mobileOperator.addUser(post2));
		
		System.out.println("legal 1 " + mobileOperator.addLegalPerson(legal1));
		System.out.println("legal 1 " + mobileOperator.addLegalPerson(legal1));
		System.out.println("legal 2 " + mobileOperator.addLegalPerson(legal2));
		
		System.out.println("**********");
		
		System.out.println(mobileOperator.displayLegalPersons());
		
		System.out.println("********** PRE 1");
		
		System.out.println("pre1 calling pre1: " + mobileOperator.getUsers().get(0).makeCall(pre1, 1));
		System.out.println("pre1 calling pre2: " + mobileOperator.getUsers().get(0).makeCall(pre2, 1));
		System.out.println("pre1 calling pre2: " + mobileOperator.getUsers().get(0).sendMessage(pre1, "Message"));
		System.out.println("pre1 calling pre2: " + mobileOperator.getUsers().get(0).sendMessage(pre2, "Message"));
		System.out.println("pre1 calling pre2: " + mobileOperator.getUsers().get(0).surfOnInternet("URL", 1));
		System.out.println(((PrepaidUser)mobileOperator.getUsers().get(0)).getCredit());
		
		System.out.println("********** POST 1");
		
		System.out.println("post1 calling post1: " + mobileOperator.getUsers().get(2).makeCall(post1, 1));
		System.out.println("post1 calling post2: " + mobileOperator.getUsers().get(2).makeCall(post2, 1));
		System.out.println("post1 calling post1: " + mobileOperator.getUsers().get(2).sendMessage(post1, "Message"));
		System.out.println("post1 calling post2: " + mobileOperator.getUsers().get(2).sendMessage(post2, "Message"));
		System.out.println("post1 calling pre2: " + mobileOperator.getUsers().get(2).surfOnInternet("URL", 1));
		System.out.println(((PostpaidUser)mobileOperator.getUsers().get(2)).generateBill());
		System.out.println(((PostpaidUser)mobileOperator.getUsers().get(2)).getTariffPackage().getMBs());
		System.out.println(((PostpaidUser)mobileOperator.getUsers().get(2)).getTariffPackage().getMessages());

		System.out.println("********** POST 6");
		/*Who's calling who needs corrections...*/
		System.out.println("post1 calling post1: " + mobileOperator.getLegalPersons().get(0).getUsers().get(1).makeCall(post1, 1));
		System.out.println("post1 calling post2: " + mobileOperator.getLegalPersons().get(0).getUsers().get(1).makeCall(post2, 1));
		System.out.println("post1 calling post2: " + mobileOperator.getLegalPersons().get(0).getUsers().get(1).sendMessage(post1, "Message"));
		System.out.println("post1 calling post2: " + mobileOperator.getLegalPersons().get(0).getUsers().get(1).sendMessage(post2, "Message"));
		System.out.println("post1 calling post2: " + mobileOperator.getLegalPersons().get(0).getUsers().get(1).surfOnInternet("URL", 1));
		System.out.println(((PostpaidUser)mobileOperator.getLegalPersons().get(0).getUsers().get(1)).generateBill());
		
	}

}
