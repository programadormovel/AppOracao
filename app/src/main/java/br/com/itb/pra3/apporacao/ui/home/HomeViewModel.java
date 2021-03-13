package br.com.itb.pra3.apporacao.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import br.com.itb.pra3.apporacao.ObjetoEstatico;

public class HomeViewModel extends ViewModel {

    // Objeto LiveData
    private MutableLiveData<String> mText;

    // Método construtor do ViewModel
    public HomeViewModel() {
        // Construção do objeto LiveData
        mText = new MutableLiveData<>();
        // Valor do objeto LiveData
        // Aqui podemos capturar os dados do banco de dados, por exemplo
        mText.setValue("texto");
    }

    // Método de recuperação dos dados inseridos no LiveData
    public LiveData<String> getText() {
        return mText;
    }

}