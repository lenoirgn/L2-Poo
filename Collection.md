## 1.1 
```
Une Map<Subject, Integer>, car elle permet d’associer chaque matière à son coefficient et de retrouver facilement le coefficient d’une matière à partir de celle-ci.
```

## Q1.2 -1.3 

```
package university;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Curriculum{
    private String name;
    private Map<Subject, Integer> subjectCredits;

    public Curriculum(String name){
        this.name = name;
        this.subjectCredits = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public Map<Subject, Integer> getSubjectCredits(){
        return this.subjectCredits;
    }

    public  int getCoeff(Subject subject) throws IllegalStateException{
         if (!this.subjectCredits.containsKey(subject)){
            throw new IllegalStateException("Subject " + subject + " does not exist in curriculum " + this.name);
        }
        return this.subjectCredits.get(subject);
    }

    public Set<Subject> allSubjects() {
        return this.subjectCredits.keySet();
    }

    public boolean subjectExist(Subject sub){
        return this.subjectCredits.containsKey(sub);
    }

    public void addSubject(Subject sub, int coef){
        this.subjectCredits.put(sub,coef);
    }

    public void removeSubject(Subject subject) {
    this.subjectCredits.remove(subject);
    }

    public String toString(){
       String  result = this.name + " : ";
       for (Subject sub : this.subjectCredits.keySet()){
           result += sub + " (" + this.subjectCredits.get(sub) + ") ";
       }    
       return result;
    }

    /**public static void main(String[] args) {

        Curriculum curriculum = new Curriculum("Licence Informatique");

        
        curriculum.addSubject(Subject.ALR, 5);
        curriculum.addSubject(Subject.POO, 4);

        System.out.println(curriculum.toString());
    }*/


}
```

## Q2

```

package university;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student{
    private Identity identity;
    private String studentId;
    private Curriculum curriculum;
    private Map<Subject, List<Integer>> grades;

    public Student(Identity identity, String studentId, Curriculum curriculum){
        this.identity = identity;
        this.studentId = studentId;
        this.curriculum = curriculum;
        this.grades = new HashMap<>();
    }

    public void addNoteParMatiere(Subject subject, int note){
       List<Integer> listNotes=this.grades.get(subject); 
       if (listNotes==null) {
        listNotes = new ArrayList<>();
        }
       listNotes.add(note);
       this.grades.put(subject, listNotes);
    }

    public List<Integer> getNotesParMatiere(Subject subject){
        return this.grades.get(subject);
    }

    public float  moyParMatiere(Subject sub){
        List<Integer> ListeNote= this.grades.get(sub);
        if (ListeNote == null || ListeNote.isEmpty()) {
        return 0;
        }
        int sum=0;
        for(int note: ListeNote){
            sum+=note;
        }
        return (float)  sum/ListeNote.size();
    }

    public float moyGenerale(){
        Set<Subject> matieres=this.curriculum.allSubjects();
        List<Float> listeMoy = new ArrayList<>();
        Iterator <Subject> it= matieres.iterator();
        while(it.hasNext()){
            Subject mat=it.next();
            listeMoy.add(moyParMatiere(mat)*this.curriculum.getCoeff(mat));
            
        }
        float sumMoyenPondere = 0;
        for (Float note : listeMoy) {
            sumMoyenPondere += note;
        }

        Collection<Integer> listeCoef = this.curriculum.getSubjectCredits().values();
         int SumCoef=0;
        for ( int coef: listeCoef){
            SumCoef+=coef;
        }
        return (float) sumMoyenPondere/SumCoef;
    }

    


    public void editCurriculum( Curriculum cur){

        this.curriculum=cur;
        Set<Subject> matieres= cur.allSubjects();
        this.grades.clear();
        for(Subject mat: matieres){
            this.grades.put(mat,new ArrayList<>());
        }

    }

    public boolean equals(Object o){
        if(!(o instanceof Student)){
            return false;
        }
        Student other = (Student) o;
        return this.studentId.equals(other.studentId);
    }


    public static void main(String[] args) {

        // Création des matières
        Subject maths =  Subject.POO;
        Subject info =  Subject.ALR;
        Subject anglais =  Subject.TW2;

        // Création du premier cursus
        Curriculum cur1 = new Curriculum("L1");
        cur1.addSubject(maths, 4);
        cur1.addSubject(info, 5);

        // Création de l'identité
        Identity identity = new Identity("Sow", "Mamadou");

        // Création de l'étudiant
        Student student = new Student(identity, "ETU001", cur1);

        // Ajout des notes dans le premier cursus
        student.addNoteParMatiere(maths, 15);
        student.addNoteParMatiere(info, 12);

        System.out.println("AVANT MODIFICATION");
        System.out.println("Moyenne en maths : " + student.moyParMatiere(maths));
        System.out.println("Moyenne en info : " + student.moyParMatiere(info));
        System.out.println("Moyenne generale : " + student.moyGenerale());

        // Création du deuxième cursus
        Curriculum cur2 = new Curriculum("L2");
        cur2.addSubject(anglais, 2);
        cur2.addSubject(info, 6);

        // Modification du cursus
        student.editCurriculum(cur2);

        System.out.println("\nAPRÈS MODIFICATION");
        System.out.println("Moyenne en anglais : " + student.moyParMatiere(anglais));
        System.out.println("Moyenne en info : " + student.moyParMatiere(info));
    }

    }


```
