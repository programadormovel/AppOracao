package br.com.itb.pra3.apporacao.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import br.com.itb.pra3.apporacao.ObjetoEstatico;
import br.com.itb.pra3.apporacao.R;

public class HomeFragment extends Fragment {

    // Objeto View Model
    private HomeViewModel homeViewModel;
    private EditText caixaDeTexto;

    // Método de criação do layout em tempo de execução
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Construção do objeto View Model
        homeViewModel = new ViewModelProvider(this)
                .get(HomeViewModel.class);
        // Definição do layout de Fragmento que será controlado pela classe Java
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        // Objeto label
        final TextView textView = root.findViewById(R.id.text_home);
        // Método observador, garante a persistência dos dados da caixa de texto
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        // Vínculo do objeto do tipo EditText com o objeto da janela (Fragmento)
        caixaDeTexto = root.findViewById(R.id.edtTexto);

        return root;
    }

}