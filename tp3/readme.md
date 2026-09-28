# Mamadou Radjaye SOW

# TP3 - Programmation Orientée Objet : Membres privilégiés

## Auteur

* **Nom :** Mamadou Radjaye Sow
* **Formation :** Licence 2 Informatique (2026-2027) — FST Université de Lille

---

## Description du sujet

Ce projet modélise un système de gestion de membres privilégiés pour un club commercial.
Les membres (`Member`) disposent d'un nom et d'un nombre de points. Selon leur total de points, un niveau de privilège (`PremiumLevel`) leur est attribué :

* **Argent** : dès la création (0 point)
* **Or** : à partir de 1000 points
* **Platine** : à partir de 2500 points

Le programme principal (`MemberMain`) s'exécute en ligne de commande pour créer un membre, attribuer des points, comparer son statut à celui d'un second membre généré aléatoirement et gérer les erreurs de paramètres.

---

## Instructions de compilation et d'exécution

Toutes les commandes doivent être exécutées depuis la racine du dossier `tp3/Member`

### 1. Compilation

```bash
javac -sourcepath src src/*.java -d classes 

```

### 2. Exécution

#### Cas 1 : Création d'un membre avec un nom (0 point)

```bash
java -classpath classes MemberMain Timoleon

```


## Intelligence Artificielle Générative


* **Usage :**
* Résolution des erreurs de compilation Java (`variable might not have been initialized`).
fallait initialiser member1=null,