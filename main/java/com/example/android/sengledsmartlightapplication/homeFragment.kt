package com.example.android.sengledsmartlightapplication

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.sengledsmartlightapplication.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [homeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class homeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater, R.layout.fragment_home, container, false)

        binding.toggleButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_homeFragmentOn)
            Log.i("TAG","IT WAS CLICKED, CLOD")
        }

        //setHasOptionsMenu(true)
        return binding.root
    }

    /*
    * Reference for integrating toolbar: https://stackoverflow.com/questions/29020935/using-toolbar-with-fragments
    * From: Phan Van Linh
     */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //toolbar_home.setNavigationIcon(R.drawable.)
        toolbar_home.setNavigationOnClickListener {

        }

        toolbar_home.inflateMenu(R.menu.options_menu)
        toolbar_home.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.homeFragment_action -> {
                    view.findNavController().navigate(R.id.action_homeFragment_to_optionPage2)
                    true
                }
                R.id.homeFragment_actionTwo -> {
                    view.findNavController().navigate(R.id.action_homeFragment_to_contactPage)
                    true
                }
                else -> {
                    super.onOptionsItemSelected(it)
                }
            }
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment homeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            homeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}