package partie1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Banana on 07/11/14.
 */
public class ButtonListener implements ActionListener {

    private Fenetre fenetre;

    public ButtonListener(Fenetre fenetre) {
        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.fenetre.afficherNom();
    }
}
