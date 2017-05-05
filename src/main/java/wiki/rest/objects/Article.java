
package wiki.rest.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("page_id")
    @Expose
    private Integer pageId;
    @SerializedName("rev")
    @Expose
    private Integer rev;
    @SerializedName("latest_rev")
    @Expose
    private Object latestRev;
    @SerializedName("tid")
    @Expose
    private String tid;
    @SerializedName("namespace")
    @Expose
    private Integer namespace;
    @SerializedName("restrictions")
    @Expose
    private Object restrictions;
    @SerializedName("tags")
    @Expose
    private Object tags;
    @SerializedName("renames")
    @Expose
    private Object renames;
    @SerializedName("nextrev_tid")
    @Expose
    private Object nextrevTid;
    @SerializedName("latest_tid")
    @Expose
    private Object latestTid;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("user_text")
    @Expose
    private String userText;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("redirect")
    @Expose
    private Boolean redirect;
    @SerializedName("page_deleted")
    @Expose
    private Object pageDeleted;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getRev() {
        return rev;
    }

    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public Object getLatestRev() {
        return latestRev;
    }

    public void setLatestRev(Object latestRev) {
        this.latestRev = latestRev;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public Integer getNamespace() {
        return namespace;
    }

    public void setNamespace(Integer namespace) {
        this.namespace = namespace;
    }

    public Object getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(Object restrictions) {
        this.restrictions = restrictions;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Object getRenames() {
        return renames;
    }

    public void setRenames(Object renames) {
        this.renames = renames;
    }

    public Object getNextrevTid() {
        return nextrevTid;
    }

    public void setNextrevTid(Object nextrevTid) {
        this.nextrevTid = nextrevTid;
    }

    public Object getLatestTid() {
        return latestTid;
    }

    public void setLatestTid(Object latestTid) {
        this.latestTid = latestTid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserText() {
        return userText;
    }

    public void setUserText(String userText) {
        this.userText = userText;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getRedirect() {
        return redirect;
    }

    public void setRedirect(Boolean redirect) {
        this.redirect = redirect;
    }

    public Object getPageDeleted() {
        return pageDeleted;
    }

    public void setPageDeleted(Object pageDeleted) {
        this.pageDeleted = pageDeleted;
    }

}
