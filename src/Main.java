public class Main {
    public static void main(String[] args) {
        City denver = new City();
        denver.setCityName("Denver");
        denver.setPopulation(2890000);
        System.out.println("City is" + " " + denver.getCityName() +  " "
                + "Population is" + " " + denver.getPopulation());

        City topeka = new City("Topeka");
        System.out.println("My 2nd City is: " + topeka.getCityName());

        City dallas = new City ("Dallas");
        dallas.setPopulation(4000000);
        System.out.println("My 3rd City is " + " " + dallas.getCityName() + " " + " it has "
                + dallas.getPopulation() + " living in the city" );

    }
}
