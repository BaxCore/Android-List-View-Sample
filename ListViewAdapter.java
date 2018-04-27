package techplus.ug.campus;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by nahabwe on 1/18/18
 * Campus.
 * A reusable adapter class for all the list view elements
 */

public class ListViewAdapter extends ArrayAdapter {

    private String[] titleArray;
    private String[] descArray;
    @LayoutRes
    private int listHolder;
    @IdRes
    private int mainItem;
    @IdRes
    private int subItem;

    /**
     * This constructor handles all instance variable declarations
     *
     * @param listHolder   The layout view that contains the list view elememts(Main item and subtime)
     * @param mainItem     Serves as the main item of the list view. is returned with listView.getItemAt(index)
     * @param subItem      The subitem or a brief description of the listview
     * @param context      The context to be passed to the superclass constructor
     * @param titles       An array of titles to be fed into the listview
     * @param descriptions String array of descriptions to the titles
     */
    ListViewAdapter(@LayoutRes int listHolder, @IdRes int mainItem, @IdRes int subItem, Context context, String[] titles, String[] descriptions) {
        super(context, listHolder, mainItem, titles);
        this.descArray = descriptions;
        this.titleArray = titles;
        this.listHolder = listHolder;
        this.mainItem = mainItem;
        this.subItem = subItem;
    }

    /**
     * Overridden method that returns a row of the list view
     *
     * @param position    An iterating variable for the supplied arrays
     * @param ConvertView A view variable that holds the list row after is is inflated
     * @param parent      The views parent
     * @return After the items of convertView have been populated, the row is returned to the caller
     */
    @NonNull
    @Override
    public View getView(int position, View ConvertView, @NonNull ViewGroup parent) throws NullPointerException {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ConvertView = inflater.inflate(listHolder, parent, false);
        TextView myTitle = ConvertView.findViewById(mainItem);
        TextView mydesc = ConvertView.findViewById(subItem);
        myTitle.setText(titleArray[position]);
        mydesc.setText(descArray[position]);
        return ConvertView;
    }

}
