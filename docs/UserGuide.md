## Delete Image for contacts


Delete image of a contact.
Format: `delete-image INDEX`
* Delete image of contact specified by `INDEX`
* The index refers to the index number shown in the displayed person list.
* The index *must* be a positive integer 1, 2, 3, …
* The image must be placed in a specific folder for BookFace to locate
* A default image will be used after it is deleted
  Example:
* `delete-image` 2 deletes the image of the 2nd person in the address book.


## View Image for contacts


View image of a contact.
Format: `view-image INDEX`
* Show image of the contact specified by `INDEX`
* The index refers to the index number shown in the displayed person list.
* The index *must* be a positive integer 1, 2, 3, …
* The image must be placed in a specific folder for BookFace to locate
* If the image cannot be found or user did not specify a contact image, a default image will be used
  Example:
* `view-image` 2 Brings up the image of the 2nd person in the address book.


## Quick Import for admin contacts: `import`


Import administrative contacts for relevant faculties.
Format: `import [faculty]`
* Faculty acronyms (e.g. soc)
* Only selected faculties will be available


Example:
* `import soc` adds all important administrative contact for School of Computing
* `import chs` adds all important administrative contact for College of Humanities and Sciences
