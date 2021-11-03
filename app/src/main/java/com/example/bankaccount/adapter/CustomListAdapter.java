package com.example.bankaccount.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.bankaccount.R;
import com.example.bankaccount.model.Service;

import java.util.List;

public class CustomListAdapter  extends BaseAdapter{

    private List<Service> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(Context aContext,  List<Service> trans) {
        this.context = aContext;
        this.listData = trans;
        Log.d("cuissto","size = "+ listData.size());
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.iconView = (ImageView) convertView.findViewById(R.id.imageItem);
            holder.ServiceDescView = (TextView) convertView.findViewById(R.id.Desc);
            holder.montantView = (TextView) convertView.findViewById(R.id.montant);
            holder.DateView = (TextView) convertView.findViewById(R.id.Date);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Service service = this.listData.get(position);
        Log.d("cuissto",service.getMontant());
        holder.ServiceDescView.setText(service.getServiceName());
        holder.DateView.setText(service.getDate());
        holder.montantView.setText(service.getMontant());
        int imageId = this.getMipmapResIdByName(service.getImageName());

        holder.iconView.setImageResource(imageId);


        return convertView;

}

    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView iconView;
        TextView ServiceDescView;
        TextView DateView;
        TextView montantView;
    }
}
