package com.hung;

public class Student extends Person implements StudentAction{
    private String certificate;

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public void goToClass() {
            System.out.println(this.getName() + " Go to class");
    }

    public void takeExam() {
        System.out.println(this.getName() + " take exam");
    }
}
