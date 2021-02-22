package org.test.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;

public class PdfMerger {

	/**
	 * Manipulates a PDF file src with the file dest as result
	 * 
	 * @param src  the original PDF
	 * @param dest the resulting PDF
	 * @throws IOException
	 * @throws DocumentException
	 */
	public void merge(String dest, String... files) throws IOException, DocumentException {
		Document document = new Document();
		PdfCopy copy = new PdfCopy(document, new FileOutputStream(dest));
		document.open();
		List<PdfReader> readers = new ArrayList<PdfReader>();
		for (String file : files) {
			PdfReader input = new PdfReader(file);
			readers.add(input);
			copy.addDocument(input);
		}
		document.close();
		for (PdfReader reader : readers) {
			reader.close();
		}
	}

	/**
	 * Main method.
	 * 
	 * @param args no arguments needed
	 * @throws DocumentException
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException, DocumentException {
		File file = new File("C:\\Users\\vekoti\\Google Drive\\Narmadha\\Passport.pdf");
		file.getParentFile().mkdirs();
		new PdfMerger().merge(file.getAbsolutePath(), "C:\\Users\\vekoti\\Google Drive\\Narmadha\\Narmadha Koti - Passport New.pdf",
				"C:\\Users\\vekoti\\Google Drive\\Narmadha\\Narmadha Canada Visa.pdf");
	}

}
