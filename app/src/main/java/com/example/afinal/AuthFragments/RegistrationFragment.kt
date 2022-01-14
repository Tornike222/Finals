package com.example.afinal.AuthFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.afinal.R
import com.example.afinal.databinding.FragmentRegistrationBinding
import com.google.firebase.auth.FirebaseAuth

class RegistrationFragment: Fragment(R.layout.fragment_registration) {
    private lateinit var regButton: Button
    private lateinit var editPassword: EditText
    private lateinit var editPassword2: EditText
    private lateinit var editMail:EditText
    private lateinit var acceptedCheck: CheckBox
    private lateinit var editName: EditText
    private lateinit var editSurname: EditText
    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        val view = binding.root
        init()
        regButtonListeners()

        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun init(){
        regButton = binding.regButton
        editMail = binding.editMail
        acceptedCheck = binding.acceptedCheck
        editPassword = binding.editPassword
        editPassword2 = binding.editPassword2
        editName = binding.editName
        editSurname = binding.editSurname
    }
    fun regButtonListeners(){
        regButton.setOnClickListener {
            if(editName.text.isEmpty()){
                Toast.makeText(activity, "სახელის ველი ცარიელია", Toast.LENGTH_LONG).show()
            }
            else if(editSurname.text.isEmpty()){
                Toast.makeText(activity, "გვარის ველი ცარიელია", Toast.LENGTH_LONG).show()
            }
            else if(editPassword.text.isEmpty()){
                Toast.makeText(activity, "პაროლის ველი ცარიელია", Toast.LENGTH_LONG).show()
            }
            else if(editPassword2.text.isEmpty()) {
                Toast.makeText(activity, "მეორედ ჩასაწერი პაროლის ველი ცარიელია", Toast.LENGTH_LONG).show()
            }
            else if(editMail.text.isEmpty()){
                Toast.makeText(activity, "Mail-ის ჩასაწერი ველი ცარიელია", Toast.LENGTH_LONG).show()
            }
            else if(editMail.text.contains("@") == false){
                Toast.makeText(activity, "შეამოწმე მეილი", Toast.LENGTH_LONG).show()
            }
            else if(editPassword.text.toString() != editPassword2.text.toString()) {
                Toast.makeText(activity, "შეყვანილი პაროლები ერთმანეთს არ ემთხვევა", Toast.LENGTH_LONG).show()
            }
            else if(!acceptedCheck.isChecked){
                Toast.makeText(activity, "დაეთანხმეთ წესებს CheckBox ის მონიშვნით", Toast.LENGTH_LONG).show()
            }else{
                FirebaseAuth.getInstance()
                    .createUserWithEmailAndPassword(editMail.text.toString(), editPassword.text.toString())
                    .addOnCompleteListener{ task ->
                        if(task.isSuccessful){
                            findNavController().navigate(RegistrationFragmentDirections.actionFragmentRegistrationToFragmentLogin())
                            Toast.makeText(activity, "წარმატებით დარეგისტრირდით!", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(activity, "3rror", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
    }
}
}