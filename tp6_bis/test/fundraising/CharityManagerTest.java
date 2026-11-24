package fundraising;
import fundraising.donation.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;


public class CharityManagerTest{
    @Test
    public void newActionTestOk()throws AlreadyExistingActionException{
        CharityActionManager chari= new CharityActionManager();
        chari.newAction("Restos du Coeur");
        assertEquals(0,chari.donationsTotal("Restos du Coeur"));

    }
     

    @Test
    public void newActionTestNok()throws AlreadyExistingActionException{
        CharityActionManager chari= new CharityActionManager();
        chari.newAction("Restos du Coeur");
        assertThrows(AlreadyExistingActionException.class, ()->chari.newAction("Restos du coeur"));
    }

    @Test
    public void newDonationTestOk()throws AlreadyExistingActionException{
        CharityActionManager chari= new CharityActionManager();
        chari.newAction("Restos du Coeur");
        Donor timo = new Donor("Timoleon");
        chari.newDonation("Restos du Coeur",timo,100);
        chari.newDonation("Restos du Coeur",timo,50);
        chari.newDonation("Restos du Coeur",timo,25);
        assertEquals(175,chari.donationsTotal("Restos du Coeur"));
    }

    @Test
    public void newDonationTestNok()throws AlreadyExistingActionException{
        CharityActionManager chari= new CharityActionManager();
        Donor timo = new Donor("Timoleon");
        chari.newDonation("Restos du Coeur",timo,100);
        assertFalse(0==chari.donationsTotal("Restos du Coeur"));
    }

    @Test
    public void donationsByDonorTestOk()throws AlreadyExistingActionException{
        CharityActionManager chari= new CharityActionManager();
        chari.newAction("Restos du Coeur");
        chari.newAction("Croix Rouge");
        Donor timo = new Donor("Timoleon");
        chari.newDonation("Restos du Coeur",timo,100);
        chari.newDonation("Restos du Coeur",timo,50);
        chari.newDonation("Croix Rouge",timo,25);
        assertEquals(175,chari.donationsByDonor(timo));
    }

    @Test
    public void donationsByDonorTestNok()throws AlreadyExistingActionException{
        CharityActionManager chari= new CharityActionManager();
        chari.newAction("Restos du Coeur");
        chari.newAction("Croix Rouge");
        Donor timo = new Donor("Timoleon");
        chari.newDonation("Restos du Coeur",timo,100);
        chari.newDonation("Restos du Coeur",timo,50);
        chari.newDonation("Croix Rouge",timo,25);
        assertFalse(0==chari.donationsByDonor(timo));
    }
    @Test
    public void closeActionTestOk()throws AlreadyExistingActionException{
        CharityActionManager chari= new CharityActionManager();
        chari.newAction("Restos du Coeur");
        Donor timo = new Donor("Timoleon");
        chari.newDonation("Restos du Coeur",timo,100);
        chari.newDonation("Restos du Coeur",timo,50);
        assertEquals(150,chari.closeAction("Restos du Coeur"));
        assertTrue(chari.donations("Restos du Coeur")==null);
    }
    @Test
    public void donationsTestOk()throws AlreadyExistingActionException{
        CharityActionManager chari= new CharityActionManager();
        chari.newAction("Restos du Coeur");
        Donor timo = new Donor("Timoleon");
        chari.newDonation("Restos du Coeur",timo,100);
        chari.newDonation("Restos du Coeur",timo,50);
        List<Donation> liste=chari.donations("Restos du Coeur");
        assertEquals(2,liste.size());
    }
}   