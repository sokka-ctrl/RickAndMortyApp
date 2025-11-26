package com.example.rickandmortyapp.presintation.main

import android.content.Intent
import android.os.Bundle

import androidx.core.view.isVisible

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rickandmortyapp.databinding.ActivityMainBinding
import com.example.rickandmortyapp.presintation.adapter.CharactersAdapter
import com.example.rickandmortyapp.presintation.base.BaseActivity
import com.example.rickandmortyapp.presintation.detailed.DetailedActivity
import com.example.rickandmortyapp.presintation.viewmodel.CharacterViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.getValue

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CharactersAdapter

    private val viewModel: CharacterViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = CharactersAdapter(
            onClick = { id ->
                val intent = Intent(this, DetailedActivity::class.java)
                intent.putExtra("id", id)
                startActivity(intent) }
        )

        initAdapter()

        viewModel.getCharacters()
        viewModel.characterState.handleState(
            onSuccess = {data ->
                adapter.setData(data)
            },
            onLoading = { isLoading ->
                binding.progressBar.isVisible = isLoading
            }
        )
    }

    private fun initAdapter() = with(binding) {
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = adapter
    }
}