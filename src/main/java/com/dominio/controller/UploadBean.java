package com.dominio.controller;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import java.io.Serializable;



//@ManagedBean(name="uploadBean") //pra buscar no xhtml com #{uploadBean.metodo}, sem esse cara@Managed o jsf nao sabe q essa classe existe
@Named("uploadBean")
@RequestScoped //O bean vive só durante a requisição HTTP.
public class UploadBean implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	
	private UploadedFile file;
	
	private boolean flagChamarDownload = false;
	
	public void settar() {
		this.flagChamarDownload =true;
	}

	public boolean isFlagChamarDownload() {
		return flagChamarDownload;
	}

	public void setFlagChamarDownload(boolean flagChamarDownload) {
		this.flagChamarDownload = flagChamarDownload;
	}

	public UploadedFile getFile()
	{
		return file;
	}
	
	public void setFile(UploadedFile file) {
		this.file = file;
	}
	
	                                                            
//			System.out.println("Recebdio "+file.getFileName());
//		} else {
//			System.out.println("Nada recebido");
//		}
//	}
	
	public void handleFileUpload(FileUploadEvent event) {
		UploadedFile file1 = event.getFile();
		//application code
		System.out.println("O arquivo se chama "+file1.getFileName());
		this.file = file1;
		}
	
}
