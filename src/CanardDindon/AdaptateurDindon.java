package CanardDindon;

import adaptateurParComposition.Standard;

public class AdaptateurDindon extends DindonSauvage implements Canard {

    DindonSauvage dindonSauvage;

    public AdaptateurDindon(DindonSauvage dindonSauvage) {
        this.dindonSauvage = dindonSauvage;
    }


    @Override
    public void cancaner() {
        dindonSauvage.glouglouter();
    }
    @Override
    public void voler(){
        dindonSauvage.voler();
    }

}
