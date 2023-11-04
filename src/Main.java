import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Employe E1 =new Employe("E1",1);
        Employe E2 = new Employe("E2",2);
        System.out.println(E1);
        System.out.println(E2);

        Livre L1=new Livre("L1",1,"LIVRE1");
        Livre L2=new Livre("L1",1,"LIVRE1");


        Auteur A1=new Auteur("A1");
        System.out.println("Les livres ecrits : "+A1.getLivresEcrits());
        A1.ajouterLivre(L1);
        A1.ajouterLivre(L2);
        System.out.println("Les livres ecrits : "+A1.getLivresEcrits());

        Bibliotheque bibliothèque = new Bibliotheque();
        bibliothèque.ajouterLivre(L1);
        bibliothèque.ajouterLivre(L2);
        bibliothèque.afficherLivresDisponibles();
        bibliothèque.emprunterLivre(L1);

        Emprunteur Em1=new Emprunteur("EM1",1);
        Em1.emprunterLivre(L1);
        Em1.toString();


    }
}