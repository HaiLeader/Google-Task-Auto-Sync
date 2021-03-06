package com.brine.haileader.googletaskautosync.sync;

import com.brine.haileader.googletaskautosync.db.TaskDb;
import com.brine.haileader.googletaskautosync.domain.Task;

import java.util.List;

/**
 * Created by HaiLeader on 11/2/2016.
 */
public class TaskSyncLocalDatastore implements Datastore<Task> {

    private TaskDb mDb;

    @Override
    public List<Task> get() {
        return mDb.fetchAllTasks();
    }

    @Override
    public Task create() {
        return new Task();
    }

    @Override
    public Task add(Task localDataInstance) {
        long id = mDb.createTask(localDataInstance);
        Task result = mDb.fetchTask(id);
        return result;
    }

    @Override
    public Task update(Task localDataInstance) {
        mDb.updateTask(localDataInstance);
        Task result = mDb.fetchTask(localDataInstance.getId());
        return result;
    }

    public TaskSyncLocalDatastore(TaskDb mDb) {
        super();
        this.mDb = mDb;
    }
}
