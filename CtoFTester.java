public class CtoFTester{
public static double celsiustoFahrenheit(double C){
  return C * 1.8 + 32.0;
}

public static double fahrenheittoCelsius(double F){
  return (F - 32.0) / 1.8;
}

public static void main(String[] args) {
 System.out.println(celsiustoFahrenheit(10.0));
 System.out.println(celsiustoFahrenheit(9.0));
 System.out.println(fahrenheittoCelsius(50.0));
 System.out.println(fahrenheittoCelsius(48.2));
}

}
