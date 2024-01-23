package masterMind;

public class masterMind7
{
    public static void main(String args[])
    {
	vergelijken check = new vergelijken();

	String[] controleVak = new String[4];
	String[] codeMaker = check.codeAanMaken();
	String[] codeBrekerArray = new String[4];

	int poging = 1;

	do
	{
	    System.out.println("Dit is poging " + poging);
	    System.out.println("zet je code er in ");
	    int kleur = 0;

	    // hier zet je de code er in
	    for (int i = 0; i < 4; i++)
	    {
		System.out.println("kleur " + (kleur + 1));
		codeBrekerArray[kleur] = check.vraagKeuzpin();
		kleur++;
	    }

	    // checken voor zwart pin, wit pin of geen pin
	    controleVak = check.controleren(codeMaker, codeBrekerArray);

	    // zegt of het zwart pin, wit pin of geen pin is
	    int i = 0;

	    for (int cijfers = 1; cijfers < 5; cijfers++)
	    {
		System.out.println(cijfers + " " + controleVak[i]);
		i++;
	    }

	    // print code uit als je het niet geraden hebt
	    if (poging == 10)
	    {

		for (int x = 0; x < 4; x++)
		{
		    System.out.println(codeMaker[x]);
		}

	    }

	    poging = poging + 1;
	    check.winVerlies();

	    // controle voor win of verlies
//	    if (controleVak[0].equals("zwart pin") && controleVak[1].equals("zwart pin") && controleVak[2].equals("zwart pin") && controleVak[3].equals("zwart pin"))
//	    {
//		poging = 12;
//	    } // boolean? maken controleVak.length in functie

	}

	while (poging <= 10);

	if (poging == 12)
	    System.out.println("je hebt gewonnen! :) ");
	else
	{
	    System.out.println("je hebt helaas niet gewonnen :( ");
	}

    }

}
