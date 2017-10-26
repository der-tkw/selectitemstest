package de.timbooo.selectitemstest;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * $Id: $
 * $LastChangedBy: $
 * $LastChangedRevision: $
 * $LastChangedDate: $
 * </pre>
 *
 * @author tiweller
 */
@Named
@SessionScoped
public class SelectItemsBean implements Serializable {
    private String value1;
    private String value2;
    private String value3;
    private List<SelectItem> items;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public List<SelectItem> getItems() {
        if (items == null) {
            items = new ArrayList<>();
            items.add(new SelectItem(null, "--- Select Item ---"));
            items.add(new SelectItem("item1", "Item 1"));
            items.add(new SelectItem("item2", "Item 2"));
            items.add(new SelectItem("item3", "Item 3"));
        }
        return items;
    }

    public void setItems(List<SelectItem> items) {
        this.items = items;
    }
}
