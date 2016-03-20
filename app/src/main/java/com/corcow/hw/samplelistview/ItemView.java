package com.corcow.hw.samplelistview;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by multimedia on 2016-01-08.
 */
public class ItemView extends FrameLayout {

    TextView nameText;
    TextView messageText;

    public ItemView(Context context) {
        super(context);
        init();
    }

    public void init() {
        inflate(getContext(),R.layout.view_item,this);

        nameText = (TextView)findViewById(R.id.nameText);
        messageText = (TextView)findViewById(R.id.messageText);
    }

    public void setItemText(ViewItem item){
        nameText.setText(item.name);
        messageText.setText(item.message);
    }
}
