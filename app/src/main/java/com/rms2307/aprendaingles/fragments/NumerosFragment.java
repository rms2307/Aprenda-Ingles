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
 * A simple {@link Fragment} subclass.
 * Use the {@link NumerosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NumerosFragment extends Fragment implements  View.OnClickListener{

    private ImageButton buttonUm, buttonDois, buttonTres, buttonQuatro, buttonCinco, buttonSeis;
    ConfigSom som;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NumerosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NumerosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NumerosFragment newInstance(String param1, String param2) {
        NumerosFragment fragment = new NumerosFragment();
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
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        buttonUm = view.findViewById(R.id.imageButtonUm);
        buttonDois = view.findViewById(R.id.imageButtonDois);
        buttonTres = view.findViewById(R.id.imageButtonTres);
        buttonQuatro = view.findViewById(R.id.imageButtonQuatro);
        buttonCinco = view.findViewById(R.id.imageButtonCinco);
        buttonSeis = view.findViewById(R.id.imageButtonSeis);

        buttonUm.setOnClickListener(this);
        buttonDois.setOnClickListener(this);
        buttonTres.setOnClickListener(this);
        buttonQuatro.setOnClickListener(this);
        buttonCinco.setOnClickListener(this);
        buttonSeis.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View view) {
        som = new ConfigSom();
        switch (view.getId()) {
            case R.id.imageButtonUm:
                som.tocarSom(getActivity(), R.raw.one);
                break;
            case R.id.imageButtonDois:
                som.tocarSom(getActivity(), R.raw.two);
                break;
            case R.id.imageButtonTres:
                som.tocarSom(getActivity(), R.raw.three);
                break;
            case R.id.imageButtonQuatro:
                som.tocarSom(getActivity(), R.raw.four);
                break;
            case R.id.imageButtonCinco:
                som.tocarSom(getActivity(), R.raw.five);
                break;
            case R.id.imageButtonSeis:
                som.tocarSom(getActivity(), R.raw.six);
                break;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        som.Destroy();
    }
}