# User Guide

---

* Quick Start
* Features
  * Viewing help: `help`
  * Adding a person: `add`
  * Deleting a person: `delete`
  * Listing all contacts: `list`
  * Locating persons by name/tags: `find`
  * Add an image for contacts: `add-image`
  * Delete an image for contacts: `delete-image`
  * Quick import admin contacts: `import`
* FAQ
* Command summary

---

## Quick start

1. Ensure you have Java `11` or above installed in your computer.
2. Download the latest `bookface.jar` from [here](https://github.com/AY2223S2-CS2103-F11-4/tp/releases).
3. Place `bookface.jar` file in the folder you would like to use as the *home directory*.
4. Run the application. The following GUI will appear upon first use of the application. 
![GUI upon first use](images/GUIOnInitialUsage.png)
   
5. The application is initially loaded with sample data for new users to try out the [features](##Features) listed below.
Experienced users can delete the sample data and proceed with regular usage.
   
---

## Features

## Help command: `help`

Shows a link to the user guide to help new users get familiar with the commands for the application.

Format: `help`

## Add user contacts: `add`

Format: `add [name] [year/course] [phone number] [email] [address]` Optional to add: `t/TAGS`

* User is *required* to enter **name, status, phone number, email, address**
* Tags can be optional
* If the account exists, user can add in related field of interests to share with others

Example:
* `add n/Shenghan s/Year2 Computer-science p/99999999 e/david@gmail.com a/punngol place 696a #12-348` will displays the
  necessary basic information that are the user's name, year/course, phone number, email, address. Optional fields are tags,
  for which there are commitment/cca tags, module tags and lastly the general tags for users to enter non-specific typed tags.

Example (with the addition of tags):
* `add n/Shenghan s/Year2 Computer-science p/99999999 e/david@gmail.com a/punngol place 696a #12-348 t/developer ct/soccer
  mt/cs2103` Note that the tags can be placed in any part of the command, and it will not break!

Tags are categorised according to tag colors:
* Commitment tags: `coral pink`
* Module tags: `Dark green`
* General tags: `default blue`

## Delete user contacts: `delete`

Delete a contact.
Format: `delete INDEX`

* Show contact details specified by `INDEX`
* The index refers to the index number shown in the displayed person list.
* The index *must* be a positive integer 1, 2, 3, …
* Extra: Will prompt user to re-confirm again before the contact is erased from BookFace
  Example:
* `delete 2` Brings up the 2nd person in the address book and prompt user to confirm before deleting.

### Listing all contacts: `list`

List all contacts in the address book.

Format: `list`

### Locating persons by name/tags: `find`

Finds persons whose names contain any of the given keywords.

Format: `find KEYWORD [MORE_KEYWORDS]`

* The search is case-insensitive e.g. `hans` will match `Hans`
* The order of the keywords does not matter e.g. `Hans Bo` will match `Bo Hans`
* Only the name is searched
* Only full words will be matched e.g. `Han` will not match `Hans`
* Persons matching at least one keyword will be returned (i.e. `OR` search) e.g. `Hans Bo` will return `Hans Gruber`
  , `Bo Yang`

### Add an image for contacts

Add a contact image for each contact.

Format: `add-image INDEX [PATH-TO-IMAGE]`

* Adds an image to the contact at the specified `INDEX`
* The index refers to the index number shown in the displayed person list.
* The index **must be a positive integer** 1, 2, 3,...
* If the image cannot be found or user did not specify a contact image, a default image will be used

> **Note:** The `[PATH-TO-IMAGE]` provided must be an absolute path, and should not be provided in quotation marks.
> For instance: `add-image 2 "C:/Users/user/Downloads/weekiat.png"` will be invalid, whereas 
> `add-image 2 C:/Users/user/Downloads/weekiat.png` will be valid.

Examples:

* `list` followed by `add-image 2 C:/Users/user/Downloads/weekiat.png` adds the image `weekiat.png` to the 2nd person in the address book

## Delete an Image for contacts

Delete the image of a contact.

Format: `delete-image INDEX`

* Deletes the image of contact specified by `INDEX`
* The index refers to the index number shown in the displayed person list.
* The index *must* be a positive integer 1, 2, 3, …
* A default image will be used after it is deleted

Example:
* `delete-image 2` deletes the image of the 2nd person in the address book.

## Quick Import for admin contacts: `import`

Import administrative contacts for relevant faculties.

Format: `import [faculty]`

* Faculty acronyms (e.g. soc)
* Only selected faculties will be available

Example:

* `import soc` adds all important administrative contact for School of Computing
* `import chs` adds all important administrative contact for College of Humanities and Sciences

---

## Command summary

| Action           | Format, Examples                                                                                                                                                                                                                   |
|------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Add**          | `add n/NAME y/YEAR COURSE p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG, ct/COMMITMENT_TAG, mt/MODULE_TAG]…​` <br> e.g., `add n/James Ho y/y2-science p/22224444 e/jamesho@example.com a/123, Clementi Rd, 1234665 ct/soccer mt/cs1010s` |
| **Delete**       | `delete INDEX`<br> e.g., `delete 3`                                                                                                                                                                                                |
| **Edit**         | `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]…​`<br> e.g.,`edit 2 n/James Lee e/jameslee@example.com`                                                                                                        |
| **Find**         | `find KEYWORD [MORE_KEYWORDS]`<br> e.g., `find James Jake`                                                                                                                                                                         |
| **List**         | `list`                                                                                                                                                                                                                             |
| **Help**         | `help`                                                                                                                                                                                                                             |
| **Add-Image**    | `add-image INDEX [PATH-TO-IMAGE]` <br> e.g., `add-image 2 C:/Users/user/Downloads/weekiat.png`                                                                                                                                                             |
| **Delete-Image** | `delete-image INDEX` <br> e.g.,  `delete-image 2`                                                                                                                                                                                  |                                                                                                                       |
| **Import**       | `import [faculty]` <br> e.g.,  `import soc, import chs`                                                                                                                                                                            |

