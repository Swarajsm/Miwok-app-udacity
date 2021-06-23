package in.swarajmahindre.miwokapp;

public class Word {
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;


    private int mimageResourceID =NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
            ;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int imageResourceID){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mimageResourceID= imageResourceID;
    }

    /**
     * Get the default translation of the word.
     */

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getimageResourceID(){
        return mimageResourceID;
    }

    public boolean hasImage() {
        return mimageResourceID != NO_IMAGE_PROVIDED;
    }
}
