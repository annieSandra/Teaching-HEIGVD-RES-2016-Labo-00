/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author annie
 */
public class Orchestra {
   public Orchestra(){
      listInstru = new LinkedList<IInstrument>();
   }
   
   int getNumberOfInstruments(){
      return listInstru.size();
   }
   void addInstrument(IInstrument a){
        listInstru.add(a);
   }
   List<String>makeMusic(){
      List<String> play = new LinkedList<String>();
       for(int i=0; i < listInstru.size();++i)
          play.add(listInstru.get(i).play());
       return play;
    
   }
   List<IInstrument> listInstru;
}
