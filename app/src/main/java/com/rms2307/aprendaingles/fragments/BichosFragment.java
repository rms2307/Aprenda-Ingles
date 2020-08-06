package com.rms2307.aprendaingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.rms2307.aprendaingles.R;
import com.rms2307.aprendaingles.util.ConfigSom;

/**
 * a simple {@link Fragment} subclass.
 * Use the {@link BichosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BichosFragment extends Fragment implements View.OnClickListener {

    private ImageButton buttonCao, buttonGato, buttonLeao, buttonMacaco, buttonOvelha, buttonVaca;
    ConfigSom som;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BichosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return a new instance of fragment BichosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BichosFragment newInstance(String param1, String param2) {
        BichosFragment fragment = new BichosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        buttonCao = view.findViewById(R.id.imageButtonCao);
        buttonGato = view.findViewById(R.id.imageButtonGato);
        buttonLeao = view.findViewById(R.id.imageButtonLeao);
        buttonMacaco = view.findViewById(R.id.imageButtonMacaco);
        buttonOvelha = view.findViewById(R.id.imageButtonOvelha);
        buttonVaca = view.findViewById(R.id.imageButtonVaca);

        buttonCao.setOnClickListener(this);
        buttonGato.setOnClickListener(this);
        buttonLeao.setOnClickListener(this);
        buttonMacaco.setOnClickListener(this);
        buttonOvelha.setOnClickListener(this);
        buttonVaca.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        som = new ConfigSom();
        switch (view.getId()) {
            case R.id.imageButtonCao:
                som.tocarSom(getActivity(), R.raw.dog);
                break;
            case R.id.imageButtonGato:
                som.tocarSom(getActivity(), R.raw.cat);
                break;
            case R.id.imageButtonLeao:
                som.tocarSom(getActivity(), R.raw.lion);
                break;
            case R.id.imageButtonMacaco:
                som.tocarSom(getActivity(), R.raw.monkey);
                break;
            case R.id.imageButtonOvelha:
                som.tocarSom(getActivity(), R.raw.sheep);
                break;
            case R.id.imageButtonVaca:
                som.tocarSom(getActivity(), R.raw.cow);
                break;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        som.Destroy();
    }
}