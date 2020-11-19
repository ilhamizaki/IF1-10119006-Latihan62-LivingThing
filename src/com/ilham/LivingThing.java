/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : class abstract LivingThing
 */
public abstract class LivingThing {
    
    public void walk(String nama) {
        System.out.println(nama + " sedang berjalan");
    };
    
    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    };
    
    public void eat(String nama) {
        System.out.println(nama + " Makan");
    };
}
