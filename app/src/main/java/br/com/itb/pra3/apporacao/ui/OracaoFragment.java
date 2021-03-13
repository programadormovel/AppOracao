package br.com.itb.pra3.apporacao.ui;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.itb.pra3.apporacao.R;

public class OracaoFragment extends Fragment {

    private OracaoViewModel mViewModel;

    public static OracaoFragment newInstance() {
        return new OracaoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.oracao_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OracaoViewModel.class);
        // TODO: Use the ViewModel



    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Método de acionamento do botão
        view.findViewById(R.id.btnBuscarOracao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar para a janela de fragmento da Oração Selecionada
                NavHostFragment.findNavController(OracaoFragment.this)
                        .navigate(R.id.action_navigation_oracao_to_oracaoEscolhidaFragment);
            }
        });
    }

}