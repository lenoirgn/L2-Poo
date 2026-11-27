package press;
import press.news.*;

public class NewReader(){
    protected String name;
    protected int numberOfReceivedNews;
    public NewReader(String name){
        this.name=name;
        this.numberOfReceivedNews=0;
    }
    public String getName(){
        return this.name;
    }
    public int getNumberOfReceivedNew(){
        return this.numberOfReceivedNews;
    }

    public void receive(News news){
        this.numberOfReceivedNews++;
        this.push(news);
    }
    protected void push(News news){
        System.out.println(this+"\t+ -> \t"+ news);
    }
}