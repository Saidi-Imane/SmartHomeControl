package org.example;

public class Adresse {
    private Integer number;
    private String city;
    public Adresse(Integer number, String city) {
        this.number = number;
        this.city = city;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getAdresseInfo() {
        return number + " " + city;
    }

}
