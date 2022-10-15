package unj.cs.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import unj.cs.hw4.adapter.CoffeeAdapter
import unj.cs.hw4.data.Coffee

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CoffeeListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CoffeeListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: CoffeeAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var coffeeArrayList: ArrayList<Coffee>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coffee_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataSource()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_coffee_list)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = CoffeeAdapter(coffeeArrayList)
        recyclerView.adapter = adapter
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CoffeeListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CoffeeListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    private fun dataSource() {

        coffeeArrayList = arrayListOf<Coffee>(
            Coffee(R.drawable.coffee1, getString(R.string.coffee_title_1), getString(R.string.coffee_desc_1)),
            Coffee(R.drawable.coffee2, getString(R.string.coffee_title_2), getString(R.string.coffee_desc_2)),
            Coffee(R.drawable.coffee3, getString(R.string.coffee_title_3), getString(R.string.coffee_desc_3)),
            Coffee(R.drawable.coffee4, getString(R.string.coffee_title_4), getString(R.string.coffee_desc_4)),
            Coffee(R.drawable.coffee5, getString(R.string.coffee_title_5), getString(R.string.coffee_desc_5)),
            Coffee(R.drawable.coffee6, getString(R.string.coffee_title_6), getString(R.string.coffee_desc_6)),
            Coffee(R.drawable.coffee7, getString(R.string.coffee_title_7), getString(R.string.coffee_desc_7)),
            Coffee(R.drawable.coffee8, getString(R.string.coffee_title_8), getString(R.string.coffee_desc_8)),
            Coffee(R.drawable.coffee9, getString(R.string.coffee_title_9), getString(R.string.coffee_desc_9)),
            Coffee(R.drawable.coffee10, getString(R.string.coffee_title_10), getString(R.string.coffee_desc_10))
        )

    }

}