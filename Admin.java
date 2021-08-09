/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srijonashraf.atm;

public class Admin implements Account_Info,Account_Balance{

   
    private int inputBalance=0;
    
    public int balance=0;

    
    public void setBalance(int setBalance){
    
        this.inputBalance=setBalance;
    }
    
    public void sumation(){
    
      balance = balance + inputBalance;
    }
    
        public void minus(){
    
       balance = balance - inputBalance ;
    }

    public int getBalance(){
        return balance;
    }
    
    
    public void reset(){
    
       balance =customerBalance;
    }


}

//Srijon Ashraf