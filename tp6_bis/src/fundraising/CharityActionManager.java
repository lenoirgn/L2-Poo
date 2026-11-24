package fundraising;
import fundraising.donation.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class CharityActionManager{
    private Map<String,List<Donation>> collectFond;

    public CharityActionManager(){
        this.collectFond=new HashMap<String,List<Donation>>();
    }

    public void newAction(String actionName) throws AlreadyExistingActionException {
        if (this.collectFond.containsKey(actionName)) {
            throw new AlreadyExistingActionException("Action existe deja !");
        }

        this.collectFond.put(actionName, new ArrayList<>());
    }
    public void  newDonation(String actionName,Donor donor,double amount){
        if (this.collectFond.containsKey(actionName)){
            this.collectFond.get(actionName).add(new Donation(donor,amount));
        }
    }

    public  List<Donation> donations(String actionName){
        return this.collectFond.get(actionName);
    }


    public double donationsTotal(String actionName){
        List<Donation> liste=this.donations(actionName);
        double res=0;
        for(Donation don: liste){
            res+=don.getAmount();
        }
        return res;
    }

    public double closeAction(String actionName){
        double res=this.donationsTotal(actionName);
        this.collectFond.remove(actionName);
        return res;
    }

    public double donationsByDonor(Donor donor){
        Collection<List<Donation>> liste = this.collectFond.values();
        double res=0;
        for(List<Donation> listeDon:liste){
            for(Donation don: listeDon ){
                if (donor.equals(don.getDonor())){
                    res+=don.getAmount();
                }
            }
        }
        return res;
    }




}