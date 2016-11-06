
public class Flight {
  private String flightNumber;
  private boolean connectingFlight;
  private long connectionPeriod;

  public Flight(String flightNumber, boolean connectingFlight, long connectionPeriod) {
    this.flightNumber = flightNumber;
    this.connectingFlight = connectingFlight;
    this.connectingPeriod = connectingPeriod;
  }

  public boolean setConnectionPeriod(long p) {
    if (p < PQEntry.DEFAULT_KEY) {
      this.connectionPeriod = p;
      return true;
    } else {
      return false;
    }
  }

  public long getConnectionPeriod() {
    return this.connectionPeriod;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public String getFlightNumber() {
    return this.flightNumber;
  }

  public boolean isConnectingFlight() {
    return this.connectingFlight;
  }

  public void setConnectingFlight(boolean connectingFlight) {
    this.connectingFlight = connectingFlight;
  }

  public String toString() {
    return "F#" + this.flightNumber;
  }
}