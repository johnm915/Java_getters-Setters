public class City {

    private String cityName;
    private int Population;

    public City(){}

    public City(int population) {
        Population = population;
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City (String cityName, int  Population){
        this.cityName = cityName;
        this.Population = Population;

    }

    public void setPopulation(int population) {
        Population = population;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulation() {
        return Population;
    }

    public String getCityName() {
        return cityName;
    }
}
