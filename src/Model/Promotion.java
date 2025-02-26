/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Promotion {
    private String promotionId;
    private String eventName;
    private double discountRate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;

    // Constructor, getters, setters, toString

    public Promotion(String promotionId, String eventName, double discountRate, LocalDate startDate, LocalDate endDate, String description) {
        this.promotionId = promotionId;
        this.eventName = eventName;
        this.discountRate = discountRate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Promotion{" + "promotionId=" + promotionId + ", eventName=" + eventName + ", discountRate=" + discountRate + ", startDate=" + startDate + ", endDate=" + endDate + ", description=" + description + '}';
    }
    
}

