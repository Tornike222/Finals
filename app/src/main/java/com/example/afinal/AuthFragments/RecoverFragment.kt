package com.example.afinal.AuthFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.afinal.R
import com.example.afinal.databinding.FragmentRecoverBinding
import com.google.firebase.auth.FirebaseAuth

class RecoverFragment : Fragment() {
    private lateinit var editMail: EditText
    private lateinit var sendButton: Button
    private var _binding: FragmentRecoverBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRecoverBinding.inflate(inflater, container, false)
        val view = binding.root
        init()
        sendButtonListeners()
        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun init(){
        editMail = binding.editMail
        sendButton = binding.sendButton
    }
    fun sendButtonListeners(){
        sendButton.setOnClickListener{
            val mail = editMail.text.toString()
            if (mail.isNotEmpty()) {
                FirebaseAuth.getInstance().sendPasswordResetEmail(mail)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful && mail.isNotEmpty()) {
                            Toast.makeText(activity, "Password Recovery Link Is Sent On Your Mail ", Toast.LENGTH_SHORT).show()
                            findNavController().navigate(RecoverFragmentDirections.actionFragmentRecoverToFragmentLogin())
                        } else {
                            Toast.makeText(activity, "3rror", Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                Toast.makeText(activity, "Mail Space is Empty", Toast.LENGTH_SHORT).show()

            }
            }
        }
    }
