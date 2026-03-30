package com.fss;

import fuzzlib.FuzzySet;
import fuzzlib.creators.OperationCreator;
import fuzzlib.norms.Norm;
import fuzzlib.norms.TNorm;

/**
 *
 * @author Student
 */
public class MainFuzz {
    public static void main(String[] args) {
        
        FuzzySet fs  = new FuzzySet();
        FuzzySet fs1 = new FuzzySet();
        FuzzySet result = new FuzzySet();
        
//        fs.addPoint(-2.0, 0.0);
//        fs.addPoint(0.0, 1.0);
//        fs.addPoint(2.0, 0.0);
//        
//        fs2.newGaussian(0.0, 2.0);
//        fs3.newTrapezium(0.0, 3.0, 1.0);
//        fs4.newTriangle(0.0, 1.0);
        
        fs.newTriangle(0.0, 2.0);  
        fs1.newTriangle(0.0, 2.0); 
        result.addPoint(-2.0, 0.0);
        result.addPoint(0.0, 0.0);
        result.addPoint(2.0, 0.0);
        
        
        System.out.println( fs );
        //fs.fuzzyfy(-1);
        System.out.println( fs1 );
        
        
        Norm op = OperationCreator.newNorm(TNorm.TN_MINIMUM);
                
        FuzzySet.processSetsWithNorm(fs, fs1, result, op);
        //FuzzySet.processSetsWithNorm(fs4, fs4, fs4, op);
                
        result.PackFlatSections(); //- Metoda usuwająca niepotrzebne punkty
        
        System.out.println("Zbiór fs: " + fs);
        System.out.println("Zbiór fs4: " + fs1);
        System.out.println("Wynik operacji (iloczyn): " + result);
        
       
        
        
// Działanie fuzzyfy        
//        System.out.println( fs );
//        fs.fuzzyfy(-1);
//        System.out.println( fs );
        
    }
    
}