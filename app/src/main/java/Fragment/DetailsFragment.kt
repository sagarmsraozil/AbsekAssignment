package Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abishek.database.Adapter.StudentAdapter
import com.abishek.database.R
import com.abishek.database.StudentData


class DetailsFragment : Fragment() {

    private lateinit var recycler : RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_details, container, false)
        recycler = view.findViewById(R.id.recycler)
        var adapter = StudentAdapter(context,StudentData.studentData)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(context)
        return view
    }



}