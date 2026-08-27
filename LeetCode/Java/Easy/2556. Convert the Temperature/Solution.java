class Solution {
    public double[] convertTemperature(double celsius) {
        double lelvin=celsius+273.15;
        double fahrenheit=celsius*1.80+32.00;
        return new double[]{lelvin,fahrenheit};
    }
    
}