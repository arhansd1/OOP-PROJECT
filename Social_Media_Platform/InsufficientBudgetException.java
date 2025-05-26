package com.socialmedia;

public class InsufficientBudgetException extends Exception {
    public InsufficientBudgetException(int currentBudget, int requestedAmount) {
        super(String.format("Insufficient budget to offer this amount. Current budget: $%d, Requested amount: $%d", 
              currentBudget, requestedAmount));
    }
} 