package com.example.cryptovalue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Menu;

import com.example.cryptovalue.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    NavHostFragment navHostFragment;
    NavController navController;
    AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setupNavigationComponent();
    }

    private void setupNavigationComponent() {
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();

        appBarConfiguration =
//                new AppBarConfiguration.Builder(R.id.homeFragment,R.id.marketFragment,R.id.watchListFragment)
                new AppBarConfiguration.Builder(navController.getGraph())
                        .setOpenableLayout(binding.drawerLayout)
//                        .setDrawerLayout(binding.drawerLayout)
                        .build();

//        NavigationUI.setupWithNavController(binding.navView, navController);

        setupBottomNavigation();
    }

    private void setupBottomNavigation() {
        NavigationUI.setupWithNavController(binding.bottomNav, navController);
    }
}