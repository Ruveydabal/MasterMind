package masterMind;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vergelijken
{
    /**
     * controleren of er een wit pin, zwart pin of geen pin geplaatst wordt in
     * controleVak.
     * 
     * @param codeMaker
     * @param codeBrekerArray
     * @return
     */
    public String[] controleren(String[] codeMaker, String[] codeBrekerArray)
    {
	String[] controleVak = new String[4];
	if (codeBrekerArray[0].equalsIgnoreCase(codeMaker[0]))
	{
	    controleVak[0] = "zwart pin";
	}

	else if (codeBrekerArray[0].equalsIgnoreCase(codeMaker[0]) || codeBrekerArray[0].equalsIgnoreCase(codeMaker[1]) || codeBrekerArray[0].equalsIgnoreCase(codeMaker[2]) || codeBrekerArray[0].equalsIgnoreCase(codeMaker[3]))
	{// maak het net als hier boven voor extra punten
	    controleVak[0] = "wit pin";
	}

	else
	{
	    controleVak[0] = "geen pin";
	}

	// check kleur 2
	if (codeBrekerArray[1].equalsIgnoreCase(codeMaker[1]))
	{
	    controleVak[1] = "zwart pin";
	}

	else if (codeBrekerArray[1].equalsIgnoreCase(codeMaker[0]) || codeBrekerArray[1].equalsIgnoreCase(codeMaker[2]) || codeBrekerArray[1].equalsIgnoreCase(codeMaker[3]))
	{
	    controleVak[1] = "wit pin";
	}

	else
	{
	    controleVak[1] = "geen pin";
	}

	// check kleur 3
	if (codeBrekerArray[2].equalsIgnoreCase(codeMaker[2]))
	{
	    controleVak[2] = "zwart pin";
	}

	else if (codeBrekerArray[2].equalsIgnoreCase(codeMaker[0]) || codeBrekerArray[2].equalsIgnoreCase(codeMaker[1]) || codeBrekerArray[2].equalsIgnoreCase(codeMaker[3]))
	{
	    controleVak[2] = "wit pin";
	}
	else
	{
	    controleVak[2] = "geen pin";
	}

	// check kleur 4
	if (codeBrekerArray[3].equalsIgnoreCase(codeMaker[3]))
	{
	    controleVak[3] = "zwart pin";
	}

	else if (codeBrekerArray[3].equalsIgnoreCase(codeMaker[0]) || codeBrekerArray[3].equalsIgnoreCase(codeMaker[1]) || codeBrekerArray[3].equalsIgnoreCase(codeMaker[2]))
	{
	    controleVak[3] = "wit pin";
	}

	else
	{
	    controleVak[3] = "geen pin";
	}
	return controleVak;

    }

    String[] kleuren =
    { "rood", "paars", "geel", "groen", "oranje", "blauw" };

    /**
     * zorgt er voor dat je alleen de kleuren die er staan kunt invullen en geen
     * beurt weggooid als je toch iets anders neer zet.
     * 
     * @return
     */
    public String vraagKeuzpin()

    {
	String result;
	boolean kleurCheck = true;
	Scanner Sc = new Scanner(System.in);
	do
	{
	    if (kleurCheck == false)
	    {
		System.out.println("De kleur zit er helaas niet in, probeer opnieuw :( ");
	    }
	    result = Sc.next();
	    kleurCheck = false;
	}
	while (!Arrays.asList(kleuren).contains(result));

	return result;
    }

//hier wordt de code aangemaakt
    public String[] codeAanMaken()
    {
	String[] codeMaker = new String[4];
	Random rnd = new Random();
	for (int codeMakerCode = 0; codeMakerCode < codeMaker.length; codeMakerCode++)
	{
	    codeMaker[codeMakerCode] = kleuren[rnd.nextInt(kleuren.length)];
	}

//	for (String string : codeMaker)
//	{
//	    System.out.println(string);
//	}
	return codeMaker;
    }

    boolean eindResultaat = false;

    public boolean winVerlies(String controleVak[])
    {
	if (controleVak[0].equals("zwart pin") && controleVak[1].equals("zwart pin") && controleVak[2].equals("zwart pin") && controleVak[3].equals("zwart pin"))
	{
	    eindResultaat = true;
	}
	else
	{
	    eindResultaat = false;
	}

	return eindResultaat;
    }

}
