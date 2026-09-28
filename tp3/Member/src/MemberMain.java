
public class MemberMain {
   
    /**
     * Alerte user to give the correct parametre
     */
    public static void usage(){
        System.out.println("Usage:java MemberMain <str Name> ");
        System.out.println(" ou  Usage:java MemberMain <str Name> <int point> ");
        System.exit(0);
    }
    public static void alerteNumber() {

        System.out.println("Erreur : le point doit être un entier.");
        System.exit(0);
    }
    
    public static void main(String[] args) {
        Member member1=null;
        if (args.length < 1) {
            MemberMain.usage();   
        }
        else if(args.length==1) {
           String name=args[0];
            member1= new Member(name );
        }
        else{
            String name=args[0];
            try {
                int point = Integer.parseInt(args[1]);
                member1= new Member(name,point );
            } catch (NumberFormatException e) {
                MemberMain.alerteNumber(); 
                
            } 
        }
        System.out.println(member1.toString());
        System.out.println("Statut "+member1.getLevel());
        boolean vrai=member1.hasLevelPlatine();
        if (vrai) {
    System.out.println("ce client a le niveau platine");
        } else {
    System.out.println("ce client n'a pas le niveau platine");
    }
    Member member2=new Member("Timoleon",20099);
    boolean egal=member1.equals(member2);
    if (egal) {
    System.out.println("Ces client sont egaux");
        } else {
    System.out.println("Ces client ne pas sont egaux");
    }
    boolean plus=member1.morePointThan(member2);
    if (plus) {
    System.out.println(member1.getName()+ " a plus de point que "+member2.getName());
        } else {
    System.out.println(member1.getName()+ " a moins de point que "+member2.getName());
    }
    }
}