package com.brine.haileader.googletaskautosync.api;

import com.brine.haileader.googletaskautosync.domain.Task;
import com.brine.haileader.googletaskautosync.domain.TaskList;

import java.util.List;

/**
 * Created by HaiLeader on 11/2/2016.
 */
public interface TaskApi {

    List<TaskList> getTaskList();

    Task get(String remoteId);
    List<Task> get();
    Task post(Task t);
    Task put(Task t);
}
