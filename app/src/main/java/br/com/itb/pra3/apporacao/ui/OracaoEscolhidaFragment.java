package br.com.itb.pra3.apporacao.ui;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.itb.pra3.apporacao.R;

public class OracaoEscolhidaFragment extends Fragment {

    private OracaoEscolhidaViewModel mViewModel;

    public static OracaoEscolhidaFragment newInstance() {
        return new OracaoEscolhidaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.oracao_escolhida_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OracaoEscolhidaViewModel.class);
        // TODO: Use the ViewModel
    }

}