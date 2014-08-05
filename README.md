Tracchis-DownloadManager
========================

A basic file download manager which manages different threads with auto-resume capabilities.

TO Test out the download ::

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
			
Improvements 
========================
** Build up a GUI to support the download.
** Port it to a portable executable.
