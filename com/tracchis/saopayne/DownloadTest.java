/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tracchis.saopayne;

import java.io.IOException;

/**
 *
 * @author saopayne
 */
public class DownloadTest {
    
    
	public static void main(String [] args) {
		DownloadManager downloadManager = DownloadManager.getInstance();
		String qQString = "http://dldir1.qq.com/qqfile/qq/QQ2013/QQ2013Beta2.exe";
		String APK = "http://down.myapp.com/android/45592/881859/qq2013_4.0.2.1550_android.apk";
		String phaseString = "http://dictionary.b0.upaiyun.com/phrase.zip";
		String big = "http://212.187.212.73/bt/58179a08a7873dc2c624c38abfc3f3bebef91d79/data/2012-12-16-wheezy-raspbian.zip";
		String musicString = "http://mac.eltima.com/download/elmediaplayer.dmg";
		String small = "http://res.yyets.com/ftp/2013/0419/YYeTs_2199a2019776bdc256fc3b127b2b93b3.zip";
		String google = "http://down11.zol.com.cn/suyan/ggpy2.1.0.apk";

		/*** type you save directory ****/
		String saveDirectory = "Desktop/myFile";
		try {
			DownloadMission mission = new DownloadMission(qQString,
					saveDirectory, "test1");
			downloadManager.addMission(mission);
			DownloadMission mission2 = new DownloadMission(google,
					saveDirectory, "test2");
			downloadManager.addMission(mission2);
			DownloadMission mission3 = new DownloadMission(big, saveDirectory,
					"test3");
			downloadManager.addMission(mission3);
			downloadManager.start();
			int counter = 0;
			while (true) {
				
				System.out.println("Downloader information Speed:"
						+ downloadManager.getReadableTotalSpeed()
						+ " Down Size:"
						+ downloadManager.getReadableDownloadSize() +
                                            "saved in" +mission.getProgressDir());
				Thread.sleep(1000);
				counter++;
				
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
    
}
