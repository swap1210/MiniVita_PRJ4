/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;

/**
 *
 * @author swapn
 */
public class Funding implements Serializable{
    // Attributes of the Funding class
    private String name;
    private double amount;
    private FundingEntity fundingEnity;
        
    // Getters and setters for the attributes of the Funding class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public FundingEntity getFundingEnity() {
        return fundingEnity;
    }

    public void setFundingEnity(FundingEntity fundingEnity) {
        this.fundingEnity = fundingEnity;
    }
    
    
}
