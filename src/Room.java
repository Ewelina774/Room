public class Room {

    private double meters;
    private double temperature;
    private boolean isAirConditioner;

        Room( double meters, double temperature, boolean isAirConditioner) {
            this.meters = meters;
            this.temperature = temperature;
            this.isAirConditioner = isAirConditioner; }

  boolean lowerTemperature(int temperature) {

     if (getTemperature() > 15 && isAirConditioner())
         return true;
      else return false;
  }



    public double getMeters() {
        return meters;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioner() {
        return isAirConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        isAirConditioner = airConditioner;
    }
}


