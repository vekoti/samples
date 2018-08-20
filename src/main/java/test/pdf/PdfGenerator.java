package test.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerator {

	public static final String[] IMAGES = { "C:\\\\Users\\\\vekoti\\\\Google Drive\\\\Ira Koti\\\\IMG_20180708_190929.jpg", };
	public static final String DEST = "C:\\Users\\vekoti\\Google Drive\\Ira Koti\\Birth Certificate.pdf";

	public static void main(String[] args) throws IOException, DocumentException {
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		new PdfGenerator().createPdf(DEST);
	}

	public void createPdf(String dest) throws IOException, DocumentException {
		Image img = Image.getInstance(IMAGES[0]);
		Document document = new Document(img);
		PdfWriter.getInstance(document, new FileOutputStream(dest));
		document.open();
		for (String image : IMAGES) {
			img = Image.getInstance(image);
			document.setPageSize(img);
			document.newPage();
			img.setAbsolutePosition(0, 0);
			document.add(img);
		}
		document.close();
	}

}