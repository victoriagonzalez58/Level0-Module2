package gauntlet;

public class gauntlet {
public static void main(String[] args) {
	for (int i = 0; i <= 100; i++) {
		System.out.println(i);
	}
	for (int x = 100; x >= 0; x--) {
		System.out.println(x);
	}
	for (int neps = 2; neps <= 100; neps+=2) {
		System.out.println(neps);
	}
	for (int xd = 1; xd <= 99; xd+=2) {
		System.out.println(xd);
	}
	for (int lol = 0; lol <= 500; lol++) {
		System.out.println(lol+"even");
		lol++;
		System.out.println(lol+"odd");
	}
	for (int hiiamtryingtocomeupwithacreativenameforthisvariablebuticantthinkofonesoiamgivingitthisnameenjoythisnamevariablesorryifyoudontlikeit = 7; hiiamtryingtocomeupwithacreativenameforthisvariablebuticantthinkofonesoiamgivingitthisnameenjoythisnamevariablesorryifyoudontlikeit <= 777; hiiamtryingtocomeupwithacreativenameforthisvariablebuticantthinkofonesoiamgivingitthisnameenjoythisnamevariablesorryifyoudontlikeit+=7) {
		System.out.println(hiiamtryingtocomeupwithacreativenameforthisvariablebuticantthinkofonesoiamgivingitthisnameenjoythisnamevariablesorryifyoudontlikeit);
	}
	System.out.println("in 2004 i was 1 year old");
	for (int catnip = 2005; catnip <= 2016; catnip+=1) {
		System.out.println("in " + catnip + " i was " + (catnip-2004) + " years old");
	}
	
	System.out.println("in 2017, i'm still 12 years old");	
	
	for (int nicelilname = 0; nicelilname <= 2; nicelilname++) {
		for (int nicebigname = 0; nicebigname <= 2; nicebigname++) {
	
			System.out.println(nicelilname + " " + nicebigname);
		}
	}
	for (int useless = 0; useless <= 100; useless++) {
		for (int alsouseless = 0; alsouseless <= 100; alsouseless++) {
			System.out.println(alsouseless);
		}
		System.out.print("1 2 3\n4 5 6\n7 8 9");
	}	

}

}


