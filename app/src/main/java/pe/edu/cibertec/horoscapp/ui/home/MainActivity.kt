package pe.edu.cibertec.horoscapp.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import pe.edu.cibertec.horoscapp.R
import pe.edu.cibertec.horoscapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initIU()
    }

    private fun initIU() {
        iniNavitagion()
    }

    private fun iniNavitagion() {

        //poner "as NavHosFragment" para castear
        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        //a  navController se le asigna "navHost.navController" para que controle el fragmene fragmentContainerView
        navController = navHost.navController
        binding.bottomNavView.setupWithNavController(navController)
    }
}