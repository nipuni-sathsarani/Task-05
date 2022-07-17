package FP_Experiments;

public class Vehicle implements Comparable<Vehicle> {
  private int VehicleNo;
  private String Colour;
  private String Brand;
  private int NumberofVehicles;

  public Vehicle(int VehicleNo, String Colour, String Brand, int NumberofVehicles) {
    
    this.VehicleNo = VehicleNo;
    this.Colour = Colour;
    this.Brand = Brand;
    this.NumberofVehicles = NumberofVehicles;

  }

  public String toString() {
    return String.format("%-10d%-20s%-20s%-30s", VehicleNo, Colour, Brand, NumberofVehicles);
  }

  public int getVehicleNo() {
    return VehicleNo;
  }

  public void setVehicleNo(int VehicleNo) {
    this.VehicleNo = VehicleNo;
  }

  public String getColour() {
    return Colour;
  }

  public void setColour(String Colour) {
    this.Colour = Colour;
  }

  public String getBrand() {
    return Brand;
  }

  public void setBrand(String Brand) {
    this.Brand = Brand;
  }

  public int getNumberofVehicles() {
	    return NumberofVehicles;
	  }

	  public void setNumberofVehicles(int NumberofVehicles) {
	    this.NumberofVehicles = NumberofVehicles;
	  }

  public int compareTo(Vehicle c) {
    return ((Integer) NumberofVehicles).compareTo(c.VehicleNo);
  }
}
