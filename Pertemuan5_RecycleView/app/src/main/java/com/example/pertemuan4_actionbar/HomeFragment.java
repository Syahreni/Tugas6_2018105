package com.example.pertemuan4_actionbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class HomeFragment extends Fragment {


    RecyclerView recylerView;
    String s1[], s2[],s3[];
    int images[] = {R.drawable.dokter_anak,R.drawable.dokter_jantung,R.drawable.dokter_tht};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }
    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recylerView = getActivity().findViewById(R.id.recyclerViewHotel);
        s1 = getResources().getStringArray(R.array.dokter);
        s2 = getResources().getStringArray(R.array.star);
        s3 = getResources().getStringArray(R.array.deskripsi);
        KlinikAdapter appAdapter = new KlinikAdapter(getActivity(), s1, s2, s3, images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL,false));
    }
}


