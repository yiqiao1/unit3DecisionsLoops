import java.util.Scanner;

/**
 * Write a description of class Spectrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double wavelength;
        
        System.out.print("Please enter a wavelength value in meters: ");
        wavelength = in.nextDouble();
        
        if (wavelength < 1e-11)
        {
            System.out.println("This is a gamma ray that has a frequency of greater than 3x10^19 Hz.");
        }
        else if (wavelength < 1e-8)
        {
            System.out.println("This is an x-ray that has a frequency of between 3x10^16 to 3x10^19 Hz.");
        }
        else if (wavelength < 4e-7)
        {
            System.out.println("This is an ultraviolet ray that has a frequency of between 7.5x10^14 and 3x10^16 Hz.");
        }
        else if (wavelength < 7e-7)
        {
            System.out.println("This is visible light that has a frequency of between 4x10^14 and 7.5x10^14 Hz.");
        }
        else if (wavelength < 1e-3)
        {
            System.out.println("This is an infrared ray that has a frequency of between 3x10^11 to 4x10^14 Hz.");
        }
        else if (wavelength < 1e-1)
        {
            System.out.println("This is a microwave that has a frequency of greater 3x10^9 to 3x10^11 Hz.");
        }
        else 
        {
            System.out.println("This is a radio wave that has a frequency of less than 3x10^9 Hz.");
        }
    }
}
