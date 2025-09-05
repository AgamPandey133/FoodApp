package com.example.foodapp


//import android.arch.lifecycle.Observer
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.foodapp.activities.MealActivity
import com.example.foodapp.databinding.FragmentHomeBinding
import com.example.foodapp.videoModel.HomeViewModel

//// TODO: Rename parameter arguments, choose names that match
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"
//
///**
// * A simple [Fragment] subclass.
// * Use the [homeFragment.newInstance] factory method to
// * create an instance of this fragment.
// */
class homeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeMvvm:HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        homeMvvm = ViewModelProviders.of(this)[HomeViewModel::class.java]
        homeMvvm = ViewModelProvider(this)[HomeViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeMvvm.getRandomMeal()
        observeRandomMeal()

    }

    private fun onRandomMealClick(){
        binding.randomMealCard.setOnClickListener{
            val intend = Intent(activity, MealActivity::class.java)
            startActivity(intend)
        }
    }

//    private fun observeRandomMeal() {
//        homeMvvm.observeRandomMealLiveData().observe(viewLifecycleOwner,object : Observer<Meal>{
//            override fun onChanged(t: Meal?){
//                if (t != null) {
//                    Glide.with(this@homeFragment)
//                        .load(t.strMealThumb)
//                        .into(binding.imgRandomMeal)
//                }
//            }
//        })
//    }

    private fun observeRandomMeal() {
        homeMvvm.observeRandomMealLiveData().observe(viewLifecycleOwner) { meal ->
            meal?.let {
                Glide.with(requireContext())
                    .load(it.strMealThumb)
                    .into(binding.imgRandomMeal)
            }
        }
    }
}