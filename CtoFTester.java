public class CtoFTester{
public static double CelsiustoFahrenheit(double C){
  return C * 1.8 + 32.0;
}

public static double FahrenheittoCelsius(double F){
  return (F - 32.0) / 1.8;
}

public static void main(String[] args) {
 System.out.println(CelsiustoFahrenheit(10.0));
 System.out.println(CelsiustoFahrenheit(9.0));
 System.out.println(FahrenheittoCelsius(50.0));
 System.out.println(FahrenheittoCelsius(48.2));
}

}
