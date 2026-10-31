# TP5 : Réponses

Nom / Prénom :

## Partie 1 : Enquête

| Étape | Ce qui est anormal                       | Ligne responsable | Classe qui aurait dû l'empêcher |
|-------|------------------------------------------|-------------------|---------------------------------|
| 1     | Tout les noms de familles sont des Verne | 11                | Auteur                          |
| 2     | Nombre de livres disponibles négatifs    | 11                | Livre                           |
| 3     | Date de naissance > date du jour         | 18                | Auteur                          |
| 4     | Possibilité de mettre le titre en null   | 8                 | Livre                           |
| 5     | Changer le nombre d'affichage de livres  | 8                 | Bibliotheque                    |
| 6     | Ajout d'un livre index 101               | 8                 | Bibliotheque                    |

**1.1** : Car le nom de l'auteur est en static et donc est le même pour tout le monde
Dans l'étape 4 on n'affiche que Dupont donc il est égale a Dupont
**1.2** : Rien à voir, c'est le code fait par le stagiaire qui n'est pas bon

## Partie 2

**2.1** : Non toute mes variables sont privates

**2.2** : C'est dans le constructeur que l'on construit la structure

## Partie 3

**3.1** : On ne veut modifier le nombre que par emprunter ou rendre donc si on rajoute on aurait trois méthodes donc on perdrait en cohérence des données.

**3.2** : En appelant setTitre dans le constructeur

## Partie 4

**4.1** : Modifier le nombre de livre dans la bibliothèque ... On ne peut plus supprimer des choses que l'on ne devrait pas dans la partie main du CodeDuStagiaire

**4.2** : Si on rajoute cette ligne on pourras écraser des données de la biblio
Bibliotheque biblio = new Bibliotheque();
biblio.getLivres()[0] = null;

## Partie 5

**5.1** : Static car la variable n'appartient qu'a la classe, final car la variable ne sera pas modifier, car c'est une constante

**5.2** : Sans static le compteur recommencerait à 0 pour chaques livres

**5.3** : Le compilateur signale qu'on ne peut pas appeler une methode d'instance depuis une methode static sans objet.

**5.4** : static est une bonne idée quand c'est une données pour tous les objets

**5.5** : Isbn est static car elle n'a pas besoin d'un objet alors que getAge en a besoin

## Partie 6

Nombre de livres créés affiché à l'étape 10, et explication :

## Bonus B2 : code dupliqué

