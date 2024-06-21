package zombied.android;

import com.jme3.app.AndroidHarness;
import zombied.game.ZombieD;


public class AndroidLauncher extends AndroidHarness {

    public AndroidLauncher() {
        appClass = ZombieD.class.getCanonicalName();
    }
}
