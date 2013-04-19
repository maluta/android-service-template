package com.example;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ServicesDemo extends BroadcastReceiver {
  private static final String TAG = "ServicesDemo";

  @Override
  public void onReceive(Context context, Intent intent) {
      Intent startServiceIntent = new Intent(context, MyService.class);
      context.startService(startServiceIntent);

	  Log.d(TAG, "onReceive");
  }
}
