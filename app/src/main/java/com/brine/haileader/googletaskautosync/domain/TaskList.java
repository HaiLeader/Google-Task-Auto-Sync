package com.brine.haileader.googletaskautosync.domain;

/**
 * Created by HaiLeader on 11/2/2016.
 */
public class TaskList {

    private String kind;
    private String id;
    private String title;
    private String updated;
    private String selfLink;

    public String getKind(){
        return kind;
    }

    public void setKind(String kind){
        this.kind = kind;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getUpdated(){
        return updated;
    }

    public void setUpdated(String updated){
        this.updated = updated;
    }

    public String getSelfLink(){
        return selfLink;
    }

    public void setSelfLink(String selfLinks){
        this.selfLink = selfLinks;
    }

    @Override
    public String toString() {
        return "TaskList [kind=" + kind + ", id=" + id + ", title=" + title
                + ", updated=" + updated + ", selfLink=" + selfLink + "]";
    }
}
