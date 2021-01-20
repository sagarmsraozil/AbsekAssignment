package Fragment

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import com.abishek.database.R


class StudentFragment : Fragment() {

    private lateinit var etFn: EditText
    private lateinit var etAge: EditText
    private lateinit var rgGroup : RadioGroup
    private lateinit var etAddress: EditText
    private lateinit var etprofile: EditText
    private lateinit var btnSave: Button
    var gender = "Male"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root= inflater.inflate(R.layout.fragment_student, container, false)
        etFn = root.findViewById(R.id.etFn)
        etAge = root.findViewById(R.id.etAge)
        rgGroup = root.findViewById(R.id.radioGroup)
        etAddress = root.findViewById(R.id.etAddress)
        etprofile = root.findViewById(R.id.etprofile)
        btnSave = root.findViewById(R.id.btnSave)

        rgGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId)
            {
                R.id.rbMale ->{
                    gender = "Male"
                }
                R.id.rbFemale ->{
                    gender = "Female"
                }
                R.id.rbOther ->{
                    gender = "Others"
                }
            }
        }

        return root
    }
//    private fun clear(){
//        etFn.text!!.clear()
//        etAge.text!!.clear()
//        etAddress.text!!.clear()
//        etprofile.text!!.clear()
//    }
//    private fun validation():Boolean{
//        if (TextUtils.isEmpty(etFn.text)){
//            etFn.error="Enter the firstname"
//            etFn.requestFocus()
//            return false
//        }
//        else if (TextUtils.isEmpty(etAge.text)){
//            etAge.error="Enter the Age"
//            etAge.requestFocus()
//            return false
//        }
//        else if (TextUtils.isEmpty(etAddress.text)){
//            etAddress.error="Enter the Address"
//            etAddress.requestFocus()
//            return false
//        }
//        else if (TextUtils.isEmpty(etprofile.text)){
//            etprofile.error="Enter the Profile Picture"
//            etprofile.requestFocus()
//            return false
//        }
//        else{
//            return true
//        }
//    }
//    private fun alert(title:String,msg:String)
//    {
//        var builder = AlertDialog.Builder(context)
//        builder.setTitle(title)
//        builder.setMessage(msg)
//        builder.setNeutralButton("Ok"){
//            dialog: DialogInterface?, which: Int ->
//        }
//        val al = builder.create()
//        al.setCancelable(false)
//        al.show()
//    }
    }



