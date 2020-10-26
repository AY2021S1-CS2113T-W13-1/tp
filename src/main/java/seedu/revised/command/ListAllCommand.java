package seedu.revised.command;

import seedu.revised.command.subject.SubjectCommand;
import seedu.revised.list.SubjectList;
import seedu.revised.storage.Storage;
import seedu.revised.ui.Ui;

import java.util.logging.Logger;

public class ListAllCommand extends Command {
    private static final Logger logger = Logger.getLogger(ListAllCommand.class.getName());

    /**
     * List all subjects, topics, tasks, and flashcards.
     *
     * @param subjectList the <code>SubjectList</code> instance of the <code>SubjectList</code>
     *                    class for the user to list subjects from
     * @param storage     Does nothing in this case but needed since this method was implemented
     *                    from an abstract class
     */
    public void execute(SubjectList subjectList, Storage storage) {
        logger.info("Begin listing all subjects, topics, tasks, and flashcards.");
        Ui.printAll(subjectList.getList());
        logger.info("Finished listing all subjects, topics, tasks, and flashcards.");
    }

    /**
     * Checks whether the the user exits the program.
     *
     * @return <code>true</code> If user exits the program
     */
    public boolean isExit() {
        return false;
    }
}
