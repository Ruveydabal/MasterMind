package masterMind;

import java.util.Random;
import java.util.Scanner;

public class masterMind7
{
    public static void main(String args[])
    {

	Random rnd = new Random();

	String[] kleuren =
	{ "rood", "paars", "geel", "groen", "oranje", "blauw" };
	Scanner sc = new Scanner(System.in);

	String[] controleVak = new String[4];
	String[] codeMaker = new String[4];
	String[] codeBrekerArray = new String[4];

	for (int codeMakerCode = 0; codeMakerCode < 4; codeMakerCode++)
	{
	    codeMaker[codeMakerCode] = kleuren[rnd.nextInt(kleuren.length)];
	}

	int poging = 1;

	do
	{
	    System.out.println("Dit is poging " + poging);
	    System.out.println("zet je code er in ");
	    int kleur = 0;

	    System.out.println("kleur " + (kleur + 1));
	    codeBrekerArray[kleur] = sc.nextLine();
	    kleur++;
	    System.out.println("kleur " + (kleur + 1));
	    codeBrekerArray[kleur] = sc.nextLine();
	    kleur++;
	    System.out.println("kleur " + (kleur + 1));
	    codeBrekerArray[kleur] = sc.nextLine();
	    kleur++;
	    System.out.println("kleur " + (kleur + 1));
	    codeBrekerArray[kleur] = sc.nextLine();
	    kleur++;

	    // checken voor zwart pin, wit pin of geen pin
	    vergelijken check = new vergelijken();
	    controleVak = check.controleren(codeMaker, codeBrekerArray);

	    int i = 0;

	    for (int cijfers = 1; cijfers < 5; cijfers++)
	    {
		System.out.println(cijfers + " " + controleVak[i]);
		i++;
	    }

	    if (poging == 10)
	    {

		for (int x = 0; x < 4; x++)
		{
		    System.out.println(codeMaker[x]);
		}

	    }

	    poging = poging + 1;

	    // controle voor win of verlies
	    if (controleVak[0].equals("zwart pin") && controleVak[1].equals("zwart pin") && controleVak[2].equals("zwart pin") && controleVak[3].equals("zwart pin"))
	    {
		poging = 12;
	    }

	}

	while (poging <= 10);

	if (poging == 12)
	    System.out.println("je hebt gewonnen! :) ");
	else
	{
	    System.out.println("je hebt helaas niet gewonnen :( ");
	}

	sc.close();

    }

}
