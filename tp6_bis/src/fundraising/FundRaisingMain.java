package fundraising;

import fundraising.donation.*;

public class FundRaisingMain {
    public static void main(String[] args) throws AlreadyExistingActionException {
        CharityActionManager cam = new CharityActionManager();
        Donor timo = new Donor("Timoleon");
        String restos = "Restos du Coeur";
	// COMPLETER LE CODE ICI
        cam.newAction(restos);
        cam.newDonation(restos, timo, 1000);
        double total=cam.closeAction(restos);
        System.out.println(total);


    }
}
