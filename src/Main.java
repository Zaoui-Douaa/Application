import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Employe E1 =new Employe("E1",1);
        Employe E2 = new Employe("E2",2);
        System.out.println(E1);
        System.out.println(E2);


        ///LIVRE 1
        ///LIVRE 2

        Auteur A1=new Auteur("A1");
        System.out.println("Les livres ecrits : "+A1.getLivresEcrits());
      //  A1.ajouterLivre(LIVRE);
        System.out.println("Les livres ecrits : "+A1.getLivresEcrits());

        Bibliothèque bibliothèque = new Bibliothèque();
     //   bibliothèque.ajouterLivre();
     //   bibliothèque.ajouterLivre();
        bibliothèque.afficherLivresDisponibles();
       // bibliothèque.emprunterLivre();
        //bibliothèque.retournerLivre();

        ///Emprunteur 1


    }
}