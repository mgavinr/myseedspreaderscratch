package com.myseedspreader.grogers.myseedspreader;

import android.os.Bundle;   // for saving state info
import java.text.NumberFormat;
import android.util.Log;
/**
 * Created by grogers on 30/04/23.
 */

public class MainSeedSpreader {
    // Members
    String motd;

    // Constructors
    public MainSeedSpreader() {
        this.motd = "This is the message of the day!";
        Log.d(this.getClass().getSimpleName(), "We are starting up!");
    }

    // Public Functions
    public String getMotd() {
        Log.d(this.getClass().getSimpleName(), "This is motd!");
        return motd;
    }

    // Private Functions

}
