package vexybot.dao;

import javax.persistence.*;

@Entity
@Table(name = "Chats", schema = "vex", catalog = "")
public class Chat {
    private int id;
    private String status;
    private String locale;
    private String location;
    private Integer morningNotification;
    private Integer eveningNotification;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = -1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "LOCALE", nullable = false, length = -1)
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Basic
    @Column(name = "LOCATION", nullable = true, length = -1)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "MORNINGNOTIFICATION", nullable = true)
    public Integer getMorningNotification() {
        return morningNotification;
    }

    public void setMorningNotification(Integer morningnotification) {
        this.morningNotification = morningnotification;
    }

    @Basic
    @Column(name = "EVENINGNOTIFICATION", nullable = true)
    public Integer getEveningNotification() {
        return eveningNotification;
    }

    public void setEveningNotification(Integer eveningnotification) {
        this.eveningNotification = eveningnotification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat that = (Chat) o;

        if (id != that.id) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (locale != null ? !locale.equals(that.locale) : that.locale != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (morningNotification != null ? !morningNotification.equals(that.morningNotification) : that.morningNotification != null)
            return false;
        if (eveningNotification != null ? !eveningNotification.equals(that.eveningNotification) : that.eveningNotification != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (morningNotification != null ? morningNotification.hashCode() : 0);
        result = 31 * result + (eveningNotification != null ? eveningNotification.hashCode() : 0);
        return result;
    }
}