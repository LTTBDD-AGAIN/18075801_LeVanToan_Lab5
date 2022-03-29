package com.example.a18075801_levantoan_lab5.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a18075801_levantoan_lab5.R;
import com.example.a18075801_levantoan_lab5.activity.DetailDonut;
import com.example.a18075801_levantoan_lab5.activity.MainActivity;
import com.example.a18075801_levantoan_lab5.model.Donut;

import java.util.ArrayList;
import java.util.List;

public class DonutAdapter extends BaseAdapter {
    private Context mContext;
    private int mIdLayout;
    private List<Donut> mListDonut;
    private int positionSelected = -1;

    public DonutAdapter(Context context, int idLayout, List<Donut> listDonut){
        this.mContext = context;
        this.mIdLayout = idLayout;
        this.mListDonut = listDonut;
    }

    @Override
    public int getCount() {
        if(mListDonut.size() != 0 && !mListDonut.isEmpty()){
            return mListDonut.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(mIdLayout,parent ,false);
        }

        ImageView mImgView = (ImageView) convertView.findViewById(R.id.imgViewDonut);
        TextView mTvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView mTvDesc = (TextView) convertView.findViewById(R.id.tvDesc);
        TextView mTvPrice = (TextView) convertView.findViewById(R.id.tvPrice);
        ImageButton mImgButtonPlus = (ImageButton) convertView.findViewById(R.id.imgButtonPlus);
        final LinearLayout mLinearLayout = (LinearLayout) convertView.findViewById(R.id.linearLayout);
        final Donut donut = mListDonut.get(position);

        if(mListDonut.size() != 0 && !mListDonut.isEmpty()){
            mTvName.setText(donut.getName());
            mTvDesc.setText(donut.getDesc());
            mTvPrice.setText(String.valueOf(donut.getPrice()));

            int idItem = donut.getId();
            switch (idItem){
                case 1:
                    mImgView.setImageResource(R.drawable.donut_yellow);
                    break;
                case 2:
                    mImgView.setImageResource(R.drawable.tasty_donut);
                    break;
                case 3:
                    mImgView.setImageResource(R.drawable.green_donut);
                    break;
                case 4:
                    mImgView.setImageResource(R.drawable.donut_red);
                    break;
                default:
                    break;
            }
        }

        mImgButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

            }
        });

        if (positionSelected == position){
            mLinearLayout.setBackgroundColor(Color.RED);
        }else {
            mLinearLayout.setBackgroundColor(Color.WHITE);
        }

        return convertView;
    }
}
