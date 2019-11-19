package CanardDindon;

import adaptateurParComposition.Standard;

public class AdaptateurDindon implements Standard {
    DindonSauvage dindonSauvage;

    public AdaptateurDindon(DindonSauvage dindonSauvage) {
        this.dindonSauvage = dindonSauvage;
    }

    @Override
    public void operation() {
        dindonSauvage.glouglouter();
        dindonSauvage.voler();
    }
}
