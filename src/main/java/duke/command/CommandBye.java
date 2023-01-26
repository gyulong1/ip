package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class CommandBye extends Command{
    /**
     * Returns a bye command.
     * @param command full unparsed command.
     */
    public CommandBye(String command) {
        super(command);
    }

    /**
     * Sends goodbye message to the user.
     * @param taskList contains the task list.
     * @param ui deals with interactions with the user.
     * @param storage deals with loading and saving tasks from file.
     */
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.bye();
    }

    /**
     * Returns whether command is a bye command.
     * @return true.
     */
    @Override
    public boolean isExit() {
        return true;
    }
}
