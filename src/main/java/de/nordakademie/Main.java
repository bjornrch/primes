package de.nordakademie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean [] primes = new boolean [100];
        Arrays.fill ( primes ,true);
        for (int i =2;i< primes . length ;i ++){
            for (int j =2; j*j<i; j ++){
                if (i % j ==0) primes [i]=false;
            }
        }
        try ( FileWriter f = new FileWriter (" out . txt " )){
            for (int i = 1; i < primes . length ; i ++) {
                if ( primes [i]) f. append (i+"\n" );;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}