package unj.cs.hw4.ui.coffeeList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import unj.cs.hw4.databinding.FragmentCoffeeListBinding

class CoffeeListFragment : Fragment() {

    private var _binding: FragmentCoffeeListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val coffeeListViewModel =
            ViewModelProvider(this).get(CoffeeListViewModel::class.java)

        _binding = FragmentCoffeeListBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}