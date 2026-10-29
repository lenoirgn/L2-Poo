# TP5 — Othello

**Nom :** Mamadou Radjaye Sow

## 1. Présentation du TP

Ce TP consiste à développer en Java une version du jeu Othello pour deux joueurs. Il permet de mettre en pratique la programmation orientée objet, la conception de classes et la collaboration entre différents objets.

Le programme gère le plateau de jeu, les joueurs, les pions, les positions et les directions. Il permet de vérifier la validité des coups, de retourner les pions adverses, de gérer les tours des joueurs et de déterminer le vainqueur à la fin de la partie.


## 2. Intelligence Artificielle générative

J’ai utilisé ChatGPT pour me rappeler certaines règles du jeu Othello, effectuer des tests et m’aider à comprendre des erreurs que je ne parvenais pas à identifier rapidement. Par exemple, il m’a aidé à repérer un problème lié à l’utilisation d’un plateau incorrect pendant les testes.

J’ai également proposé et réalisé certains tests supplémentaires qui n’étaient pas explicitement demandés dans le sujet du TP. La conception, l’implémentation et la vérification des fonctionnalités du programme ont constitué une part importante de mon travail.

Les propositions de l'IA ont été utilisées comme aide à la compréhension et au développement du programme.

## 3. État du projet

Les fonctionnalités réalisées sont :
- Initialisation du plateau avec les quatre pions de départ.
- Gestion des joueurs et des couleurs.
- Vérification de la validité des coups.
- Retournement des pions adverses encadrés.
- Affichage du plateau.
- Calcul du nombre de pions de chaque couleur.
- Détermination du vainqueur.

la logique du present projet est ideal dans le sens ou il considere que chaque joueur connait ces positiions valides donc apres chaque coup il donne le tour au joueur suivant. Sans tenir compte que le joueur peut ne pas avoir de coup valide, dans ce cas il passe son tour. Le programme continue jusqu'à ce que les deux joueurs n'aient plus de coups valides.

## 4. Organisation du projet

```text
tp5/
├── readme.md
├── junit-console.jar
├── manifest-tp5
├── src/
│   ├── io/
│   ├── othello/
│   │   ├── Board.java
│   │   ├── OthelloGame.java
│   │   ├── OthelloMain.java
│   │   └── utils/
│   └── tv/
└── test/
    └── othello/
```

## 5. Génération et consultation de la documentation

Depuis le répertoire `tp5`, exécuter :

```bash
javadoc -sourcepath src/**/*.java -d docs
```

Pour consulter la documentation, ouvrir le fichier `docs/index.html` dans un navigateur.

## 6. Compilation du projet

Depuis le répertoire `tp5` :

```bash
javac -sourcepath src src/**/*.java -d classes
```

Les fichiers compilés sont placés dans le répertoire `classes/`.

## 7. Compilation et exécution des tests

Compiler les sources et les tests :

```bash
javac -classpath junit-console.jar:classes test/othello/*.java
```

Exécuter les tests avec JUnit :

```bash
java -jar junit-console.jar -classpath classes:test -scan-classpath
```

## 8. Génération du fichier JAR exécutable

Le projet contient un fichier manifeste permettant de définir la classe principale du programme.

Pour générer un fichier JAR, après compilation :

```bash
 jar cvfm othello.jar manifest-tp5 -C classes . 
```


## 9. Exécution du programme

### Sans fichier JAR

Après compilation :

```bash
java -classpath classes othello.OthelloMain
```

### Avec le fichier JAR

```bash
java -jar othello.jar
```

