package test.connection;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class ConnectionCheck {

	public static void main(String[] args) {
		list(new File("C:\\ccw\\release\\quoting-coreservices\\coreservices\\src\\main\\java"));
	}

	private static void list(File dir) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				list(file);
			} else {
				checkConnectionClosed(file);
			}
		}
	}

	private static void checkConnectionClosed(File file) {
		try {
			String string = FileUtils.readFileToString(file);
			if (string.contains("DataManager.getInstance().getConnection()")) {
				if (string.contains(".close()")) {

				} else {
					System.out.println(file.getName());
				}
			}
		} catch (Exception exception) {

		}
	}

}
