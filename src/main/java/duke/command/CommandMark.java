package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class CommandMark extends Command{
    private int index;
    private boolean mark;

    /**
     * Returns a mark/unmark command.
     * @param command full unparsed command.
     * @param index index of task to be marked/unmarked.
     * @param mark whether to mark or unmark.
     */
    public CommandMark(String command, int index, boolean mark) {
        super(command);
        this.index = index;
        this.mark = mark;
    }

    /**
     * Marks the specified task in the task list.
     * @param taskList contains the task list.
     * @param ui deals with interactions with the user.
     * @param storage deals with loading and saving tasks from file.
     */
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        taskList.markTask(index, mark);
        if (mark) {
            System.out.println("Nice! I've marked this task as done:");
        } else {
            System.out.println("OK, I've marked this task as not done yet:");
        }
        System.out.printf(taskList.getTask(index).toString() + "\n");

        storage.writeArray(taskList);
    }
}
