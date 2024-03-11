package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "users_id")
    private User user;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return this.series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return this.user;
    }

    public User setUser(User user) {
        this.user = user;
        return user;
    }

    public String toString() {
        return "Car{id=" + this.id + ", model='" + this.model + '\'' + ", series=" + this.series + '}';
    }
}

