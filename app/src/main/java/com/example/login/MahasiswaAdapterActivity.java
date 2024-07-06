package com.example.login;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.transition.Hold;

import java.util.List;

public class MahasiswaAdapterActivity extends RecyclerView.Adapter<MahasiswaViewHolder>
{
    private List<MahasiswaModel> _mahasiswaModelList;

    public MahasiswaAdapterActivity(List<MahasiswaModel> mahasiswaModelList){
        this._mahasiswaModelList = mahasiswaModelList;
    }

    public void filter(List<MahasiswaModel> filteredList){
        this._mahasiswaModelList = filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.list_mahasiswa, parent, false);
        return new MahasiswaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {

        int no = position + 1;
        holder._noTextView.setText(no + ".");

        MahasiswaModel mm = _mahasiswaModelList.get(position);

        holder._jkImageView.setImageResource(R.drawable.iconlaki);
        if(mm.getJenisKelamin().equalsIgnoreCase("perempuan")){
            holder._jkImageView.setImageResource(R.drawable.iconperempuan);
        }

        holder._nimTextView.setText(mm.getNIM());
        holder._namaTextView.setText(mm.getNama());
        holder._jkTextView.setText(mm.getJenisKelamin());

        String jp = mm.getJP();
        jp = jp.substring(0, 2);
        holder._jpTextView.setText(jp);

        if(jp.equals("TI")){
            holder._jpTextView.setBackgroundColor(Color.BLUE);
        }
        else if(jp.equals("SI")){
            holder._jpTextView.setBackgroundColor(Color.RED);
        }
        else{
            holder._jpTextView.setBackgroundColor(Color.GRAY);
        }
    }

    @Override
    public int getItemCount() {
        int count = (_mahasiswaModelList != null) ? _mahasiswaModelList.size() : 0;
        return count;
    }
}