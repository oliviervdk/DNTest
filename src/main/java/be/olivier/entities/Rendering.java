package be.olivier.entities;

import java.io.Serializable;

public class Rendering implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private StartRendering startRendering;
	private GetRendering getRendering;
	private Document document;
	public Rendering(StartRendering startRendering, GetRendering getRendering, Document document) {
		this.startRendering = startRendering;
		this.getRendering = getRendering;
		this.document = document;
	}
	public StartRendering getStartRendering() {
		return startRendering;
	}
	public GetRendering getGetRendering() {
		return getRendering;
	}
	public Document getDocument() {
		return document;
	}
}
