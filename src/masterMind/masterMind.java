package masterMind;

import java.util.Scanner;

public class masterMind
{
    public static void main(String args[])
    {

	String rood = "rood";
	String geel = "geel";
//	String oranje = "oranje";
	String paars = "paars";
//	String groen = "groen";
	String blauw = "blauw";

	String codeMaker1 = rood;
	String codeMaker2 = geel;
	String codeMaker3 = paars;
	String codeMaker4 = blauw;

	Scanner sc = new Scanner(System.in);

	String controleVak1;
	String controleVak2;
	String controleVak3;
	String controleVak4;

	int poging = 1;

	do
	{
	    System.out.println("zet je code er in ");
	    String codeBreker1 = sc.nextLine();
	    String codeBreker2 = sc.nextLine();
	    String codeBreker3 = sc.nextLine();
	    String codeBreker4 = sc.nextLine();

	    if (codeBreker1.equals(codeMaker1))
	    {
		controleVak1 = "zwart pin";
	    }

	    else
	    {
		if (codeBreker1.equals(codeMaker2))
		{
		    controleVak1 = "wit pin";
		}
		else if (codeBreker1.equals(codeMaker3))
		{
		    controleVak1 = "wit pin";
		}
		else if (codeBreker1.equals(codeMaker4))
		{
		    controleVak1 = "wit pin";
		}
		else
		{
		    controleVak1 = "geen pin";
		}
	    }

	    if (codeBreker2.equals(codeMaker2))
	    {
		controleVak2 = "zwart pin";
	    }

	    else
	    {
		if (codeBreker2.equals(codeMaker1))
		{
		    controleVak2 = "wit pin";
		}
		else if (codeBreker2.equals(codeMaker3))
		{
		    controleVak2 = "wit pin";
		}
		else if (codeBreker2.equals(codeMaker4))
		{
		    controleVak2 = "wit pin";
		}
		else
		{
		    controleVak2 = "geen pin";
		}
	    }
	    if (codeBreker3.equals(codeMaker3))
	    {
		controleVak3 = "zwart pin";
	    }

	    else
	    {
		if (codeBreker3.equals(codeMaker1))
		{
		    controleVak3 = "wit pin";
		}
		else if (codeBreker3.equals(codeMaker2))
		{
		    controleVak3 = "wit pin";
		}
		else if (codeBreker3.equals(codeMaker4))
		{
		    controleVak3 = "wit pin";
		}
		else
		{
		    controleVak3 = "geen pin";
		}
	    }
	    if (codeBreker4.equals(codeMaker4))
	    {
		controleVak4 = "zwart pin";
	    }

	    else
	    {
		if (codeBreker4.equals(codeMaker1))
		{
		    controleVak4 = "wit pin";
		}
		else if (codeBreker4.equals(codeMaker2))
		{
		    controleVak4 = "wit pin";
		}
		else if (codeBreker4.equals(codeMaker3))
		{
		    controleVak4 = "wit pin";
		}
		else
		{
		    controleVak4 = "geen pin";
		}
	    }
	    System.out.println(controleVak1);
	    System.out.println(controleVak2);
	    System.out.println(controleVak3);
	    System.out.println(controleVak4);
	    poging = poging + 1;

	    if (controleVak1.equals("zwart pin"))
	    {
		if (controleVak2.equals("zwart pin"))
		{
		    if (controleVak3.equals("zwart pin"))
		    {
			if (controleVak4.equals("zwart pin"))
			{
			    poging = 12;
			}
		    }
		}
	    }

	}
	while (poging <= 10);

	if (poging == 12)
	    System.out.println("je hebt gewonnen!");
	else
	{
	    System.out.println("niet gewonnen");
	}

	sc.close();
    }
}
