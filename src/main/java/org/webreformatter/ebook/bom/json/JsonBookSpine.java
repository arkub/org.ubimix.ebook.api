/**
 * 
 */
package org.webreformatter.ebook.bom.json;

import java.util.List;

import org.webreformatter.ebook.BookId;
import org.webreformatter.ebook.bom.IBook.IBookSpine;

/**
 * @author kotelnikov
 */
public class JsonBookSpine extends JsonBookBase implements IBookSpine {

    public static IJsonValueFactory<JsonBookSpine> FACTORY = new IJsonValueFactory<JsonBookSpine>() {
        public JsonBookSpine newValue(Object object) {
            return new JsonBookSpine().setJsonObject(object);
        }
    };

    /**
     * 
     */
    public JsonBookSpine() {
    }

    /**
     * @see org.webreformatter.ebook.bom.IBook.IBookSpine#getSectionIds()
     */
    public List<BookId> getSectionIds() {
        return getList("itemref", ID_FACTORY);
    }

    public JsonBookSpine setSectionIds(List<BookId> ids) {
        setValue("itemref", ids);
        return cast();
    }

}
