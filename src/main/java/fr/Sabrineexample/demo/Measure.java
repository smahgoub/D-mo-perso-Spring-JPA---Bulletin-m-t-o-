package fr.Sabrineexample.demo;

public class Measure {

    private int id;
    private String type;
    private String unit;
    private double value;
    private String measureDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMeasureDate() {
        return measureDate;
    }

    public void setMeasureDate(String measureDate) {
        this.measureDate = measureDate;
    }

    public Measure(int id, String type, String unit, double value, String measureDate) {
        this.id = id;
        this.type = type;
        this.unit = unit;
        this.value = value;
        this.measureDate = measureDate;
    }

    @Override
    public String toString() {
        return "Measure{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", unit='" + unit + '\'' +
                ", value=" + value +
                ", measureDate='" + measureDate + '\'' +
                '}';
    }
}




