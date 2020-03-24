package entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lessons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nameOfLesson;
    
    public Lessons(String nameOfLesson){
        this.nameOfLesson = nameOfLesson;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOfLesson() {
        return nameOfLesson;
    }

    public void setNameOfLesson(String nameOfLesson) {
        this.nameOfLesson = nameOfLesson;
    }

    @Override
    public String toString() {
        return "Lessons{" + "id=" + id + ", nameOfLesson=" + nameOfLesson + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 13 * hash + Objects.hashCode(this.nameOfLesson);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lessons other = (Lessons) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nameOfLesson, other.nameOfLesson)) {
            return false;
        }
        return true;
    }
    
    
}
