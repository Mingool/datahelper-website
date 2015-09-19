package edu.hebut.dh.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport implements Serializable {
	private InputStream inputStream;
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	/**
	 * ÏÂÔØSDK
	 * 
	 * @return
	 */
	public String downloadSDK() {
		String path = ServletActionContext.getServletContext().getRealPath(
				"/download/Hebut-FexUtils-all.rar");
		// String path =
		// "C:\\apache-tomcat-7.0.55\\webapps\\xdatahelp\\download\\Hebut-FexUtils-all.rar";
		try {
			this.inputStream = new FileInputStream(new File(path));
			this.fileName = "Hebut-FexUtils-all.rar";
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	/**
	 * ÏÂÔØAPI
	 * 
	 * @return
	 */
	public String downloadAPI() {
		String path = ServletActionContext.getServletContext().getRealPath(
				"/download/Hebut-FexUtils-all.rar");
		try {
			this.inputStream = new FileInputStream(new File(path));
			this.fileName = "FexUtils-apidocs.rar";
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
