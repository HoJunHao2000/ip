package duke.command;

import duke.storage.Storage;

import duke.task.Task;
import duke.task.TaskList;

import duke.ui.Ui;

import java.io.IOException;

public class MarkCommand extends Command {

    private final int num;

    public MarkCommand(int num) {
        this.num = num;
    }

    @Override
    public void run(TaskList tasks, Ui ui, Storage storage) throws IOException {
        Task task = tasks.getTask(this.num);
        task.markDone();
        ui.printMark(task);
        storage.writeFile(tasks);
    }
}
