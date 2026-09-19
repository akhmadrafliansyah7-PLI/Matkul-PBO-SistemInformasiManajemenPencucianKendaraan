/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistempencuciankendaraanpart2;

/**
 *
 * @author Lenovo GK
 */
import com.mycompany.sistempencuciankendaraanpart2.view.MenuView;
import com.mycompany.sistempencuciankendaraanpart2.controller.MenuController;

public class SistemPencucianKendaraanPart2{
    
    public static void main(String[] args){
        
        MenuView view = new MenuView();
        MenuController controller = new MenuController(view);
        
        controller.jalankanProgram();
    }
}
        