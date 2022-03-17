public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public boolean validateLicensePlate(){
    if (hasTrailer){
      if (axles > 4){
        if (getLicensePlate().substring(4).equals("MX")){
          return true;
        }
        else{
          return false;
        }
      }
      else{
        if (getLicensePlate().substring(4).equals("LX")){
          return true;
        }
        else{
          return false;
        }
      }
    }
    return true;
  }

  public void printTruck(){
    System.out.println("The license plate is: " + getLicensePlate());
    System.out.println("The toll fee is: " + getTollFee());
    System.out.println("The number of passengers is: " + getPassengers());
    System.out.println("The number of axles are: " + axles);
    System.out.println("The truck has a trailer: " + hasTrailer);
  }
}