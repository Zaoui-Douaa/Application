# Application

** Bibliothèque de livres**

Vous devez créer un programme en Java pour gérer une bibliothèque de livres. Le programme doit inclure six classes différentes :

<**NOUR**>         Livre : Cette classe doit représenter un livre avec des attributs tels que le titre, l'auteur, l'année de publication, le numéro ISBN, et le nombre d'exemplaires disponibles. Assurez-vous de fournir des méthodes pour accéder et modifier ces attributs.

<**SABRINE**>      Bibliothèque : Cette classe doit représenter la bibliothèque elle-même. Elle devrait contenir une liste de livres disponibles. Vous devrez implémenter des méthodes pour ajouter un livre, emprunter un livre, retourner un livre et afficher la liste des livres disponibles.

<**SIWAR**>        Emprunteur : Cette classe doit représenter une personne qui emprunte des livres. Elle devrait avoir un nom, un identifiant unique et une liste des livres empruntés.

<**AZIZ**>        Employé : Cette classe représente un employé de la bibliothèque. Elle devrait avoir un nom, un identifiant unique et la capacité d'ajouter des livres à la bibliothèque.

<**MAHER**>       Auteur : Cette classe représente un auteur de livres. Elle devrait avoir un nom et une liste des livres qu'il a écrits.

<**DOUAA**>       Main : Cette classe doit contenir la méthode main et servir de point d'entrée pour le programme. Créez des instances de la bibliothèque, des emprunteurs, des employés et des auteurs, puis effectuez des opérations telles que l'emprunt de livres, le retour de livres et l'ajout de livres à la bibliothèque.



Les commandes utilisées:

git clone

git checkout -b EmployeBranch

//add files

git add .

git status

git commit -m "intial commit for employe branch"

git remote -v   //connecter à un dépôt distant

git push -u origin EmployeBranch

git tag // marquage

git tag -a v1.0 -m  "our project pre-evalution"

git push origin v1.0

git merge master     //fusionner une branche master

git log      //génère le log d’une branche

git pull     //récupérer les dernières modifications d'une branche

git diff      //énumérer tous les conflits actuels

git rm readme.txt  // Pour supprimer le fichier readme.txt

git stash      //sauvegarde local sans commit 

git show       //afficher tous les informations de git

git grep "livre"       //permet de rechercher le mot livre dans les arbres  

git gc       //Pour l'optimisation
