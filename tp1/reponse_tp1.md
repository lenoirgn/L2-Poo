## EXercice 1
* 1- Avant la `javac tv.java` pas de Tv.class \
Apres OUI \
* 2 Il ya rien dans `tv.class`\
* 3.2  Une erreur ``` mamadou-radjaye.sow.etu@a15p5:~/Documents/l2-poo/tp1/tv/src$ javac Tv.java 
Tv.java:122: error: class, interface, enum, or record expected
 **
 ^
Tv.java:125: error: unnamed classes are a preview feature and are disabled by default.
public void off() {
       ^
  (use --enable-preview to enable unnamed classes)
Tv.java:126: error: ';' expected
this.on = False
               ^
3 errors ```
`
* 3.3 Erreur a la ligne 122 , 125, 126,

NB : Cette bonne pratique peut-être facilement appliquée en adaptant la commande compilation. La commande `javac` peut prendre en option :
* -sourcepath pour lui indiquer où se trouve les fichiers source à compiler ;
*  -d pour lui indiquer où ranger les fichiers générés par la compilation (« d » comme « destination »)

* 4.3  Dnans Tv on trouve 2 dossiers : classes(nouvelle) et src\
* 4.4 on trouve dans classes Tv.class
## Exercice 2
 apres execution :
 ``` 
 tv BelEcran is off, channel : 5 - sound volume : 3
--------------------------
tv BelEcran is on, channel : 7 - sound volume : 4
```
## Exercice 3
* 2 . apres la commande on a reecreer a nouveau les .class

* 3 . 
```
 tv BelEcran is off, channel : 5 - sound volume : 8
    --------------------------
tv BelEcran is on, channel : 7 - sound volume : 9
```
## Exercice 4

1.1 
// les attributs de la classe Book\

   private Author author;\
   private String title;\
   private int publicationYear;
