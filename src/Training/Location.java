package Training;

 

/**
 * Represents the physical location of the browser. 
 */ 
public class Location { 
 
  private final double latitude; 
  private final double longitude; 
  private final double altitude; 
 
  public Location(double latitude, double longitude, double altitude) { 
    this.latitude = latitude; 
    this.longitude = longitude; 
    this.altitude = altitude; 
  } 
 
  public double getLatitude() { 
    return latitude; 
  } 
 
  public double getLongitude() { 
    return longitude; 
  } 
 
  public double getAltitude() { 
    return altitude; 
  } 
 
  @Override 
  public String toString() { 
    return String.format("Latitude: %s, Longitude: %s, Altitude: %s", 
        latitude, longitude, altitude); 
  } 