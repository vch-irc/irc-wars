package cz.vchirc.ircwars.base.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.joda.time.DateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by David Pohan on 3/16/2015.
 */
@MappedSuperclass
@SQLDelete(sql = "UPDATE abstract_entity SET deleted = now() WHERE id = ?")
@Where(clause = "deleted IS NULL")
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private DateTime created;
    private DateTime deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public DateTime getDeleted() {
        return deleted;
    }

    public void setDeleted(DateTime deleted) {
        this.deleted = deleted;
    }
}
