package com.dominio.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;

import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

//@ManagedBean(name="uploadBean") //pra buscar no xhtml com #{uploadBean.metodo}, sem esse cara@Managed o jsf nao sabe q essa classe existe
@Named("downloadBean")
@RequestScoped // O bean vive só durante a requisição HTTP.
public class DownloadBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private StreamedContent file;
    
    
  {
    	try {
			InputStream inputStream = this.getClass().getResourceAsStream("Excecoespdf.pdf"); //nao consegui passando outro caminho, só foi na msm pasta da controller
			file = new DefaultStreamedContent(inputStream , "application/pdf", "download-prime.pdf");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
    

	public StreamedContent getFile() {
		return file;
	}

	public void setFile(StreamedContent file) {
		this.file = file;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}