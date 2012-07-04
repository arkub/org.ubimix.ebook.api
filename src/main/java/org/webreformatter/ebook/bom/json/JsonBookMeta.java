package org.webreformatter.ebook.bom.json;

import org.webreformatter.ebook.BookId;
import org.webreformatter.ebook.bom.IBook.IBookMetadata;

/**
 * @author kotelnikov
 */
public class JsonBookMeta extends JsonBookBase implements IBookMetadata {

    public static IJsonValueFactory<JsonBookMeta> FACTORY = new IJsonValueFactory<JsonBookMeta>() {
        public JsonBookMeta newValue(Object object) {
            return new JsonBookMeta().setJsonObject(object);
        }
    };

    public String getBookCreator() {
        return getString("dc:creator");
    }

    public BookId getBookIdentifier() {
        return getValue("dc:ID", ID_FACTORY);
    }

    public String getBookLanguage() {
        return getString("dc:language");
    }

    public String getBookTitle() {
        return getString("dc:title");
    }

    public JsonBookMeta setBookCreator(String value) {
        setValue("dc:creator", value);
        return cast();
    }

    public JsonBookMeta setBookIdentifier(BookId value) {
        setValue("dc:ID", value);
        return cast();
    }

    public JsonBookMeta setBookLanguage(String value) {
        setValue("dc:language", value);
        return cast();
    }

    public JsonBookMeta setBookTitle(String value) {
        setValue("dc:title", value);
        return cast();
    }

}
