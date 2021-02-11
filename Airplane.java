import java.util.*;
public class Airplane
{
  int altitude = 0;
    ArrayList < AltitudeObserver > listeners = new ArrayList <> ();

  public void addObserver (AltitudeObserver observer)
  {
    listeners.add (observer);
  }
  public void changeAltitude (int altitude)
  {
  for (AltitudeObserver listener:listeners)
      {
	listener.update (this.altitude, this.altitude = altitude);
      }
  }
}
