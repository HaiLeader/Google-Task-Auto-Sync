package com.brine.haileader.googletaskautosync.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by HaiLeader on 11/2/2016.
 */
public class TaskSyncAdapterService extends Service {

    private TaskSyncAdapter mSyncAdapter = null;

    private static final Object mSyncAdapterLock = new Object();

    @Override
    public void onCreate() {
        super.onCreate();

        synchronized (mSyncAdapterLock) {
            if(mSyncAdapter == null) {
                mSyncAdapter = new TaskSyncAdapter(getApplicationContext(), true);
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mSyncAdapter.getSyncAdapterBinder();
    }
}
