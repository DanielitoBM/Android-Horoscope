package pe.edu.cibertec.horoscapp.ui.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pe.edu.cibertec.horoscapp.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {

    /*
    * si a _binding se le llama invoca a binding
    * */
    private var _binding: FragmentHoroscopeBinding? = null
    private val binding get() = _binding!!

    /*
    * método principal de los fragment
    * */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}