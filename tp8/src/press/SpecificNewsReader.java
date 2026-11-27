package press;
import press.news.*;
public class SpecificNewsReader extends NewReader{
    protected String name;
    protected int numberOfReceivedNews;
    private String motCle;
    public SpecificNewsReader(String name,String motCle){
        super(name);
        this.motCle=motCle;
    }
    public String getKeyWord(){
        return this.motCle;
    }

    public void push(News news){
        String texte;
        if (news.getTexte.contains(this.motCle) || news.getTitle.contains(this.motCle)){
            texte=texte.remplaceAll(this.motCle,"_"+this.motCle.toUppercase()+"_");
        }
    }




}