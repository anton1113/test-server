package com.arash.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author arasshchektaiev
 */
@Entity
@Table(name = "remind")
public class Remind {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "remindDate", nullable = false)
    private Date remindDate;

    /**
     * Default empty constructor
     */
    public Remind() {
    }

    //<editor-fold desc="PRAGMA MARK - Getters and Setters">
    /**
     * Get id
     *
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * Set the new id
     *
     * @param id the new id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get title
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the new title
     *
     * @param title the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get remindDate
     *
     * @return remindDate
     */
    public Date getRemindDate() {
        return remindDate;
    }

    /**
     * Set the new remindDate
     *
     * @param remindDate the new remindDate
     */
    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }
    //</editor-fold>
}
