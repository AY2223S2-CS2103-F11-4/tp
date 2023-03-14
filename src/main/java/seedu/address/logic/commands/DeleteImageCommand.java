package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;

import java.util.List;

/**
 * Deletes the image of the person identified using it's
 * displayed index from the address book, and sets it to
 * a default image.
 */
public class DeleteImageCommand extends Command {

    public static final String COMMAND_WORD = "delete-image";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Deletes the image for the person identified by the index number "
            + "used in the displayed person list.\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 1";

    public static final String MESSAGE_DELETE_IMAGE_SUCCESS = "Deleted Image: %1$s";

    private final Index targetIndex;

    public DeleteImageCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Person> lastShownList = model.getFilteredPersonList();

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        }

        Person personToDelete = lastShownList.get(targetIndex.getZeroBased());
        model.deleteImage(personToDelete);
        return new CommandResult(String.format(MESSAGE_DELETE_IMAGE_SUCCESS, personToDelete));
    }
}
