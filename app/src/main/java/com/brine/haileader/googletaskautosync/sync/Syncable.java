package com.brine.haileader.googletaskautosync.sync;

/**
 * Created by HaiLeader on 11/2/2016.
 */
public interface Syncable {
    /***
     * Getter for remote id that uniquely identifies syncable data item.  Used by syncmanager
     * to match local/remote syncable items.
     *
     * @return Remote datastore id
     */
    String getRemoteId();

    /***
     * Setter for remote id that uniquely identifies syncable data item.
     * @param id Remote datastore id
     */
    void setRemoteId(String id);

    /***
     * Getter for "last updated" sequence number.
     *
     * @return Last updated sequence number
     */
    Long getLastUpdatedSequence();

    /***
     * Setter for "last updated" sequence number.
     * @param value Last updated sequence number
     */
    void setLastUpdatedSequence(Long value);

    /***
     * Map fields from remote syncable data instance.
     * @param remote Remote syncable item to map from
     */
    void mapFromRemote(Syncable remote);

    /***
     * Map fields from local syncable data instance.
     * @param local Local syncable item to map from
     */
    void mapFromLocal(Syncable local);
}
