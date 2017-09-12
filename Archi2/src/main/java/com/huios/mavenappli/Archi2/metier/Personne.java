package com.huios.mavenappli.Archi2.metier;

public class Personne {
	private int num;
	private String prenom;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Personne [num=" + num + ", prenom=" + prenom + "]";
	}
	
}
