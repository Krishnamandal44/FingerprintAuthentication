package com.sayan.rnd.fingerprintscanner;

import android.support.v4.hardware.fingerprint.FingerprintManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FingerprintManagerCompat fingerprintManagerCompat = FingerprintManagerCompat.from(getApplicationContext());
        if (fingerprintManagerCompat.isHardwareDetected()){
            fingerprintManagerCompat.authenticate(null, 0, null, new FingerprintManagerCompat.AuthenticationCallback(){
                @Override
                public void onAuthenticationError(int errMsgId, CharSequence errString) {
                    super.onAuthenticationError(errMsgId, errString);
                }

                @Override
                public void onAuthenticationHelp(int helpMsgId, CharSequence helpString) {
                    super.onAuthenticationHelp(helpMsgId, helpString);
                }

                @Override
                public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult result) {
                    super.onAuthenticationSucceeded(result);
                }

                @Override
                public void onAuthenticationFailed() {
                    super.onAuthenticationFailed();
                }
            }, null);
        }
    }
}
