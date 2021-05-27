package jp.ac.titech.itpro.sdl.startservice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    private final static String TAG = MyReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context , Intent intent){
        Bundle bundle = intent.getExtras();
        String message = bundle.getString("data");
        Log.d(TAG,message);
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}