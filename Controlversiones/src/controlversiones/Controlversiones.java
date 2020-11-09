/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlversiones;

/**
 *
 * @author nikof
 */
public class Controlversiones {
    private static int x, y, z;

    public static int suma(int x, int y ){
    return x+y;
    }
    public static void main(String[] args) {
        int x = 5, y=3, z;
        z=suma(x, y);
        showResult(z);
    }

    private static void showResult(int z) {
        System.out.println(z);
    }
    
}
