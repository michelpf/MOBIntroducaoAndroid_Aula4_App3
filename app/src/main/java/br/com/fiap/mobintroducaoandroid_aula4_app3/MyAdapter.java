package br.com.fiap.mobintroducaoandroid_aula4_app3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.fiap.mobintroducaoandroid_aula4_app3.MyItem;
import br.com.fiap.mobintroducaoandroid_aula4_app3.R;

public class MyAdapter extends BaseAdapter{

    private Context context;
    private List<MyItem> itens;

    private class ViewsInternas {
        ImageView imgIcon;
        TextView txtTitle;
    }

    public MyAdapter(Context context, List<MyItem> itens) {

        this.context = context;
        this.itens = itens;

    }




    @Override
    public View getView(int pos, View view, ViewGroup vg) {

        ViewsInternas v; // será uma nova linha ou uma já existente

        if (view == null) { // verifica se é um novo item na ListView

            view = LayoutInflater.from(context).inflate(R.layout.myadapter, null);
            v = new ViewsInternas();
            v.txtTitle = ((TextView) view.findViewById(R.id.tv));
            v.imgIcon = ((ImageView) view.findViewById(R.id.iv));
            view.setTag(v);

        }  else  v = (ViewsInternas) view.getTag(); // obtém o item atual

        MyItem item = itens.get(pos);
        v.txtTitle.setText(item.getValue());
        v.imgIcon.setImageResource(item.getStatus());
        return view;

    }


    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int i) {
        return itens.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

}

