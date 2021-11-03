package com.example.bankaccount.model;

public class Service  {
    private String imageName;
    private String ServiceName;
    private String Montant;

    public Service(String imageName, String serviceName, String montant, String date) {
        this.imageName = imageName;
        ServiceName = serviceName;
        Montant = montant;
        Date = date;
    }

    private String Date;

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }





    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public String getMontant() {
        return Montant;
    }

    public void setMontant(String montant) {
        Montant = montant;
    }

    public String getDate() {
        return Date;
    }

    @Override
    public String toString() {
        return "Service{" +
                "imageName='" + imageName + '\'' +
                "ServiceName='" + ServiceName + '\'' +
                ", Montant='" + Montant + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }

    public void setDate(String date) {
        Date = date;
    }
}
