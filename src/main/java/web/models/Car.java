package web.models;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String model;

    @Column
    private int series;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column
    private String color;

    public Car() {
    }



    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    @Override
    public String toString() {
        return "model=" + model + " series=" + series + " color=" + color;
    }

}
