package com.corcow.hw.samplelistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by multimedia on 2016-01-08.
 */
public class MyAdapter extends BaseAdapter {

    List<ViewItem> items = new ArrayList<ViewItem>();

    public void add(String name, String message){
        ViewItem item = new ViewItem(); //객체생성
        item.name = name;
        item.message = message;
        items.add(item);
    }

    @Override
    public int getCount() { // 아이템의  갯수
        return items.size();
    }

    @Override
    public Object getItem(int position) { // position위치의 아이템을 불러옴
        return getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemView view;
        //몰라 모르겠어
        if (convertView == null) {
            view = new ItemView(parent.getContext());
        } else {
            view = (ItemView) convertView;
        }

        view.setItemText(items.get(position));
        return view;
    }
}
