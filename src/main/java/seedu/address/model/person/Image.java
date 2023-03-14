package seedu.address.model.person;

/**
 * Represents a Person's image in the address book.
 */
public class Image {

    private static final String DEFAULT_IMAGE = "/images/default_image.png";
    private String imagePath;
    private final String imageName;

    /**
     * Constructs an {@code Image}.
     *
     * @param imageName A valid image name.
     */
    public Image(String imageName) {
        this.imageName = imageName;
    }

    /**
     * Overloaded constructor for a default image.
     */
    public Image() {
        this.imagePath = DEFAULT_IMAGE;
        this.imageName = DEFAULT_IMAGE;
    }

    public String getPath() {
        return this.imagePath;
    }

    @Override
    public String toString() {
        return imageName;
    }

    @Override
    public int hashCode() {
        return imageName.hashCode();
    }
}
