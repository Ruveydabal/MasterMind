package masterMind;

import java.util.Arrays;
import java.util.Scanner;

public class vergelijken
{

    public String[] controleren(String[] codeMaker, String[] codeBrekerArray)
    {
	String[] controleVak = new String[4];
	if (codeBrekerArray[0].equalsIgnoreCase(codeMaker[0]))
	{
	    controleVak[0] = "zwart pin";
	}

	else if (codeBrekerArray[0].equalsIgnoreCase(codeMaker[1]) || codeBrekerArray[0].equalsIgnoreCase(codeMaker[2]) || codeBrekerArray[0].equalsIgnoreCase(codeMaker[3]))
	{
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

    public String vraagKeuzpin(String vraag)

    {
	String result;
	Scanner Sc = new Scanner(System.in);
	do
	{
	    System.out.println(vraag);
	    result = Sc.next();
	}
	while (!Arrays.asList(kleuren).contains(result));

	return result;

    }

}
