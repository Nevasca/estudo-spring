package br.com.estudo.model;

public class MetaReport {
	
	private int metaMinutes;
	private int exercicioMinutes;
	private String exercicioActivity;
	
	public MetaReport(int metaMinutes, int exercicioMinutes, String exercicioActivity) {
		this.metaMinutes = metaMinutes;
		this.exercicioMinutes = exercicioMinutes;
		this.exercicioActivity = exercicioActivity;
	}
	
	public int getMetaMinutes() {
		return metaMinutes;
	}
	public void setMetaMinutes(int metaMinutes) {
		this.metaMinutes = metaMinutes;
	}
	public int getExercicioMinutes() {
		return exercicioMinutes;
	}
	public void setExercicioMinutes(int exercicioMinutes) {
		this.exercicioMinutes = exercicioMinutes;
	}
	public String getExercicioActivity() {
		return exercicioActivity;
	}
	public void setExercicioActivity(String exercicioActivity) {
		this.exercicioActivity = exercicioActivity;
	}			
}
