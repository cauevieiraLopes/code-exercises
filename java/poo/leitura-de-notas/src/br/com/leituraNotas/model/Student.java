package br.com.leituraNotas.model;

public class Student {
    private String studentName;

    private double mathGrade;
    private double englishGrade;
    private double portugueseGrade;
    private double scienceGrade;

    private double media;

    //métodos set:
    public void setStudentName(String name) {
        this.studentName = name.toUpperCase();
    }

    public void setMathGrade(double math) {
        this.mathGrade = math;
    }

    public void setEnglishGrade(double english) {
        this.englishGrade = english;
    }

    public void setPortugueseGrade(double portuguese) {
        this.portugueseGrade = portuguese;
    }

    public void setScienceGrade(double science) {
        this.scienceGrade = science;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    //métodos get:
    public String getStudentName() {
        return studentName.toUpperCase();
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public double getPortugueseGrade() {
        return portugueseGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public double getMedia() {
        return media;
    }
}
