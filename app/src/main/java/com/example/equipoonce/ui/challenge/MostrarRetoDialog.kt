package com.example.equipoonce.ui.challenge

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.equipoonce.databinding.DialogMostrarRetoBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MostrarRetoDialog : DialogFragment() {

    private var _binding: DialogMostrarRetoBinding? = null
    private val binding get() = _binding!!

    // TODO: recibir RetoEntity via Bundle y cargar imagen de Pokémon con Coil

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        _binding = DialogMostrarRetoBinding.inflate(layoutInflater)
        return MaterialAlertDialogBuilder(requireContext())
            .setView(binding.root)
            .setPositiveButton("Hecho") { _, _ ->
                // TODO: registrar reto como completado y llamar a obtenerRetoAleatorio
            }
            .setNegativeButton("Pasar", null)
            .create()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "MostrarRetoDialog"
    }
}
