package fr.Sabrineexample.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
@Entity
@Table(name = "measurement", schema = "public")
public class Measure {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String type;
    String unit;
    double value;
    @Column(name = "measure_date")
    LocalDateTime measuredate;

    public Measure(){id=null; type=null;}

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }
    public LocalDateTime getDate() {
        return measuredate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setMeasuredate(LocalDateTime measuredate) {
        this.measuredate = measuredate;
    }

    public Measure(Long id, String type, String unit, double value, LocalDateTime measuredate) {
        this.id = id;
        this.type = type;
        this.unit = unit;
        this.value = value;
        this.measuredate = measuredate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measure measure = (Measure) o;
        return Double.compare(measure.value, value) == 0 && Objects.equals(id, measure.id) && Objects.equals(type, measure.type) && Objects.equals(unit, measure.unit) && Objects.equals(measuredate, measure.measuredate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, unit, value, measuredate);
    }

    @Override
    public String toString() {
        return "Measure{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", unit='" + unit + '\'' +
                ", value=" + value +
                ", measuredate=" + measuredate +
                '}';
    }
}