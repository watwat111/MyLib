package createFile;

import java.io.File;
import java.util.Calendar;

public class CreateFile {

	public static String createFileByData(String masterPath,String subPath){
		Calendar now = Calendar.getInstance();
		String saveFilePath = masterPath + "\\" + now.get(Calendar.YEAR) + "_" + (now.get(Calendar.MONTH) + 1) + "_"
				+ now.get(Calendar.DAY_OF_MONTH) + subPath;

		File newdir = new File(saveFilePath);
		if (newdir.exists()) {

		} else {
			newdir.mkdirs();
		}

		return saveFilePath;
	}

	public static String createNowDataPath(){
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR) + "_" + (now.get(Calendar.MONTH) + 1) + "_"
				+ now.get(Calendar.DAY_OF_MONTH);
	}


}
