# TP – Programmation Orientée Objet

**Nom :** Mamadou Radjaye Sow

## Présentation du TP

Ce TP a pour objectif de manipuler des images en Java à travers la programmation orientée objet. Il permet notamment de créer et modifier des images, de manipuler les pixels et les niveaux de gris, d'appliquer des transformations comme le négatif et d'effectuer une extraction de contours.

## Intelligence Artificielle générative

J'ai utilisé ChatGPT (OpenAI) pour m'aider à comprendre certaines erreurs de compilation et d'exécution, ainsi que pour comprendre le fonctionnement de certaines méthodes Java.

Exemples de prompts utilisés :
- « Où est le problème dans mon code Java ? »
- « Pourquoi ai-je une NullPointerException ? »


L'IA a été utilisée comme outil d'aide à la compréhension et au débogage.

## État du travail


- Problèmes connus : Deux tests echouent je sais pas pourquoi.

## Instructions d'utilisation

Toutes les commandes suivantes sont à exécuter depuis le dossier du TP.

### 1. Génération de la documentation

```bash
javadoc -sourcepath src src/image/*.java -d docs
```

Pour consulter la documentation, ouvrir :

```text
docs/index.html
```

### 2. Compilation des sources

```bash
javac -sourcepath src src/image/*.java -d classes  
```

### 3. Compilation des tests

```bash
javac -classpath classes:junit-console.jar test/image/*.java
```

### 4. Exécution des tests

```bash
  java -jar junit-console.jar -classpath test:classes -scan-classpath
```

### 5. Génération du fichier JAR

À adapter selon le nom du fichier manifeste fourni dans le TP :

```bash
jar cfm image.jar manifest-tp6 -C classes .
```

### 6. Exécution du programme sans JAR

Exemple avec une image :

```bash
java -classpath classes image.ImageMain /images/lamp.pgm
```

Exemple avec un seuil de détection des contours :

```bash
java -classpath classes image.ImageMain /images/lamp.pgm 30
```

### 7. Exécution du programme avec JAR

```bash
java -jar image.jar /images/lamp.pgm
```

Avec un seuil personnalisé :

```bash
java -jar image.jar /images/lamp.pgm 30
```

## Arguments du programme

Le programme accepte deux arguments :

- `args[0]` : chemin de l'image PGM à charger.
- `args[1]` : seuil utilisé pour l'extraction des contours (facultatif).

Si aucun seuil n'est fourni, le seuil par défaut est fixé à 20.