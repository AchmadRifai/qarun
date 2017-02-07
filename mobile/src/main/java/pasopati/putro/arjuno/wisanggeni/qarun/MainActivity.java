package pasopati.putro.arjuno.wisanggeni.qarun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.nativex.monetization.MonetizationManager;
import com.nativex.monetization.listeners.SessionListener;
import com.startapp.android.publish.adsCommon.StartAppAd;

public class MainActivity extends AppCompatActivity {
    private SessionListener sesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartAppAd.init(this,"101543986","201502206");
        setContentView(R.layout.activity_main);
        sesine();
        if(null!=getSupportActionBar())getSupportActionBar().hide();
    }

    private void sesine() {
        sesi=new SessionListener() {
            @Override
            public void createSessionCompleted(boolean b, boolean b1, String s) {
                if(!b) Toast.makeText(MainActivity.this, "Iklan 3 mati", Toast.LENGTH_SHORT).show();
            }
        };MonetizationManager.createSession(this,"125297",sesi);
    }
}
