package com.aspose.cloud.cells.examples.tasks;

import java.util.ArrayList;
import java.util.List;

import com.aspose.cloud.cells.api.CellsTaskApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.SplitWorkbookTaskParameter;
import com.aspose.cloud.cells.model.TaskData;
import com.aspose.cloud.cells.model.TaskDescription;

public class CellsTaskApiExamples extends Base{

	private final CellsTaskApi api = new CellsTaskApi();

	

	public void cellsTaskPostRunTaskExample() throws ApiException {
		String name = BOOK1;

		String folder = TEMPFOLDER;
		TaskData taskData = new TaskData();
		List<TaskDescription> tasks = new ArrayList<TaskDescription>();
		TaskDescription task1 = new TaskDescription();
		task1.setTaskType("SplitWorkbook");

		SplitWorkbookTaskParameter param1 = new SplitWorkbookTaskParameter();
		param1.setDestinationFileFormat("xlsx");

		FileSource fs = new FileSource();
		fs.setFilePath(TEMPFOLDER);
		fs.setFileSourceType("CloudFileSystem");
		param1.setDestinationFilePosition(fs);
		param1.setSplitNameRule("sheetname");
		FileSource ds = new FileSource();
		ds.setFilePath(TEMPFOLDER + "\\" + BOOK1);
		ds.setFileSourceType("CloudFileSystem");
		param1.setWorkbook(ds);

		task1.setTaskParameter(param1);
		tasks.add(task1);
		taskData.setTasks(tasks);
		taskData.getTasks().add(task1);
		api.setApiClient(Base.Ready(folder, name));
		Object response = api.cellsTaskPostRunTask(taskData);
		
		System.out.print(response);

	}

}
