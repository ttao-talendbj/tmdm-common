// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, construire R40)
// Generated source version: 1.1.2

package com.amalto.webapp.util.webservices;


public class WSItem {
    protected com.amalto.webapp.util.webservices.WSDataClusterPK wsDataClusterPK;
    protected java.lang.String conceptName;
    protected java.lang.String[] ids;
    protected long insertionTime;
    protected java.lang.String content;
    
    public WSItem() {
    }
    
    public WSItem(com.amalto.webapp.util.webservices.WSDataClusterPK wsDataClusterPK, java.lang.String conceptName, java.lang.String[] ids, long insertionTime, java.lang.String content) {
        this.wsDataClusterPK = wsDataClusterPK;
        this.conceptName = conceptName;
        this.ids = ids;
        this.insertionTime = insertionTime;
        this.content = content;
    }
    
    public com.amalto.webapp.util.webservices.WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }
    
    public void setWsDataClusterPK(com.amalto.webapp.util.webservices.WSDataClusterPK wsDataClusterPK) {
        this.wsDataClusterPK = wsDataClusterPK;
    }
    
    public java.lang.String getConceptName() {
        return conceptName;
    }
    
    public void setConceptName(java.lang.String conceptName) {
        this.conceptName = conceptName;
    }
    
    public java.lang.String[] getIds() {
        return ids;
    }
    
    public void setIds(java.lang.String[] ids) {
        this.ids = ids;
    }
    
    public long getInsertionTime() {
        return insertionTime;
    }
    
    public void setInsertionTime(long insertionTime) {
        this.insertionTime = insertionTime;
    }
    
    public java.lang.String getContent() {
        return content;
    }
    
    public void setContent(java.lang.String content) {
        this.content = content;
    }
}
