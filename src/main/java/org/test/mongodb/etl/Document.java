package org.test.mongodb.etl;

import java.io.Serializable;

import javax.persistence.Transient;

public class Document implements Serializable {

	private static final long serialVersionUID = -7385387904549876229L;

	@Transient
	@org.mongodb.morphia.annotations.Transient
	private DocumentMetaData metaData;

	/**
	 * @return the metaData
	 */
	public DocumentMetaData getMetaData() {
		return metaData;
	}

	/**
	 * @param metaData
	 *            the metaData to set
	 */
	public void setMetaData(DocumentMetaData metaData) {
		this.metaData = metaData;
	}

}
