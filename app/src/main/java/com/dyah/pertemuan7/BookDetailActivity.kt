package com.dyah.pertemuan7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.dyah.pertemuan7.databinding.ActivityBookDetailBinding


class BookDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBookDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val book = intent.getSerializableExtra("book") as Book

        Glide.with(this)
            .load(book.cover)
            .fitCenter()
            .into(binding.imgCoverDetail)

        binding.txtTitleDetail.text = book.title
        binding.txtOriginalDetail.text = book.originalTitle
        binding.txtReleaseDetail.text = book.releaseDate
        binding.txtDescDetail.text = book.description
        binding.txtPagesDetail.text = "Pages: ${book.pages}"
    }
}
