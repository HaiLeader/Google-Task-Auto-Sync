package com.brine.haileader.googletaskautosync.sync;

import java.util.List;

/**
 * Created by HaiLeader on 11/2/2016.
 */
public interface Datastore<T extends Syncable> {
    /***
     * Return full list of syncable data.
     *
     * @return list of syncable data
     */
    List<T> get();

    /***
     * Create new instance of syncable data.
     *
     * @return new instance of syncable data.
     */
    T create();

    /***
     * Add item to datastore.
     *
     * @param item - syncable item to be added to datastore.
     * @return Added syncable item
     */
    T add(T item);

    /***
     * Update existing item in datastore
     *
     * @param item - Syncable item to update
     * @return Updated syncable item
     */
    T update(T item);
}
