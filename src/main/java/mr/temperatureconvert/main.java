/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr.temperatureconvert;

import java.util.*;
import java.io.*;

/**
 * Lab 1 scalable temperature converter
 * takes an input text file with temperatures, converts from C to F and back
 * @author Mike Rocco
 */
public class main {


        public static void main(String[] args) throws Exception {
            double tem;
            
            Scanner inp=new Scanner(new File("temps.txt"));
            
            while(inp.hasNextDouble())
            {
                //scan in temperature from file
                tem=inp.nextDouble();
                
                System.out.println("temperature in C: "+tem);
           
                //convert to farenheit
                tem=(tem*1.8)+32;

                //print to screen
                System.out.printf("temperature in F: %.1f \n", tem);
                
                //convert back
                tem=(tem-32)/1.8;
                
                System.out.printf("temperature in C again: %.1f \n", tem);
                System.out.println();
            }
       
        }
}
