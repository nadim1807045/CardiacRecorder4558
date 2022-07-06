package com.example.sqlitecrud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder>
{
  ArrayList<model> dataholder;

    public myadapter(ArrayList<model> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
        Calendar calendar = Calendar.getInstance();
        String CurrentDate= DateFormat.getDateInstance(DateFormat.DATE_FIELD).format(calendar.getTime());
        SimpleDateFormat format= new SimpleDateFormat("HH:mm");
        String CurrentTime= format.format(calendar.getTime());
        holder.sysPress.setText("SysPress\n"+dataholder.get(position).getSys());
        holder.diasPress.setText("DiasPress\n"+dataholder.get(position).getDias());
        holder.heartRate.setText("heartRate\n"+dataholder.get(position).getHr());
        holder.dataTime.setText(CurrentDate+"  "+CurrentTime);
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView sysPress,diasPress,heartRate,dataTime;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            sysPress=(TextView)itemView.findViewById(R.id.systolic);
            diasPress=(TextView)itemView.findViewById(R.id.diastolic);
            heartRate=(TextView)itemView.findViewById(R.id.heartRate);
            dataTime=(TextView)itemView.findViewById(R.id.dateTime);
        }
    }

}
