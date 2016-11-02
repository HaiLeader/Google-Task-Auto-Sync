package com.brine.haileader.googletaskautosync.sync;

import android.util.Log;

import com.brine.haileader.googletaskautosync.api.TaskApi;
import com.brine.haileader.googletaskautosync.domain.Task;

import java.util.List;

/**
 * Created by HaiLeader on 11/2/2016.
 */
public class TaskSyncRemoteDatastore implements Datastore<Task> {

    private static final String TAG = "TaskSyncRemoteDatastore";

    private TaskApi mRemoteApi;

    @Override
    public List<Task> get() {
        return mRemoteApi.get();
    }

    @Override
    public Task create() {
        return new Task();
    }

    @Override
    public Task add(Task item) {
        Log.d(TAG, "addRemote:"+item.toString());
        Task result = mRemoteApi.post(item);
        Log.d(TAG, "afterPost:"+result.toString());
        return result;
    }

    @Override
    public Task update(Task item) {
        Log.d(TAG, "updateRemote:"+item.toString());
        Task result = mRemoteApi.put(item);
        return result;
    }

    public TaskSyncRemoteDatastore(TaskApi api) {
        super();
        this.mRemoteApi = api;
    }
}
