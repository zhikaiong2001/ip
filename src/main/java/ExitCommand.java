public class ExitCommand extends Command {
    public ExitCommand(TaskList tasks, Ui ui, Storage storage) {
        super(tasks, ui, storage);
    }

    @Override
    public void execute() {
        ui.showGoodbye();
        storage.save(tasks);
        System.exit(0);
    }
}
