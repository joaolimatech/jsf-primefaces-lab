package com.dominio.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.dominio.model.TimeVO;

@ManagedBean
@ViewScoped
public class TextAreaBean {

	private String inputTimes;
	private List<TimeVO> lstTimes;
	private boolean flagPanelExecutar = false;
	private TimeVO time;
	
	
	public TimeVO getTime() {
		return time;
	}
	public void setTime(TimeVO time) {
		this.time = time;
	}
	public boolean isFlagPanelExecutar() {
		return flagPanelExecutar;
	}
	public void setFlagPanelExecutar(boolean flagPanelExecutar) {
		this.flagPanelExecutar = flagPanelExecutar;
	}
	public String getInputTimes() {
		return inputTimes;
	}
	public void setInputTimes(String inputPessoas) {
		this.inputTimes = inputPessoas;
	}
	public List<TimeVO> getLstTimes() {
		return lstTimes;
	}
	public void setLstTimes (List<TimeVO> asd) {
		this.lstTimes = asd;
	}
	
	public void executar() {
		this.flagPanelExecutar = true;
		lstTimes = new ArrayList<>();
		 lstTimes.add(new TimeVO("Real Madrid", 1902, 115.0, true));
		    lstTimes.add(new TimeVO("Manchester City", 1880, 117.5, true));
		    lstTimes.add(new TimeVO("Napoli", 1926, 75.0, false));
		    lstTimes.add(new TimeVO("Roma", 1900, 22.0, true));
		    lstTimes.add(new TimeVO("RB Leipzig", 2009, 55.0, false));
		    lstTimes.add(new TimeVO("PSG", 1970, 222.0, true));
		    lstTimes.add(new TimeVO("Arsenal", 1904, 127.0, false));
		    lstTimes.add(new TimeVO("Bayern de Munique", 1900, 80.0, true)); 
	}
	
	
	
	
	
}
