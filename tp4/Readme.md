# TP4 - Programmation Orientée Objet

**Nom :** Mamadou Radjaye Sow

## 1. Présentation du TP

Ce TP a pour objectif de mettre en pratique les concepts de la programmation
orientée objet en Java.

Le travail porte notamment sur la gestion des chambres d'un hôtel, la
création de classes et de méthodes, la gestion des exceptions et
l'utilisation des tests unitaires avec JUnit.

Le programme permet de consulter et de louer des chambres en fonction
de leur numéro.

## 2. Intelligence Artificielle générative

## Intelligence Artificielle générative

J'ai utilisé ChatGPT pour m'aider à comprendre certaines notions de Java et à résoudre les erreurs rencontrées pendant le TP.

J'ai notamment posé des questions sur le fonctionnement de `try/catch`, la gestion des exceptions et la création d'une exception personnalisée. J'ai également cherché à comprendre certaines erreurs de compilation, notamment celles liées à l'initialisation des variables et à leur utilisation.

**Exemples de prompts utilisés :**
- « Pourquoi cette erreur de compilation apparaît-elle ? »
- « Explique-moi comment fonctionne `try/catch`. »
- « Pourquoi Java indique-t-il que la variable `room` pourrait ne pas avoir été initialisée ? »


L'objectif de ces échanges était de comprendre l'origine des erreurs et les corrections nécessaires. Après les explications de l'IA, j'ai parfois réussi à trouver moi-même l'erreur et à corriger mon code.

## 3. Compilation du programme

Depuis le dossier tp4/, exécuter :

```bash
mkdir -p classes
javac -sourcepath src src/hotel/*.java -d classes
```
```markdown
## 4. Génération de la documentation

Exécuter :

```bash
javadoc -sourcepath src -subpackages hotel -d docs
```

La documentation générée se trouve dans le dossier `docs/`.

Pour la consulter, ouvrir le fichier `docs/index.html` dans un navigateur.

## 5. Compilation des tests

Exécuter :

```bash
javac -classpath junit-console.jar:classes -d test test/hotel/*.java
```

## 6. Exécution des tests

Exécuter :

```bash
java -jar junit-console.jar -classpath test:classes -scan-classpath
```

Cette commande exécute les tests JUnit présents dans les dossiers indiqués par le classpath.

## 7. Création du JAR exécutable

Après avoir compilé les sources, exécuter :

```bash
jar cvfm hotel.jar manifest-tp4 -C classes .
```

Le fichier `hotel.jar` est alors créé.

## 8. Exécution du programme

### Sans le JAR exécutable

Pour exécuter le programme avec le numéro de chambre 42 :

```bash
java -classpath classes hotel.HotelMain 42
```

Le programme reçoit le numéro de chambre en argument.

### Avec le JAR exécutable

Exécuter :

```bash
java -jar hotel.jar 42
```

Le numéro `42` est transmis au programme comme argument.
```
