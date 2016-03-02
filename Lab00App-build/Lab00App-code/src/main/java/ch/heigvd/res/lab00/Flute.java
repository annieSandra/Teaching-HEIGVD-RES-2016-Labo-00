/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author annie
 */
public class Flute implements IInstrument{
   public String play(){
      return null;
   }
   public int getSoundVolume(){
      return sound;
   }
   public String getColor(){
      return null;
   }
   private int sound = 5;
}
