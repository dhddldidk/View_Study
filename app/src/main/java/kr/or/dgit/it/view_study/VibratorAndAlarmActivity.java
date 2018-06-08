package kr.or.dgit.it.view_study;

import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VibratorAndAlarmActivity extends AppCompatActivity {

    Vibrator vib;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrator_and_alarm);
        setTitle(getIntent().getStringExtra("title"));

        vib = (Vibrator) getSystemService(VIBRATOR_SERVICE);
    }

    public void btnCustomerSoundClick(View view){
        if(view.getId()==R.id.btn_sound_start){
            mediaPlayer = MediaPlayer.create(this, R.raw.always);
            mediaPlayer.start();
        }
        if(view.getId()==R.id.btn_sound_stop){
            if(mediaPlayer!=null){
                mediaPlayer.stop();
                mediaPlayer.release();
            }
            mediaPlayer = null;
        }
    }



    public void btnVibrationClick(View view) {
        vib.vibrate(1000);
    }

    public void btnSystemBeepClick(View view) {
        Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Ringtone ringtone = RingtoneManager.getRingtone(this, notification);
        ringtone.play();
    }

    public void btnCustomBeepClick(View view) {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.fallbackring);
        mp.start();
    }

    public void btnVibratorPatternClick(View view) {
        vib.vibrate(new long[]{500,1000,1000,3000,500,1000}, -1);
    }
}
