public class Member{
    private String name;
    private int point;
    public Member(String name){
        this.name=name;
        this.point=0;
    }
    public boolean equals(Object o){
        if (!( o instanceof Member)){
            return false;
        }
        Member member= (Member) o;
        return (this.name.equals(member.name)&&(this.point==member.point));
    }
    public String getName(){
        return this.name;
    }
    public int getPoint(){
        return this.point;
    }
    public void addPoint(int val){
        this.point+=val;
    }
    public boolean morePointThan(Member m){
        return this.point>m.point;
    }
    public PremiumLevel getLevel(){
        return PremiumLevel.frompoints(this.point);
    }
    public boolean hasLevelPlatine(){
        return this.getLevel()==PremiumLevel.platine;
    }
    public String toString(){
        return "Le client "+this.name+ "a " +this.point + "qui correspond a niveau"+ this.getLevel();
    }


}