public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric(){
    return electric;
  }

  public boolean isDiscountApplied(){
    return discountApplied;
  }

  public boolean dropOffPassengers(int numOut){
    if (numOut < getPassengers()){
      int change = getPassengers() - numOut;
      setPassengers(change);
      return true;
    }
    else{
      return false;
    }
  }

  public void applyDiscount(){
    if (isElectric()){
      if (!discountApplied){
        double discounted = getTollFee() * 0.5;
        setTollFee(discounted);
        discountApplied = true;
      }
    }
  }

  public void printCar(){
    System.out.println("The license plate is: " + getLicensePlate());
    System.out.println("The toll fee is: " + getTollFee());
    System.out.println("The number of passengers is: " + getPassengers());
    System.out.println("The car is electric: " + electric);
    System.out.println("Discount applies: " + discountApplied);
  }
}