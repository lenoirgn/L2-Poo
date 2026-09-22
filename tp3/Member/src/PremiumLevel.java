public  enum PremiumLevel {argent,or,platine;
    private static final int  seuileOr = 1000;
    private  static final int seuilePlantine = 2000;

    public static  PremiumLevel frompoints(int valeur){
        if (valeur<seuileOr){
            return argent;
        } else if (valeur<seuilePlantine){
            return or;
        } else
        {
            return platine;
        }

    }


}


