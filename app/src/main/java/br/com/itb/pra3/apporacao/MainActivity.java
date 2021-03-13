package br.com.itb.pra3.apporacao;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define a tela que a classe controla
        setContentView(R.layout.activity_main);
        // Objeto de navegação
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        // Passando como parâmetro cada ID dos layouts dos fragmentos ligados à cada item do menu.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard,
                R.id.navigation_notifications, R.id.navigation_oracao)
                .build();
        // Objeto de container dos fragmentos, este objeto esta ligado ao nav_graph
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        // Estabelecendo o vínculo entre o container e o objeto de controle
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        // Vincular barra de navegação e objeto de controle dos fragmentos
        NavigationUI.setupWithNavController(navView, navController);

    }

}