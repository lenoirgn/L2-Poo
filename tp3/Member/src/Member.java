public class Member{
    private String name;
    private int point;
    /**
     * Construct a new Member with the given name.
     * @param name the name of the member
     */
    public Member(String name){
        this.name=name;
        this.point=0;
    }
    public Member(String name,int point){
        this.name=name;
        this.point=point;
    }
    /**
     * Compare this member with another object for equality.
     * @param o the object to compare with
     * @return true if the other object is a Member with the same name and point,
     */
    public boolean equals(Object o){
        if (!( o instanceof Member)){
            return false;
        }
        Member member= (Member) o;
        return (this.name.equals(member.name)&&(this.point==member.point));
    }
    /**
     * Get the name of the member.
     * @return the name of the member
     */
    public String getName(){
        return this.name;
    }
    /**
     * Get the point of the member.
     * @return the point of the member
     */
    public int getPoint(){
        return this.point;
    }
    /**
     * Add points to the member's total.
     * @param val the number of points to add
     */
    public void addPoint(int val){
        this.point+=val;
    }
    /**
     * Check if this member has more points than another member.
     * @param m the member to compare with
     * @return true if this member has more points than the other member
     */
    public boolean morePointThan(Member m){
        return this.point>m.point;
    }
    /**
     * Get the premium level of the member based on their points.
     * @return the premium level of the member
     */
    public PremiumLevel getLevel(){
        return PremiumLevel.frompoints(this.point);
    }
    /**
     * Check if this member has a platinum level.
     * @return true if the member's level is platinum, false otherwise
     */
    public boolean hasLevelPlatine(){
        return this.getLevel()==PremiumLevel.platine;
    }
    /**
     * Get a string representation of the member.
     * @return a string describing the member's name, points, and level
     */
    public String toString(){
        return "Le client "+this.name+ "a " +this.point + "qui correspond a niveau"+ this.getLevel();
    }


}