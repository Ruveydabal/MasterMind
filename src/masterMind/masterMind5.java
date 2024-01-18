package masterMind;

import java.util.Random;
import java.util.Scanner;

public class masterMind5
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

	    System.out.println("kleur 1");
	    codeBrekerArray[0] = sc.nextLine();
	    System.out.println("kleur 2");
	    codeBrekerArray[1] = sc.nextLine();
	    System.out.println("kleur 3");
	    codeBrekerArray[2] = sc.nextLine();
	    System.out.println("kleur 4");
	    codeBrekerArray[3] = sc.nextLine();

	    if (codeBrekerArray[0].equals(codeMaker[0]))
	    {
		controleVak[0] = "zwart pin";
	    }

	    else
	    {
		if (codeBrekerArray[0].equals(codeMaker[1]))
		{
		    controleVak[0] = "wit pin";
		}
		else if (codeBrekerArray[0].equals(codeMaker[2]))
		{
		    controleVak[0] = "wit pin";
		}
		else if (codeBrekerArray[0].equals(codeMaker[3]))
		{
		    controleVak[0] = "wit pin";
		}
		else
		{
		    controleVak[0] = "geen pin";
		}
	    }

	    if (codeBrekerArray[1].equals(codeMaker[1]))
	    {
		controleVak[1] = "zwart pin";
	    }

	    else
	    {
		if (codeBrekerArray[1].equals(codeMaker[0]))
		{
		    controleVak[1] = "wit pin";
		}
		else if (codeBrekerArray[1].equals(codeMaker[2]))
		{
		    controleVak[1] = "wit pin";
		}
		else if (codeBrekerArray[1].equals(codeMaker[3]))
		{
		    controleVak[1] = "wit pin";
		}
		else
		{
		    controleVak[1] = "geen pin";
		}
	    }
	    if (codeBrekerArray[2].equals(codeMaker[2]))
	    {
		controleVak[2] = "zwart pin";
	    }

	    else
	    {
		if (codeBrekerArray[2].equals(codeMaker[0]))
		{
		    controleVak[2] = "wit pin";
		}
		else if (codeBrekerArray[2].equals(codeMaker[1]))
		{
		    controleVak[2] = "wit pin";
		}
		else if (codeBrekerArray[2].equals(codeMaker[2]))
		{
		    controleVak[2] = "wit pin";
		}
		else
		{
		    controleVak[2] = "geen pin";
		}
	    }
	    if (codeBrekerArray[3].equals(codeMaker[3]))
	    {
		controleVak[3] = "zwart pin";
	    }

	    else
	    {
		if (codeBrekerArray[3].equals(codeMaker[0]))
		{
		    controleVak[3] = "wit pin";
		}
		else if (codeBrekerArray[3].equals(codeMaker[1]))
		{
		    controleVak[3] = "wit pin";
		}
		else if (codeBrekerArray[3].equals(codeMaker[2]))
		{
		    controleVak[3] = "wit pin";
		}
		else
		{
		    controleVak[3] = "geen pin";
		}
	    }
	    System.out.println("1: " + controleVak[0]);
	    System.out.println("2: " + controleVak[1]);
	    System.out.println("3: " + controleVak[2]);
	    System.out.println("4: " + controleVak[3]);

	    if (poging == 10)
	    {
		System.out.println(codeMaker[0]);
		System.out.println(codeMaker[1]);
		System.out.println(codeMaker[2]);
		System.out.println(codeMaker[3]);
	    }

	    poging = poging + 1;

	    if (controleVak[0].equals("zwart pin"))
	    {
		if (controleVak[1].equals("zwart pin"))
		{
		    if (controleVak[2].equals("zwart pin"))
		    {
			if (controleVak[3].equals("zwart pin"))
			{
			    poging = 12;
			}
		    }
		}
	    }

	}
	while (poging <= 10);

	if (poging == 12)
	    System.out.println("je hebt gewonnen! :) ");
	else
	{
	    System.out.println("je hebt niet gewonnen :( ");
	}

	sc.close();
    }
}
// functies toepassen!?
