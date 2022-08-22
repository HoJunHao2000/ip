import java.io.IOException;

public class UnMarkCommand extends Command {
    private final int num;

    public UnMarkCommand(int num) {
        this.num = num;
    }

    @Override
    public void run(TaskList tasks, Ui ui, Storage storage) throws IOException {
        Task task = tasks.getTask(this.num);
        task.unMarkDone();
        ui.printUnMark(task);
        storage.writeFile(tasks);
    }
}
