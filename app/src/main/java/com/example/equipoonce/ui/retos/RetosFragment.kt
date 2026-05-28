package com.example.equipoonce.ui.retos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.equipoonce.databinding.FragmentRetosBinding
import com.example.equipoonce.ui.retos.dialogs.AgregarRetoDialog
import com.example.equipoonce.ui.retos.dialogs.EditarRetoDialog
import com.example.equipoonce.ui.retos.dialogs.EliminarRetoDialog

class RetosFragment : Fragment() {

    private var _binding: FragmentRetosBinding? = null
    private val binding get() = _binding!!

    // TODO: instanciar RetosViewModel con ViewModelFactory cuando esté implementado

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRetosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO: configurar RecyclerView con RetosAdapter
        // TODO: observar retos del ViewModel con lifecycleScope.launch + collect
        // TODO: conectar FAB con AgregarRetoDialog
        binding.fabAgregarReto.setOnClickListener {
            AgregarRetoDialog().show(parentFragmentManager, AgregarRetoDialog.TAG)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
