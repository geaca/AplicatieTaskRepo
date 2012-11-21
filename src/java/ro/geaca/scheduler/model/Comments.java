/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author tasa
 */
@Entity
@Table(name = "comments")
@NamedQueries({
    @NamedQuery(name = "Comments.findAll", query = "SELECT c FROM Comments c"),
    @NamedQuery(name = "Comments.findByCommentsId", query = "SELECT c FROM Comments c WHERE c.commentsId = :commentsId"),
    @NamedQuery(name = "Comments.findByCommentsTitle", query = "SELECT c FROM Comments c WHERE c.commentsTitle = :commentsTitle"),
    @NamedQuery(name = "Comments.findByCommentsDetails", query = "SELECT c FROM Comments c WHERE c.commentsDetails = :commentsDetails")})
public class Comments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "comments_id")
    private Integer commentsId;
    @Column(name = "comments_title")
    private String commentsTitle;
    @Column(name = "comments_details")
    private String commentsDetails;
    @JoinColumn(name = "tsk_id", referencedColumnName = "task_id")
    @ManyToOne
    private Task tskId;

    public Comments() {
    }

    public Comments(Integer commentsId) {
        this.commentsId = commentsId;
    }

    public Integer getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(Integer commentsId) {
        this.commentsId = commentsId;
    }

    public String getCommentsTitle() {
        return commentsTitle;
    }

    public void setCommentsTitle(String commentsTitle) {
        this.commentsTitle = commentsTitle;
    }

    public String getCommentsDetails() {
        return commentsDetails;
    }

    public void setCommentsDetails(String commentsDetails) {
        this.commentsDetails = commentsDetails;
    }

    public Task getTskId() {
        return tskId;
    }

    public void setTskId(Task tskId) {
        this.tskId = tskId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commentsId != null ? commentsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comments)) {
            return false;
        }
        Comments other = (Comments) object;
        if ((this.commentsId == null && other.commentsId != null) || (this.commentsId != null && !this.commentsId.equals(other.commentsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ro.geaca.scheduler.model.Comments[ commentsId=" + commentsId + " ]";
    }
    
}
