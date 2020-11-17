package com.example.gridview;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] numberWord;
    private int[] numberImage;

    public MainAdapter(Context c, String[] numberWord, int[] numberImage) {
        context = c;
        this.numberWord = numberWord;
        this.numberImage = numberWord;

    }


@Override
public int getCount() {
    return numberWord.length;
}

@Override
public Object getItem(intPosition) {
    return null;
}

@Override
public long getItemId(int position)
    return 0;
        }

 @Override
 public View getView(int position, View convertView, ViewGroup parent) {
    if (inflater == null){
        inflater = (LayoutInflater) context.getSystemService (Context).LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            convertView = inflater.inflate ( R.layout.row_item, root: null );

        }

    }
    ImageView imageView = convertView.findVIewbyId(R.id.image_view);
    TextView textView - convertView.findViewById(R.id.text_view);

    imageView.setImageResources(numberImage[position]);
    textView.setText(numberWord);
    return convertView;

    return null;
        }
public class MainAdapter extends {

}
